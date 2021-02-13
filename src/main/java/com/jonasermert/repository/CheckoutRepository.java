package com.jonasermert.repository;

import com.jonasermert.model.Checkout;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jonas Ermert
 */
public interface CheckoutRepository extends CrudRepository<Checkout, Long> {
}
