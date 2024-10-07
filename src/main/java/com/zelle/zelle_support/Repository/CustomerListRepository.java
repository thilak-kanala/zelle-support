package com.zelle.zelle_support.Repository;

import com.zelle.zelle_support.Model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class CustomerListRepository {

    List<Customer> customerList = new ArrayList<>();

    public void inititlize() {
        customerList.addAll(List.of(
                new Customer(10L, "david", "long", "davidlong@gmail.com"),
                new Customer(11L, "david", "yates", "david2@gmail.com"),
                new Customer(12L, "david", "smith", "david3@gmail.com"),
                new Customer(13L, "david", "cron", "david4@gmail.com"),
                new Customer(20L, "zack", "shetty", "zack@outlook.com"),
                new Customer(21L, "zack", "lint", "zack2@outlook.com"),
                new Customer(22L, "zack", "smith", "zack3@outlook.com"),
                new Customer(30L, "john", "mann", "john@gmail.com"),
                new Customer(40L, "rachel", "bridge", "rachel@gmail.com"),
                new Customer(41L, "rachel", "waters", "rachel2@gmail.com")
        ));
    }

    // Create
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    // Read
    public List<Customer> findAll() {
        return new ArrayList<>(customerList);
    }

    public Optional<Customer> findById(Long Id) {
        return customerList.stream()
                .filter(customer -> customer.getId().equals(Id))
                .findFirst();
    }

    public Optional<Customer> findByEmail(String email) {
        return customerList.stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findFirst();
    }

    public List<Customer> findByFirstName(String firstName) {
        return customerList.stream()
                .filter(customer -> customer.getFirstName().equalsIgnoreCase(firstName))
                .collect(Collectors.toList());
    }

    public List<Customer> findByLastName(String lastName) {
        return customerList.stream()
                .filter(customer -> customer.getLastName().equalsIgnoreCase(lastName))
                .collect(Collectors.toList());
    }

    // Update
    public boolean updateCustomer(String email, Customer updatedCustomer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getEmail().equals(email)) {
                customerList.set(i, updatedCustomer);
                return true;
            }
        }
        return false;
    }

    // Delete
    public boolean deleteCustomer(String email) {
        return customerList.removeIf(customer -> customer.getEmail().equals(email));
    }


}
