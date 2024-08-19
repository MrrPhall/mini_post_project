package com.phall.mini_post_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phall.mini_post_project.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository< Brand, Long >{

}
