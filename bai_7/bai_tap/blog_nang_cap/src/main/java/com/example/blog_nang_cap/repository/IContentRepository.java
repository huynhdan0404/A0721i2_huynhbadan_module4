package com.example.blog_nang_cap.repository;

import com.example.blog_nang_cap.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContentRepository extends JpaRepository<Content,Long> {
}
