package com.doucode.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.doucode.entity.Capstone;
import com.doucode.service.CapstoneService;


@Controller
public class CapstoneController {

	@Autowired
	private CapstoneService service;
	
	@GetMapping("/vetlist")
	public String vetList()
	{
		return "vetList";
	}
	@GetMapping("/")
	public String homePage()
	{
		return "homePage";
	}
	
	@GetMapping("/ownerpage")
	public String home(Model m, @Param("keyword") String keyword)
	{
		List<Capstone> ownerList = service.getAllOwner(keyword);
		m.addAttribute("ownerListMapping",ownerList);
		m.addAttribute("keyword",keyword);
		return "ownerPage";
	}
	
	@GetMapping("/addOwnerPage_mapping")
	public String addOwnerForm()
	{
		return "addOwner";
	}
	
	@PostMapping("/addOwner_mapping")
	public String ownerRegister(@ModelAttribute Capstone c, HttpSession session)
	{
		System.out.println(c);
		service.addOwner(c);
		session.setAttribute("msg","Owner Added Successfully...!");
		return "redirect:/ownerpage";
	}
	
	@GetMapping("/updateOwnerPage_mapping/{id}")
	public String editOwner(@PathVariable int id, Model m)
	{
		Capstone c = service.getOwnerByID(id);
		m.addAttribute("singleOwner",c);
		return "editOwner";
	}
	
	@PostMapping("/updateOwner_mapping")
	public String updateOwner(@ModelAttribute Capstone c, HttpSession session)
	{
		service.addOwner(c);
		session.setAttribute("msg","Owner Updated Successfully...!");
		return "redirect:/ownerpage";
	}
	
	@GetMapping("/deleteOwner_mapping/{id}")
	public String deleteOwner(@PathVariable int id, HttpSession session)
	{
		service.deleteOwnerByID(id);
		session.setAttribute("msg","Owner Deleted Successfully...!");
		return "redirect:/ownerpage";
	}
	
	@GetMapping("/DetailOwnerPage_mapping/{id}")
	public String detail(@PathVariable int id, Model m)
	{
		Capstone c = service.getOwnerByID(id);
		m.addAttribute("detailOwner",c);
		return "ownerDetail";
	}
	
	
}
