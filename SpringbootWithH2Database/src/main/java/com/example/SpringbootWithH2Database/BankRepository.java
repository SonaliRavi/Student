package com.example.SpringbootWithH2Database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BankRepository extends JpaRepository<Bank, Long>
{
	
}