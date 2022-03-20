package com.example.quan_ly_tinh.service;



import com.example.quan_ly_tinh.model.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> findAll();
    void saveProvince(Province province);
    void deleteProvince(Long id);
    Province findProvinceById(Long id);
}
