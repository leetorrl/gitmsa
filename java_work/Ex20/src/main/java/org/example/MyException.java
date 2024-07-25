package org.example;

public class MyException extends RuntimeException{

    public MyException(ErrorCode errorCode){
        super(errorCode.getMessage());
    }
}
