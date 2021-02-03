package com.ryan.toyproject.controller;

import com.ryan.toyproject.dto.ArticleForm;
import com.ryan.toyproject.entity.Article;
import com.ryan.toyproject.repository.ArticleRepository;
import com.ryan.toyproject.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping(value = "/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping(value = "/articles/create")
    public String createArticle(ArticleForm articleForm) {
        articleService.saveNewArticle(articleForm);
        return "articles/new";
    }

    @GetMapping(value = "/articles/list")
    public String articleList(Model model) {
        List<Article> articleList = articleService.getArticleList();
        model.addAttribute("articleList", articleList);
        return "articles/list";
    }

}
