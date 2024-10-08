package com.pmh.org.login;

import com.pmh.org.jwt.JWTManager;
import com.pmh.org.user.User;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.swing.*;
import java.io.IOException;

public class LoginFilter extends UsernamePasswordAuthenticationFilter {


    private final AuthenticationManager authenticationManager;

    private final JWTManager jwtManager;



    public LoginFilter(AuthenticationManager authenticationManager,
                       JWTManager jwtManager) {

        this.setFilterProcessesUrl("/login");
        this.authenticationManager = authenticationManager;
        this.jwtManager = jwtManager;

    }

    //로그인 시도할때 호출 되는 메서드
    @Override
    public Authentication attemptAuthentication(
            HttpServletRequest request,
            HttpServletResponse response)
            throws AuthenticationException {

        System.out.println("로그인 시도");
//        return null;

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        System.out.println("email = "+ email);
        System.out.println("password = "+ password);


        UsernamePasswordAuthenticationToken token =
                new UsernamePasswordAuthenticationToken(email,password);

        return authenticationManager.authenticate(token);

    }
    // login success -> JWT 토큰발행
    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {

//        System.out.println(authResult);
//
//        System.out.println(authResult.getPrincipal().toString());
//        System.out.println(authResult.getCredentials().toString());
//        System.out.println(authResult.getAuthorities().toString());
//
//        System.out.println("성공");

        UserDetails userDetails = (UserDetails) authResult.getPrincipal();

//        String role = userDetails.getAuthorities().stream().map(grantedAuthority -> grantedAuthority.toString()).toString();

        String role = "";
        for (var auth : userDetails.getAuthorities()){
            role = auth.getAuthority();
        }
        System.out.println("role = "+role);

        String jwt = jwtManager.createJWT(userDetails.getUsername(), role);
//        super.successfulAuthentication(request, response, chain, authResult);
        response.getWriter().write("success"+ jwt);
    }

    // login fail -> username password 를 확인하세요..
    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request,
                                              HttpServletResponse response,
                                              AuthenticationException failed) throws IOException, ServletException {

        System.out.println("실패");
//        super.unsuccessfulAuthentication(request, response, failed);
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.getWriter().write("plz check email and password");
    }


}
