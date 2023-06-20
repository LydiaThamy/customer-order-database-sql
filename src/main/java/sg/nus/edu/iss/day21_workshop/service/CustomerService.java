package sg.nus.edu.iss.day21_workshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.nus.edu.iss.day21_workshop.model.Customer;
import sg.nus.edu.iss.day21_workshop.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepo;

    public List<Customer> getAllCustomers(int limit, int offset) {
        return customerRepo.getAllCustomers(limit, offset);
    }
    
}
