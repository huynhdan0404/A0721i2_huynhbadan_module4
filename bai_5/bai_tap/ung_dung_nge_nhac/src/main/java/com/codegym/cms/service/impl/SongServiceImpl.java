package com.codegym.cms.service.impl;

import com.codegym.cms.model.Song;
import com.codegym.cms.repository.SongRepository;
import com.codegym.cms.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SongServiceImpl implements SongService {
    @Autowired
    private SongRepository songRepository;

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Song findById(Long id) {
        return songRepository.findById(id);
    }

    @Override
    public void save(Song song) {
    songRepository.save(song);
    }

    @Override
    public void remove(Long id) {
        songRepository.remove(id);
    }
}
