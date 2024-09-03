package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex02 {

    public static void main(String []args) throws IOException {

//        Files.createFile(Paths.get("d:/a/b/myfile")); //파일생성(존재시 에러)

        Files.createFile(Paths.get("d:/a/b/c/myfile")); //경로가 반드시 맞아야함

        Files.createDirectory(Paths.get("d:/a/bbb")); // 새 폴더 생성

    }
}
