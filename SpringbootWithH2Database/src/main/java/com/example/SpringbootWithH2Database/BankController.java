package com.example.SpringbootWithH2Database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	private BankRepository repository;
	@PostMapping("/add")
	public Bank addBank(@RequestBody Bank bank)
	{
		return repository.save(bank);
	}
	
	@GetMapping("/fetch")
	public List<Bank> getAllBank()
	{
		return repository.findAll();
	}
	

}
