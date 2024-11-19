package org.example.DAO;

import org.example.Counters.CustomerCounter;
import org.example.Model.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO{
    private Collection<Customer> customerList = new ArrayList<>();

    public CustomerDAOImpl() {
    }

    @Override
    public Customer createCustomer(Customer customer) {
        int id = CustomerCounter.getCounter();
        customer = new Customer(id, customer.getName(), customer.getPhone(), customer.getEmail());
        customerList.add(customer);
        return customer;
    }

    @Override
    public Customer findById(int id) {
        for(Customer ele : customerList){
            if(ele.getId() == id){
                return ele;
            }
        }
        return null;
    }

    @Override
    public void removeById(int id) {
        for(Customer ele : customerList){
            if(ele.getId() == id){
                customerList.remove(ele);
            }
        }
    }

    @Override
    public Customer findByReservationId(int id) {
        for(Customer ele : customerList){
            if(ele == id){
                return ele;
            }
        }
        return null;
    }

    @Override
    public Collection<Customer> findAll() {
        return customerList;
    }
}
