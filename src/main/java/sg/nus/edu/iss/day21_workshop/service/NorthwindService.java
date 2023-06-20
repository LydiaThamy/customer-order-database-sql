package sg.nus.edu.iss.day21_workshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.nus.edu.iss.day21_workshop.model.Customer;
import sg.nus.edu.iss.day21_workshop.model.Order;
import sg.nus.edu.iss.day21_workshop.repository.NorthwindRepository;

@Service
public class NorthwindService {

    @Autowired
    private NorthwindRepository repository;

    public List<Customer> getAllCustomers(int limit, int offset) {
        return repository.getAllCustomers(limit, offset);
    }
    
    public Customer getCustomerById(int id) {
        return repository.getCustomerById(id);
    }

    public List<Order> getOrdersByCustomerId(int customerId) {
        return repository.getOrdersByCustomerId(customerId);
    }
}
