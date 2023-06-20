package sg.nus.edu.iss.day21_workshop.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sg.nus.edu.iss.day21_workshop.model.Customer;

@Repository
public class CustomerRepository {

    @Autowired
    private JdbcTemplate template;

    private final String findAllSql = "select * from customers limit ? offset ?";
    public List<Customer> getAllCustomers(int limit, int offset) {
        return template.query(findAllSql, BeanPropertyRowMapper.newInstance(Customer.class), limit, offset);
    }
    
}
