package com.example.blog_restful.controller;


import com.example.blog_restful.model.Blog;
import com.example.blog_restful.model.Content;
import com.example.blog_restful.service.IBlogService;
import com.example.blog_restful.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private IContentService contentService;

    @GetMapping("/blogs")
    public ResponseEntity<Iterable<Blog>> getBlogList(){
        List<Blog> blogs = (List<Blog>) blogService.findAll();
//        List<Content> contents = (List<Content>) contentService.findAll();
        if (blogs.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs,HttpStatus.OK);

    }

    @GetMapping("/categorys")
    public ResponseEntity<Iterable<Content>> getContentList(){
//        List<Blog> blogs = (List<Blog>) blogService.findAll();
        List<Content> contents = (List<Content>) contentService.findAll();
        if (contents.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contents,HttpStatus.OK);

    }

//    @GetMapping("/create-blog")
//    public ModelAndView showCreateForm(Model model) {
////        ModelAndView modelAndView = new ModelAndView("/create");
////        modelAndView.addObject("blog", new Blog());
////        return modelAndView;
//        List<Content> contents = contentService.findAll();
//        model.addAttribute("contents",contents);
//        return new ModelAndView("/create", "blog", new Blog());
//    }
//    @PostMapping("/create-blog")
//    public ModelAndView saveCustomer(@ModelAttribute("blog") Blog blog) {
//        blogService.save(blog);
//
//        ModelAndView modelAndView = new ModelAndView("/create");
//        modelAndView.addObject("blog", new Blog());
//        List<Content> contents = contentService.findAll();
//        modelAndView.addObject("contents", contents);
//        modelAndView.addObject("message", "New song created successfully");
//        return modelAndView;
//    }

//    @GetMapping("/delete-blog/{id}")
//    public ModelAndView showDeleteForm(@PathVariable Long id){
//        Blog blog = blogService.findById(id);
//        if(blog != null) {
//            ModelAndView modelAndView = new ModelAndView("/delete");
//            modelAndView.addObject("blog", blog);
//            return modelAndView;
//
//        }else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }

//    @PostMapping("/delete-blog")
//    public String deleteBlog(@ModelAttribute("blog") Blog blog){
//        blogService.delete(blog.getId());
//        return "redirect:blogs";
//    }
//
//    @GetMapping("/edit-blog/{id}")
//    public ModelAndView showEditForm(@PathVariable Long id,
//                                     Model model){
//        Blog blog = blogService.findBlogById(id);
//        if(blog != null) {
////            ModelAndView modelAndView = new ModelAndView("/edit");
////            modelAndView.addObject("blog", blog);
//            List<Content> contents = contentService.findAll();
//            model.addAttribute("contents",contents);
//            return new ModelAndView("/edit","blog",blog);
//
//        }else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }
//
//    @PostMapping("/edit-blog")
//    public ModelAndView updateCustomer(@ModelAttribute("blog") Blog blog){
//        blogService.save(blog);
//        ModelAndView modelAndView = new ModelAndView("/edit");
//        modelAndView.addObject("blog", blog);
//        modelAndView.addObject("message", "song updated successfully");
//        return modelAndView;
//    }
}
