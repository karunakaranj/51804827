package com.personalloan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalloan.Model.Customerdetails;

public interface CustomerRepository extends JpaRepository<Customerdetails, Integer>{

}
