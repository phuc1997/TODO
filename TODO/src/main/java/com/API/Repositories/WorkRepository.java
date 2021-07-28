package com.API.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API.Models.Works;

public interface WorkRepository extends JpaRepository<Works, Integer> {

}
