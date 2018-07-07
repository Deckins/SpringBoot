package com.yourname.Dao;

import com.yourname.Entity.CompoundedKey;
import com.yourname.Entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,CompoundedKey>{
    List<Customer> findByCompoundedKeyId(int id);
}
