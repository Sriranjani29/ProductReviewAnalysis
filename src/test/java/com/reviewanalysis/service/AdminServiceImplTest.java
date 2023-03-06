package com.reviewanalysis.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.reviewanalysis.entity.Admin;
import com.reviewanalysis.repository.AdminRepository;

@SpringBootTest
class AdminServiceImplTest {
	
	@Mock
	AdminRepository adminRepository;
	
	@InjectMocks
	AdminServiceImpl adminService;

	@Test
	@DisplayName("Test- to verify the insert operation\"")
	void testInsertAdmin()throws Exception {
		Admin sampleInput=new Admin("Sri","sri@gmail.com","srirak");
		Admin expectedOutput=new Admin("Sri","sri@gmail.com","srirak");
		BDDMockito.given(adminService.insertAdmin(sampleInput)).willReturn(expectedOutput);
		
		
	}

	@Test
	@DisplayName("Get all the Admins")
	void testGetAllAdmin()throws Exception {
		Admin admin1=new Admin("Sri","sri@gmail.com","srirak");
		Admin admin2=new Admin("Dharshu","dharshu@gmail.com","dharvm");
		List<Admin> sampleOutput = new ArrayList<>();
		sampleOutput.add(admin1);
		sampleOutput.add(admin2);
		BDDMockito.given(adminService.getAllAdmin()).willReturn(sampleOutput);
		List<Admin>actualOutput=adminService.getAllAdmin();
		assertNotNull(actualOutput);
		assertIterableEquals(sampleOutput, actualOutput);
	}

}
