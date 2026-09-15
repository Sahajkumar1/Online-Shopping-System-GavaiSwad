
package com.softpro.GanwaiSwad.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softpro.GanwaiSwad.Model.entity.BrandEntity;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity , Integer>{
 
}
