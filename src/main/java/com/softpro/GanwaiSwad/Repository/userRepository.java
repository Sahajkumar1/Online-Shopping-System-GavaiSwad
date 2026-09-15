package com.softpro.GanwaiSwad.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softpro.GanwaiSwad.Model.entity.UserEntity;

public interface userRepository extends JpaRepository<UserEntity, Integer>{

}
