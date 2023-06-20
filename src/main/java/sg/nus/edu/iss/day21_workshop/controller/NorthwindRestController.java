package sg.nus.edu.iss.day21_workshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sg.nus.edu.iss.day21_workshop.model.Customer;
import sg.nus.edu.iss.day21_workshop.model.Order;
import sg.nus.edu.iss.day21_workshop.service.NorthwindService;

@RestController
@RequestMapping(path = "/api/customer", produces = MediaType.APPLICATION_JSON_VALUE)
public class NorthwindRestController {

    @Autowired
    private NorthwindService service;
    
    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers(@RequestParam(name = "limit", defaultValue = "5") Integer limit, @RequestParam(name = "offset", defaultValue = "0") Integer offset) {
        List<Customer> customers = new ArrayList<>(service.getAllCustomers(limit, offset));

        if (customers.isEmpty())
            return ResponseEntity.notFound().build();
        
            return ResponseEntity.ok().body(customers);
    }

    @GetMapping("/{customer-id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("customer-id") int customerId) {
        Customer customer = service.getCustomerById(customerId);

        if (customer == null)
            return ResponseEntity.notFound().build();
            
        return ResponseEntity.ok().body(customer);
    }

    @GetMapping("/{customer-id}/orders")
    public ResponseEntity<List<Order>> getOrdersByCustomerId(@PathVariable("customer-id") int customerId) {
        List<Order> orders = service.getOrdersByCustomerId(customerId);

        if (orders.isEmpty())
            return ResponseEntity.notFound().build();
            
        return ResponseEntity.ok().body(orders);
    }

}
