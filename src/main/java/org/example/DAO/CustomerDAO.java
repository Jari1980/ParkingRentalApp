package org.example.DAO;

import org.example.Model.Customer;

import java.util.Collection;

public interface CustomerDAO {
    Customer createCustomer(Customer customer);
    Customer findById(int id);
    void removeById(int id);
    Customer findByReservationId(int id);
    Collection<Customer> findAll();
}
