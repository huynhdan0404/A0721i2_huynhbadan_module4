package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> product;

    static {

        product = new HashMap<>();
        product.put(1, new Product(1, "chanh", 50, "con hang"));
        product.put(2, new Product(2, "dua", 60, "con hang"));
        product.put(3, new Product(3, "oi", 78, "con hang"));
        product.put(4, new Product(4, "man", 25, "con hang"));
        product.put(5, new Product(5, "tao", 50, "con hang"));
        product.put(6, new Product(6, "xoai", 30, "con hang"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(product.values());
    }

    @Override
    public void save(Product customer) {
        product.put(customer.getId(), customer);
    }

    @Override
    public Product findById(int id) {
        return product.get(id);
    }

    @Override
    public void update(int id, Product customer) {
        product.put(id, customer);

    }

    @Override
    public void remove(int id) {
        product.remove(id);
    }
}
