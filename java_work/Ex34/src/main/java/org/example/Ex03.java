package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Ex03 {

    public static void main(String[] args) throws IOException {

        Path fp = Paths.get("d:/a/b/newtest");

        boolean test = Files.exists(fp);

        System.out.println("파일존재 유무 = "+test);

        //파일이 있으면 createFile하면 안됨
        //파일이 없으면 createFile해야됨

        if(!test){
        fp = Files.createFile(fp);

        System.out.println("fales뜨면 보임");}

        byte[] buf = {0x15, 0x16, 0x17};
        System.out.println(Arrays.toString(buf));

        Files.write(fp,buf,StandardOpenOption.CREATE,StandardOpenOption.APPEND);

        byte[] buf2 = Files.readAllBytes(fp);
        System.out.println(Arrays.toString(buf2));
    }
}
