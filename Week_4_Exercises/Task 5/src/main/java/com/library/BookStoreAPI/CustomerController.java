package com.library.BookStoreAPI;

import com.library.BookStoreAPI.model.Customer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody Customer customer) {
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
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "CustomerRegistration");
        System.out.println("Customer Registered: " + customer);
        return new ResponseEntity<>(customer, headers, HttpStatus.OK).getBody();
    }
}

