package org.example.DAO;

import org.example.Counters.CustomerCounter;
import org.example.Model.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO{

    private Collection<Customer> customerList = new ArrayList<>();

    private static CustomerDAOImpl instance;

    public static CustomerDAOImpl getInstance(){
        if(instance == null){
            instance = new CustomerDAOImpl();
        }
        return instance;
    }

    private CustomerDAOImpl() {
    }

    @Override
    public Customer createCustomer(Customer customer) {
        if(customer == null){
            throw new IllegalArgumentException("Customer was null");
        }
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
    public boolean removeById(int id) {
        for(Customer ele : customerList){
            if(ele.getId() == id){
                customerList.remove(ele);
                return true;
            }
        }
        return false;
    }

    @Override
    public Customer findByReservationId(int id) {
        for(Customer ele : customerList){
            if(ele.getReservation().getId() == id){
                return ele;
            }
        }
        return null;
    }

    @Override
    public Collection<Customer> findAll() {
        return Collections.unmodifiableCollection(customerList);
        //return customerList;
    }
}
