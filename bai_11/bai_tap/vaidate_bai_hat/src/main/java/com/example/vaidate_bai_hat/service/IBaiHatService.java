package com.example.vaidate_bai_hat.service;

import com.example.vaidate_bai_hat.model.BaiHat;


import java.util.List;

public interface IBaiHatService {
    List<BaiHat> findAll();
    void save(BaiHat baiHat);
    void delete(Long id);
    BaiHat findById(Long id);
}
