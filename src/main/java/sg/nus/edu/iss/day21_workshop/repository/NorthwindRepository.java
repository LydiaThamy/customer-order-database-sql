package sg.nus.edu.iss.day21_workshop.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sg.nus.edu.iss.day21_workshop.model.Customer;
import sg.nus.edu.iss.day21_workshop.model.Order;

@Repository
public class NorthwindRepository {

    @Autowired
    private JdbcTemplate template;

    private final String findAllSql = "select * from customers limit ? offset ?";
    public List<Customer> getAllCustomers(int limit, int offset) {
        return template.query(findAllSql, BeanPropertyRowMapper.newInstance(Customer.class), limit, offset);
    }

    private final String findSqlById = "select * from customers where id = ?";
    public Customer getCustomerById(int id) {
        return template.queryForObject(findSqlById, BeanPropertyRowMapper.newInstance(Customer.class), id);
    }

    private final String findSqlByCustomerId = "select * from orders where customer_id = ?";
    public List<Order> getOrdersByCustomerId(int customerId) {
        return template.query(findSqlByCustomerId, BeanPropertyRowMapper.newInstance(Order.class), customerId);
    }
}
