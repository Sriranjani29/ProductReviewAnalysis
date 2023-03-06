package com.reviewanalysis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.reviewanalysis.entity.Admin;

@Service
public interface AdminService {
	public Admin insertAdmin(Admin admin)throws Exception;
	public Admin updateAdmin(Admin admin)throws Exception;
	public String deleteByAdminId(Integer adminId)throws Exception;
	public List<Admin> getAllAdmin()throws Exception;
	
	


}
