package com.example.vaidate_bai_hat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class BaiHat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = " khong duoc de trong")
    @Size(max = 800, message = "khong dc qua 800 ky tu")
    private String name;

    @NotEmpty(message = " khong duoc de trong")
    @Size(max = 300, message = "khong dc qua 300 ky tu")
    private String artistName;

    @NotEmpty(message = " khong duoc de trong")
    @Size(max = 1000, message = "khong dc qua 1000 ky tu")
    private String Category;

    public BaiHat() {
    }

    public BaiHat(Long id, String name, String artistName, String category) {
        this.id = id;
        this.name = name;
        this.artistName = artistName;
        this.Category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        this.Category = category;
    }
}
