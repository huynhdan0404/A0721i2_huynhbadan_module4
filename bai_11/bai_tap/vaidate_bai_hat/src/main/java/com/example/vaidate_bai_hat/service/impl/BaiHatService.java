package com.example.vaidate_bai_hat.service.impl;

import com.example.vaidate_bai_hat.model.BaiHat;
import com.example.vaidate_bai_hat.repository.BaiHatRepository;
import com.example.vaidate_bai_hat.service.IBaiHatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaiHatService implements IBaiHatService {
    @Autowired
    BaiHatRepository baiHatRepository;

    @Override
    public List<BaiHat> findAll() {
        return baiHatRepository.findAll();
    }

    @Override
    public void save(BaiHat baiHat) {
        baiHatRepository.save(baiHat);

    }

    @Override
    public void delete(Long id) {
        baiHatRepository.deleteById(id);
    }

    @Override
    public BaiHat findById(Long id) {
        return baiHatRepository.findById(id).orElse(null);
    }
}
