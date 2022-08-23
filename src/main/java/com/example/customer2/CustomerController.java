package com.example.customer2;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CustomerController {
    private List<Customer> customers;

    public CustomerController() {

    }

    public List<Customer> getCustomers(){}

    public Customer getCustomerByID( String ID){}

    public Customer getCustomerByName( String n){}

    public boolean delCustomerByID( String ID){}

    public boolean delCustomerByName( String n){}

    public boolean addCustomer(String ID, String n, String s, int a){}

}
