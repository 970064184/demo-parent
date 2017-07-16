package com.backcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.backcode.model.SUser;
@Repository
public interface SUerRepository extends JpaRepository<SUser, Integer>, JpaSpecificationExecutor<SUser> {
	
}
