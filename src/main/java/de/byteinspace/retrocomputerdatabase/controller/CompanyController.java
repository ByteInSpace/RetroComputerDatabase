package de.byteinspace.retrocomputerdatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import de.byteinspace.retrocomputerdatabase.entity.Company;
import de.byteinspace.retrocomputerdatabase.repository.CompanyRepository;

@Controller
@RequestMapping("/company")
public class CompanyController {

	
@Autowired private CompanyRepository companyRepository;
	
	@GetMapping("/all")
	public Iterable<Company> getAllCompanies() {
		return companyRepository.findAll();
	}
	

	
	@GetMapping("/showall")
	public String showALlForm(Model model) {
		model.addAttribute("companies", companyRepository.findAll());
		
		return "showAllCompanies";
	}
}
