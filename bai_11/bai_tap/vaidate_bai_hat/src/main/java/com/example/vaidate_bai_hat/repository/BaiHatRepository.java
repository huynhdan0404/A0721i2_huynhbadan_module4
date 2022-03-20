package com.example.vaidate_bai_hat.repository;

import com.example.vaidate_bai_hat.model.BaiHat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaiHatRepository extends JpaRepository<BaiHat,Long> {

}
