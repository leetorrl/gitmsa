package com.pmh.ex09.FreeBoard;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("freeboard")
@RequiredArgsConstructor
@CrossOrigin
public class FreeBoardController {

    private final FreeBoardRepository freeBoardRepository;

    @GetMapping
    public ResponseEntity<FreeBoardResponsePageDto> findAll(){

//        List<FreeBoard> list = freeBoardRepository.findAll();

        Sort sort = Sort.by(Sort.Direction.DESC,"idx");

        int pageNum = 0;
        int size = 10;

        Pageable pageable = PageRequest.of(pageNum,size,sort);

        Page<FreeBoard> page = freeBoardRepository.findAll(pageable);


        System.out.println("elements = "+page.getTotalElements());
        System.out.println("pages = "+page.getTotalPages());

        FreeBoardResponsePageDto freeBoardResponsePageDto =
                new ModelMapper()
                        .map(page, FreeBoardResponsePageDto.class);

        return ResponseEntity.ok(freeBoardResponsePageDto);

    }

    @PostMapping
    public  ResponseEntity<FreeBoard> save(@RequestBody FreeBoardReqDto freeBoardReqDto){

        FreeBoard freeBoard = new ModelMapper().map(freeBoardReqDto,FreeBoard.class);


        freeBoardRepository.save(freeBoard);

        return ResponseEntity.status(200).body(freeBoard);
    }
}
