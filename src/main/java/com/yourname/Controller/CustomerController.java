package com.yourname.Controller;


import com.yourname.Entity.CompoundedKey;
import com.yourname.Entity.Customer;
import com.yourname.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/{id}" ,method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Customer> getCustomerById(@PathVariable @Valid int id){
        return this.customerService.getCustomerById(id);
    }
    @RequestMapping(value = "/all" ,method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Customer> getAllCustomers(){
        return this.customerService.getAllCustomers();
    }


}
