package com.pmh.ex11.file;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("file")
public class FileController {

    private final Path imagePath;

    public FileController() {
       this.imagePath = Paths.get("ex11/images/file/").toAbsolutePath();

       try{

           Files.createDirectories(this.imagePath);

       } catch (IOException e){
           e.printStackTrace();
       }


        System.out.println(this.imagePath);
    }

    @GetMapping("test")
    public String test(){
        return "test";
    }

    @PostMapping("upload")
    public String upload(@RequestParam("file")MultipartFile file) {
        System.out.println(file);

        return "upload";
    }

}
