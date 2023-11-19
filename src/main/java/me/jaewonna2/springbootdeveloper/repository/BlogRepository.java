package me.jaewonna2.springbootdeveloper.repository;

import me.jaewonna2.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
