package com.ryan.toyproject.service;

import com.ryan.toyproject.dto.ArticleForm;
import com.ryan.toyproject.entity.Article;
import com.ryan.toyproject.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public void saveNewArticle(ArticleForm articleForm) {
        Article newArticle = articleForm.toEntity();
        articleRepository.save(newArticle);
    }

    public List<Article> getArticleList() {
        return articleRepository.findAll();
    }
}
