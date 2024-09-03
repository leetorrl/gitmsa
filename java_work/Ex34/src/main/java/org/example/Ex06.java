package org.example;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex06 {

    public static void main(String[] args) {

        Path path = Paths.get("cc");


        try(OutputStream outputStream = Files.newOutputStream(path)){
            outputStream.write(10); //줄바꿈
            outputStream.write(65); //대문자A
            outputStream.write(10);
            outputStream.write(65);

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("오류발생");
        }

//        try(OutputStream outputStream = new FileOutputStream("aa")){
//
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("오류발생");
//        }
    }
}
