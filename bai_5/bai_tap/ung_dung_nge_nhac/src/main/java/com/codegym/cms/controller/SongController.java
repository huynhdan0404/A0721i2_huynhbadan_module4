package com.codegym.cms.controller;

import com.codegym.cms.model.Song;
import com.codegym.cms.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping("/songs")
    public ModelAndView listCustomers(){
        List<Song> songs = songService.findAll();
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("songs", songs);
        return modelAndView;
    }

    @GetMapping("/create-song")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("song", new Song());
        return modelAndView;
    }

    @PostMapping("/create-song")
    public ModelAndView saveCustomer(@ModelAttribute("song") Song song) {
        songService.save(song);

        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("songs", new Song());
        modelAndView.addObject("message", "New song created successfully");
        return modelAndView;
    }

    @GetMapping("/delete-song/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Song song = songService.findById(id);
        if(song != null) {
            ModelAndView modelAndView = new ModelAndView("/delete");
            modelAndView.addObject("song", song);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-song")
    public String deleteCustomer(@ModelAttribute("customer") Song song  ){
        songService.remove(song.getId());
        return "redirect:songs";
    }

    @GetMapping("/edit-song/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Song song = songService.findById(id);
        if(song != null) {
            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("song", song);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-song")
    public ModelAndView updateCustomer(@ModelAttribute("song") Song song){
        songService.save(song);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("song", song);
        modelAndView.addObject("message", "song updated successfully");
        return modelAndView;
    }
}
