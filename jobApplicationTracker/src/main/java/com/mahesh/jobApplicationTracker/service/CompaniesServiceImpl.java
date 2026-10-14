package com.mahesh.jobApplicationTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahesh.jobApplicationTracker.model.Companies;
import com.mahesh.jobApplicationTracker.repo.CompaniesRepo;

@Service
public class CompaniesServiceImpl implements CompaniesService {
	@Autowired
	CompaniesRepo cr;

	@Override
	public Companies createComapny(Companies c) {
		// TODO Auto-generated method stub
		return cr.save(c);
	}

	@Override
	public List<Companies> getAllCompanies() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public Companies getById(long id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	@Override
	public Companies updateCompany(Companies c, long id) {
		// TODO Auto-generated method stub
		Companies c1 = getById(id);
		c1.setCompany_Name(c.getCompany_Name());
		c1.setCompany_Location(c.getCompany_Location());
		c1.setCompany_Website(c.getCompany_Website());
		c1.setIndustry(c.getIndustry());
		return cr.save(c1);
	}

	@Override
	public void deleteCompanies(long id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);

	}

}
