package com.jonasermert.repository;

import com.jonasermert.model.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jonas Ermert
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
