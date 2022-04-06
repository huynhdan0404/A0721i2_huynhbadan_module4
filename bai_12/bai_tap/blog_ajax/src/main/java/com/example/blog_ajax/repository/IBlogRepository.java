package com.example.blog_ajax.repository;

import com.example.blog_ajax.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Blob;

public interface IBlogRepository extends JpaRepository<Blog,Long> {

     @Query(value="SELECT  * FROM blog WHERE  name LIKE concat('%',?1,'%') ",
             countQuery= "SELECT  count(*) from blog WHERE  name LIKE concat('%',?1,'%')",
             nativeQuery=true)
    Page<Blog> searchByName(String name, Pageable pageable);
}
