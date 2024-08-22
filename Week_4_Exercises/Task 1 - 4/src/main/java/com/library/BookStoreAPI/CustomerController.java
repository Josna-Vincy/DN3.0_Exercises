package com.library.BookStoreAPI;

import com.library.BookStoreAPI.model.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer) {
        // Here you would typically save the customer to the database
        System.out.println("Customer Created: " + customer);
        return customer;
    }

    @PostMapping("/register")
    public Customer registerCustomer(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("phoneNumber") String phoneNumber) {

        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setPhoneNumber(phoneNumber);
        System.out.println("Customer Registered: " + customer);
        return customer;
    }
}

