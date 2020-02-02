package de.byteinspace.retrocomputerdatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.byteinspace.retrocomputerdatabase.repository.ComputerRepository;

@Controller
@RequestMapping("/admin/computer")
public class AdminComputerController {

	@Autowired private ComputerRepository computerRepository;
	
	@GetMapping("/showall")
	public String showALlForm(Model model) {
		model.addAttribute("computers", computerRepository.findAll());
		
		return "adminshowallcomputer";
	}
	
	@RequestMapping(value = "delete/{id}", method=RequestMethod.GET)
	public String getComputer(@PathVariable Long id, Model model) {
		computerRepository.deleteById(id);
		return "admindeletedcomputer";
	}
}
