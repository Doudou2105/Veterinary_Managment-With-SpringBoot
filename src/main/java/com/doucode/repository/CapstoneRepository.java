package com.doucode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.doucode.entity.Capstone;

@Repository
public interface CapstoneRepository extends JpaRepository<Capstone,Integer>
{
	
	@Query("SELECT c FROM Capstone c WHERE CONCAT(c.id,c.firstName,c.lastName,c.address) LIKE %?1%")
	public List<Capstone> search(String keyword);

}
