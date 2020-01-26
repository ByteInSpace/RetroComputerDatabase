package de.byteinspace.retrocomputerdatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.byteinspace.retrocomputerdatabase.entity.Computer;
import de.byteinspace.retrocomputerdatabase.repository.ComputerRepository;


@RestController
@RequestMapping("/computer")
public class ComputerController {

	@Autowired private ComputerRepository computerRepository;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Iterable<Computer> getAllComputer() {
		return computerRepository.findAll();
	}
	
	@RequestMapping(value = "/{name}", method=RequestMethod.GET)
	public Computer getComputer(@PathVariable String name) {
		return computerRepository.findComputerByName(name);
	}
	
}
