package com.reviewanalysis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reviewanalysis.entity.Admin;
import com.reviewanalysis.repository.AdminRepository;


@Service

public class AdminServiceImpl implements AdminService{
    
	@Autowired
         AdminRepository adminRepository;
	@Override
	public Admin insertAdmin(Admin admin) throws Exception {
		    Admin savedAdmin =  adminRepository.save(admin);// Note :  save() is already implemented by Spring Data JPA
		    return savedAdmin;
	}
	@Override
	public Admin updateAdmin(Admin admin) throws Exception {
		// TODO Auto-generated method stub
		Admin savedAdmin=adminRepository.save(admin);
		return savedAdmin;
	}
	@Override
	public String deleteByAdminId(Integer adminId) throws Exception {
		// TODO Auto-generated method stub
		adminRepository.deleteById(adminId);
		return "deleted successfully";
	}
	@Override
	public List<Admin> getAllAdmin() throws Exception {
		// TODO Auto-generated method stub
		List<Admin> allAdmin = adminRepository.findAll();
		return allAdmin;

	}
		

	}


