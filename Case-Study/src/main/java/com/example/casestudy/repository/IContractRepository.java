package com.example.casestudy.repository;

import com.example.casestudy.model.Contract;
import com.example.casestudy.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractRepository extends JpaRepository<Contract,Long> {
    Customer findByNameContract(String customerName);

}
