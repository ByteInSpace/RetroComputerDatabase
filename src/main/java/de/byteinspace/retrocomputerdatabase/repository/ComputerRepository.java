package de.byteinspace.retrocomputerdatabase.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import de.byteinspace.retrocomputerdatabase.entity.Computer;

@Repository
public interface ComputerRepository extends PagingAndSortingRepository<Computer, Long>{
	
	public Computer findComputerByName(String name);
	
	

}
