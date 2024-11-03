package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.dto.CommentDto;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Slf4j //로깅을 위한 어노테이션
@Controller
@CrossOrigin
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private CommentService commentService;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {

//         System.out.println(form.toString());

        // 1. DTO를 엔티티로 변환

        System.out.println(form.getTitle());
        System.out.println(form.getContent());

        Article article = form.toEntity();
log.info(article.toString());
//         System.out.println(article.toString());

        // 2. 리파지터리로 엔티티를 DB에 저장
        Article saved = articleRepository.save(article);
log.info(saved.toString());
//         System.out.println(saved.toString());

        return "redirect:/articles/"+saved.getId();
    }

    @GetMapping("/articles/{id}")
    public String show(@PathVariable(value = "id") Long id, Model model){
        log.info("id = "+id);
        //1. id를 조회해 데이터 가져오기
        Article articleEntity = articleRepository.findById(id).orElse(null);
//        Optional<Article> articleEntity = articleRepository.findById(id);
        //두개 같은 명령어

        List<CommentDto> commentDtos = commentService.comments(id);

        //2. 모델에 데이터 등록하기
        model.addAttribute("article", articleEntity);
        model.addAttribute("commentDtos", commentDtos);
        //3. 뷰 페이지 반환하기
        return "articles/show";
    }
    @GetMapping("/articles")
    public String index(Model model){

        //1.모든 데이터 가져오기
         List<Article> articleEntityList = articleRepository.findAll();
//        ArrayList<Article> articleArrayEntityList = articleEntityList.findAll();
//        둘이 같음

        //2.모델에 데이터 등록하기
model.addAttribute("articleList", articleEntityList);

        //3.뷰 페이지 설정하기
        return "articles/index";
    }


    @GetMapping("/articles/{id}/edit")
    public String edit(@PathVariable(value = "id") Long id, Model model){

        System.out.println(" edit id ="+id);

        //수정할 데이터 가져오기
        Article articleEntity = articleRepository.findById(id).orElse(null);

        //모델에 데이터 등록
        model.addAttribute("article",articleEntity);

        //뷰 페이지 설정하기
        return "articles/edit";
    }

    @PostMapping("/articles/update")
    public String update(ArticleForm form){
        log.info(form.toString());

        //1. DTO를 엔티티로 변환하기
        Article articleEntity = form.toEntity();
        log.info(articleEntity.toString());

        //2. 엔티티를 DB에 저장하기
        //2-1 기존데이터값 가져오기
        Article target = articleRepository.findById(articleEntity.getId()).orElse(null);
        //2-2 기존 데이터 값을 갱신하기
        if(target != null){//target값이 null이 아니라면 기본데이터가 있다면 그곳에 저장
            articleRepository.save(articleEntity);
        }

        //3. 수정 결과 페이지로 리다이렉트하기
        return "redirect:/articles/"+articleEntity.getId();
    }

    @GetMapping("/articles/{id}/delete")
    public String delete(@PathVariable(value = "id") Long id , RedirectAttributes rttr){
        log.info("삭제 요청이 들어왔습니다");

        //1. 삭제할 대상 가져오기
        Article target = articleRepository.findById(id).orElse(null);
        log.info(target.toString());

        //2. 대상 엔티티 삭제하기
        if(target != null){
            articleRepository.delete(target);
            rttr.addFlashAttribute("msg", "삭제됐습니다.");
        }


        //3. 결과 페이지로 리다이렉트하기

        return "redirect:/articles";
    }
}



