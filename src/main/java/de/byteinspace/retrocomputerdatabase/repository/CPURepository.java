package de.byteinspace.retrocomputerdatabase.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import de.byteinspace.retrocomputerdatabase.entity.CPU;

public interface CPURepository extends PagingAndSortingRepository<CPU, Long>{

	public CPU findCPUByName(String name);
	
}
