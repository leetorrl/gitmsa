package com.pmh.ex11.file;

import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

@RestController
@RequestMapping("file")
@CrossOrigin
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

    @PostMapping(value = "upload", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String upload(@RequestPart(name = "file")MultipartFile file,
                         @RequestPart(name = "fileDto")HashMap<String, String> map) {
        System.out.println(map);
        System.out.println(file);

        return "upload";
    }

}

@Data
class FileDto{
    private String name;
}