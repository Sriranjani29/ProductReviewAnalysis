package com.reviewanalysis.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.reviewanalysis.entity.Admin;

@Repository

public interface AdminRepository  extends JpaRepository<Admin, Integer>{
	@Query("from Admin a where a.email=:email and a.passWord=:passWord")
	public Admin findAdminByEmailPassword(@Param(value="email") String email, @Param(value="passWord")String passWord);

	
	
}
