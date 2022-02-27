package com.codegym.cms.service;

import com.codegym.cms.model.Song;

import java.util.List;

public interface SongService {
    List<Song> findAll();

    Song findById(Long id);

    void save(Song song);

    void remove(Long id);
}
