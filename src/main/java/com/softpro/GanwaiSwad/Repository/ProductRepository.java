package com.softpro.GanwaiSwad.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softpro.GanwaiSwad.Model.entity.ProductEntity;

@Repository
public interface ProductRepository extends  JpaRepository<ProductEntity, Integer>{
	
}
