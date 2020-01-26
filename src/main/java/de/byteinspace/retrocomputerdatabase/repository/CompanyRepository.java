package de.byteinspace.retrocomputerdatabase.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import de.byteinspace.retrocomputerdatabase.entity.Company;

@Repository
public interface CompanyRepository extends PagingAndSortingRepository<Company, Long>{
	
	public Company findCompanyByName(String name);

}
