package de.byteinspace.retrocomputerdatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.byteinspace.retrocomputerdatabase.entity.Computer;
import de.byteinspace.retrocomputerdatabase.repository.ComputerRepository;


@Controller
@RequestMapping("/computer")
public class ComputerController {

	@Autowired private ComputerRepository computerRepository;
	
	@GetMapping("/all")
	public Iterable<Computer> getAllComputer() {
		return computerRepository.findAll();
	}
	
	@RequestMapping(value = "/{name}", method=RequestMethod.GET)
	public Computer getComputer(@PathVariable String name) {
		return computerRepository.findComputerByName(name);
	}
	
	@GetMapping("/showall")
	public String showALlForm(Model model) {
		model.addAttribute("computers", computerRepository.findAll());
		
		return "showAll";
	}
}
