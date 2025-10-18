package com.hs.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hs.entity.Passport;
import com.hs.entity.Person;
import com.hs.repository.PassportRepository;
import com.hs.repository.PersonRepository;

@Service("passportservice")
public class PassportService {

	@Autowired
	PersonRepository personrepo;
	@Autowired
	PassportRepository passportrepo;
	
	public String createPassport() {
		Person p = new Person();
		p.setName("Asish Parida");
		p.setAge("24");
		p.setGender("male");
		p.setAddress("Cuttack ,Odisha");
		Person person = personrepo.save(p);
		
		Passport pass = new Passport();
		pass.setPassNum("XXXY89654");
		pass.setIssueDate(LocalDate.now());
		pass.setExpireDate(LocalDate.now().plusYears(10));
		pass.setP(person);
		Passport passport = passportrepo.save(pass);
		
		return "Passport created successfully \nYour Passport number is "+passport.getPassNum(); 
	}

}
