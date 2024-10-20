package com.example.firstproject.api;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleApiController {
//
//    private static final Logger log = LoggerFactory.getLogger(ArticleApiController.class);
    @Autowired
    private ArticleService articleService;

//
    //GET
    @GetMapping("/api/articles")
    public List<Article> index(){

        return articleService.index();

    }
//
//
    @GetMapping("/api/articles/{id}")
    public Article show(@PathVariable(value = "id") Long id){

        return articleService.show(id);
    }
//
    //POST
    @PostMapping("/api/articles")
    public ResponseEntity<Article> create(@RequestBody ArticleForm dto){

        Article created = articleService.create(dto);

        return (created != null) ?
                ResponseEntity.status(HttpStatus.OK).body(created) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
//
    //PATCH
    @PatchMapping("/api/articles/{id}")
    public ResponseEntity<Article> update(@PathVariable(value = "id") Long id,
                          @RequestBody ArticleForm dto){


        Article updated = articleService.update(id, dto);

        return (updated !=null) ?
                ResponseEntity.status(HttpStatus.OK).body(updated) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

    }
//
//
    //DELETE
    @DeleteMapping("/api/articles/{id}")
    public ResponseEntity<Article> delete(@PathVariable(value = "id") Long id){

        Article delete = articleService.delete(id);

        return (delete !=null) ?
                ResponseEntity.status(HttpStatus.NO_CONTENT).body(delete) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

//이거 보내도됨
    }

    @PostMapping("/api/transaction-test")
    public ResponseEntity<List<Article>> transactionTest(@RequestBody List<ArticleForm> dtos){

        List<Article> createdList = articleService.createArticles(dtos);

        return (createdList !=null) ?
                ResponseEntity.status(HttpStatus.OK).body(createdList) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
