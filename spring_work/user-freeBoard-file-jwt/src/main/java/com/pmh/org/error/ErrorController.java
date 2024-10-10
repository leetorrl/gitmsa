package com.pmh.org.error;

import jakarta.validation.ConstraintDeclarationException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLIntegrityConstraintViolationException;
import java.time.LocalDateTime;
import java.util.Arrays;

@ControllerAdvice
public class ErrorController {

 @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
 public ResponseEntity<ErrorResponse> sQLIntegrityConstraintViolationException(SQLIntegrityConstraintViolationException e){

     ErrorResponse errorResponse = ErrorResponse.builder()
             .message(e.getMessage())
             .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
             .localDateTime(LocalDateTime.now())
             .build();

     return ResponseEntity
             .status(errorResponse.getHttpStatus())
             .body(errorResponse);

 }
    // email 중복
    // username 안넣을때
    // email 안넣었을때

    @ExceptionHandler(BizException.class)
    public ResponseEntity<ErrorResponse> mException(BizException e){
        ErrorResponse errorResponse = ErrorResponse.builder()
                .message(e.getErrorCode().getMessage())
                .httpStatus(e.getErrorCode().getHttpStatus())
                .localDateTime(LocalDateTime.now())
                .build();

        return ResponseEntity
                .status(errorResponse.getHttpStatus())
                .body(errorResponse);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> validityException(MethodArgumentNotValidException e){

        System.out.println(e.getBody());
        System.out.println(Arrays.toString(e.getDetailMessageArguments())); //오류의 주 내용...

        String msg =(String) Arrays.stream(e.getDetailMessageArguments())
                .reduce("",(o,o2)-> o.toString()+o2.toString());

        ErrorResponse errorResponse = ErrorResponse.builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .message(msg)
                .localDateTime(LocalDateTime.now())
                .build();

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorResponse);

    }


    @ExceptionHandler(ConstraintDeclarationException.class)
    public ResponseEntity<ErrorResponse> constraintException(ConstraintViolationException e){

        e.getConstraintViolations()
                .stream()
                .map(constraintViolation -> constraintViolation.getMessage())
                .reduce("",(s, s2)-> s+s2);

//        String msg =(String) Arrays.stream(e.getMessage())
//                .reduce("",(o,o2)-> o.toString()+o2.toString());



//        Set<ConstraintViolation<?>> set = e.getConstraintViolations();
//
//
//        오류가 다중으로 발생시 for부문으로 모두 출력 가능..
//        String test = "";
//        for(ConstraintViolation<?> item : set){
//            System.out.println(item);
//            System.out.println(item.getMessage());
//            test = item.getMessage();
//        }
//
//        System.out.println(test);



        ErrorResponse errorResponse = ErrorResponse.builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .message(e.getMessage())
                .localDateTime(LocalDateTime.now())
                .build();

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorResponse);

    }

}
