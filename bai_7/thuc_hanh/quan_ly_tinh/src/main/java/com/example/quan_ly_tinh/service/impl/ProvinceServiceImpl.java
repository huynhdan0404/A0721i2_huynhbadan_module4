package com.example.quan_ly_tinh.service.impl;


import com.example.quan_ly_tinh.model.Province;
import com.example.quan_ly_tinh.repository.ProvinceRepository;
import com.example.quan_ly_tinh.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl  implements ProvinceService {
    @Autowired
    ProvinceRepository provinceRepository;
    
    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public void saveProvince(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void deleteProvince(Long id) {
        provinceRepository.deleteById(id);
    }

    @Override
    public Province findProvinceById(Long id) {
        return provinceRepository.findById(id).orElse(null);
    }
}
