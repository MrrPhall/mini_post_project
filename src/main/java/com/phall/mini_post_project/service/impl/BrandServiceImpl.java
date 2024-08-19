package com.phall.mini_post_project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phall.mini_post_project.entity.Brand;
import com.phall.mini_post_project.repository.BrandRepository;
import com.phall.mini_post_project.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;

    @Override 
    public Brand saveBrand(Brand brand){
        // TODO Auto-generated method stub
        return brandRepository.save(brand);
    }
}
