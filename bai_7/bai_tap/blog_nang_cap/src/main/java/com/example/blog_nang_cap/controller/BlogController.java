package com.example.blog_nang_cap.controller;

import com.example.blog_nang_cap.model.Blog;
import com.example.blog_nang_cap.model.Content;
import com.example.blog_nang_cap.service.IBlogService;
import com.example.blog_nang_cap.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private IContentService contentService;

    @GetMapping("/blogs")
    public ModelAndView getBlogList(@PageableDefault(size = 5) Pageable pageable){
        return new ModelAndView("list","blogs",blogService.findAll(pageable));
    }

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm(Model model) {
//        ModelAndView modelAndView = new ModelAndView("/create");
//        modelAndView.addObject("blog", new Blog());
//        return modelAndView;
        List<Content> contents = contentService.findAll();
        model.addAttribute("contents",contents);
        return new ModelAndView("/create", "blog", new Blog());
    }
    @PostMapping("/create-blog")
    public ModelAndView saveCustomer(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);

        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blog", new Blog());
        List<Content> contents = contentService.findAll();
        modelAndView.addObject("contents", contents);
        modelAndView.addObject("message", "New song created successfully");
        return modelAndView;
    }

    @GetMapping("/delete-blog/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Blog blog = blogService.findBlogById(id);
        if(blog != null) {
            ModelAndView modelAndView = new ModelAndView("/delete");
            modelAndView.addObject("blog", blog);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-blog")
    public String deleteBlog(@ModelAttribute("blog") Blog blog){
        blogService.delete(blog.getId());
        return "redirect:blogs";
    }

    @GetMapping("/edit-blog/{id}")
    public ModelAndView showEditForm(@PathVariable Long id,
                                     Model model){
        Blog blog = blogService.findBlogById(id);
        if(blog != null) {
//            ModelAndView modelAndView = new ModelAndView("/edit");
//            modelAndView.addObject("blog", blog);
            List<Content> contents = contentService.findAll();
            model.addAttribute("contents",contents);
            return new ModelAndView("/edit","blog",blog);

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-blog")
    public ModelAndView updateCustomer(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "song updated successfully");
        return modelAndView;
    }
}
