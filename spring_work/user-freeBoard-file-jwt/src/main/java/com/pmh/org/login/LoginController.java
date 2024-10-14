package com.pmh.org.login;

import com.pmh.org.login.jwt.JWTManager;
import com.pmh.org.user.User;
import com.pmh.org.user.UserRepository;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class LoginController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final LoginService loginService;
private  final JWTManager jwtManager;

    @PostMapping("/join")
    public ResponseEntity<String> join(@RequestBody JoinDto joinDto) {
//        System.out.println(joinDto);

        loginService.join(joinDto);

        return ResponseEntity.ok("success");
    }

    @GetMapping("/login")
    public ResponseEntity<String> redirectWithPost(
            @RequestParam("email") String email,
            // 1234원래글자
            @RequestParam("password") String password,
            HttpServletResponse response) throws IOException {

        User user = userRepository.findByEmail(email).orElseThrow(
                ()-> new UsernameNotFoundException(email));

        boolean isMatch = passwordEncoder.matches(password, user.getPassword());

        System.out.println("암호화한 패스워드 = ");
        System.out.println(password);
        System.out.println("db 패스워드 = ");
        System.out.println(user.getPassword());


        System.out.println(isMatch);


        if(isMatch){

          String jwt = jwtManager.createJWT(user.getEmail(), user.getRole());
          return  ResponseEntity.ok(jwt);
        }else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("이메일과 패스워드 확인 부탁");
        }
    }

    @GetMapping("/check")
    public ResponseEntity<User> check(
            @RequestParam("jwt") String jwt,
            // 1234원래글자
            HttpServletResponse response) throws IOException {

        System.out.println(jwt);

        //jwt 가 유효한지..유효하지 않으면 exception발생
        Jws<Claims> claimsJws = jwtManager.getClaims(jwt);

        //jwt 가 유효하면 email 가져오기
        String email = claimsJws.getPayload().get("email").toString();

        //email로 db테이블 조회
        User user = userRepository.findByEmail(email).orElseThrow(
                ()-> new UsernameNotFoundException(email)
        );

        return ResponseEntity.ok(user);
    }
}
