package com.yourname.Service;

import com.yourname.Dao.CustomerRepository;
import com.yourname.Entity.CompoundedKey;
import com.yourname.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomerById(int id) {
        return customerRepository.findByCompoundedKeyId(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> list = new ArrayList<>();
         customerRepository.findAll().
                forEach(list::add);
        return list;
    }


}
