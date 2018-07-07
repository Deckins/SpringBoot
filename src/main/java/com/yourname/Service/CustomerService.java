package com.yourname.Service;

import com.yourname.Entity.CompoundedKey;
import com.yourname.Entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomers();
    List<Customer> getCustomerById(int id);
}
