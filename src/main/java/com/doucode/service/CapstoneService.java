package com.doucode.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.doucode.entity.Capstone;
import com.doucode.repository.CapstoneRepository;

@Service
public class CapstoneService {
	
	@Autowired
	private CapstoneRepository repo;

	public void addOwner(Capstone c)
	{
		repo.save(c);
	}
	
	public List<Capstone> getAllOwner(String keyword)
	{
		if(keyword!=null)
			return repo.search(keyword);
		return repo.findAll();
	}
	
	public Capstone getOwnerByID(int id)
	{
		Optional<Capstone> c = repo.findById(id);
		return c.get();
	}
	
	public void deleteOwnerByID(int id)
	{
		repo.deleteById(id);
	}
}
