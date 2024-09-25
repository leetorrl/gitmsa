package com.pmh.ex11.file;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

@RestController
@RequestMapping("file")
@CrossOrigin
public class FileController {


    private final FileRepository fileRepository;
    private final Path imagePath;
    private final ModelMapper modelMapper;

    @Autowired
    public FileController(FileRepository fileRepository, ModelMapper modelMapper) {
       this.imagePath = Paths.get("ex11/images/file/").toAbsolutePath();
       this.fileRepository = fileRepository;
       this.modelMapper = modelMapper;


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
                         @RequestPart(name = "fileDto") FileReqDto fileReqDto) {
        try {
//            System.out.println(fileReqDto);
//            System.out.println(file);
//
//            System.out.println(file.getOriginalFilename());
//            System.out.println(imagePath.toAbsolutePath());
//
            String myFilePath = imagePath.toAbsolutePath().toString() + "\\" + file.getOriginalFilename();
//            System.out.println(myFilePath);

            File saveFile = new File(myFilePath);
            file.transferTo(saveFile); //전송 save랑 비슷함

            FileEntity fileEntity = modelMapper.map(fileReqDto, FileEntity.class);
            fileRepository.save(fileEntity);

        }catch (Exception e){
            e.printStackTrace();
        }

            return "upload";
        }
    }


