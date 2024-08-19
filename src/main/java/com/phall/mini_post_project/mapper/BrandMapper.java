package com.phall.mini_post_project.mapper;

import com.phall.mini_post_project.dto.BrandDTO;
import com.phall.mini_post_project.entity.Brand;

public class BrandMapper {
    public static Brand toBrand(BrandDTO dto){
        Brand brand = new Brand();
        brand.setName(dto.getName());
        return brand;
    }
}
