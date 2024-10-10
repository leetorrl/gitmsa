package com.pmh.org.login.jwt;

import com.pmh.org.login.LoginUserDetails;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class JWTFilter extends OncePerRequestFilter {

    private final JWTManager jwtManager;

    public JWTFilter(JWTManager jwtManager) {
        this.jwtManager = jwtManager;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)

            throws ServletException, IOException {


        System.out.println("요기에 무조건 지나간다");

        String auth = request.getHeader(HttpHeaders.AUTHORIZATION);
        System.out.println(" auth ="+auth);

        //인증 토큰인 JWT가 NULL이거나 Bearer로 시작하는 토큰이 아니면...
        if(auth == null || !auth.startsWith("Bearer")){
            filterChain.doFilter(request,response);
            return; //리턴 빼먹었음
        }


//        jwtManager.validJWT(auth);


    try{

        //        String token = auth.substring(7); //7번째 뛰어쓰기 삭제하고 토큰으로 인식
        String token = auth.split(" ")[1]; //공백 제거 둘중 하나쓸것..뛰어쓰기 해야됨

        Jws<Claims> claims = jwtManager.getClaims(token);

        String email = claims.getPayload().get("email").toString();
        String role = "ADMIN";
//        String role = claims.getPayload().get("role").toString();


        LoginUserDetails loginUserDetails = new LoginUserDetails(email,null,role);

        Authentication authentication = new UsernamePasswordAuthenticationToken(
                loginUserDetails, null, loginUserDetails.getAuthorities()
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

    }catch(Exception e){
        e.printStackTrace();

    }

        // 여기서 무조건 지나가는
        filterChain.doFilter(request,response);
    }
}