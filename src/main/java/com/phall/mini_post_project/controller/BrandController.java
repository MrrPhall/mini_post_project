package com.phall.mini_post_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phall.mini_post_project.dto.BrandDTO;
import com.phall.mini_post_project.entity.Brand;
import com.phall.mini_post_project.mapper.BrandMapper;
import com.phall.mini_post_project.service.BrandService;

@RestController
@RequestMapping("brands")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @PostMapping
    public ResponseEntity<?> saveData(@RequestBody BrandDTO dto){
        Brand brand = BrandMapper.toBrand(dto);
        Brand saveData = brandService.saveData(brand);
        return ResponseEntity.ok(saveData);
    }
}
