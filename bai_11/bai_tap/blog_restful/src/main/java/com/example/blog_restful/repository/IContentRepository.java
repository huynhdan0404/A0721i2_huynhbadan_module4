package com.example.blog_restful.repository;


import com.example.blog_restful.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContentRepository extends JpaRepository<Content,Long> {
}
