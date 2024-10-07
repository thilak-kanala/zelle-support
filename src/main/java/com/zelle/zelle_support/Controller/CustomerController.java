package com.zelle.zelle_support.Controller;

import com.zelle.zelle_support.Model.Customer;
import com.zelle.zelle_support.Repository.CustomerListRepository;
import com.zelle.zelle_support.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

    CustomerListRepository customerListRepository;
    CustomerService customerService;

    @Autowired
    public CustomerController(CustomerListRepository customerListRepository, CustomerService customerService) {
        this.customerListRepository = customerListRepository;
        this.customerService = customerService;

        this.customerListRepository.inititlize();
    }

    // home page, contains search form
    @GetMapping("/")
    String homePage() {
        return "index";
    }

    @GetMapping("/customers/list")
    String getAllCustomers(Model model) {

        List<Customer> customerList = customerListRepository.findAll();
        model.addAttribute("customers", customerList);

        return "customers_list";
    }

    @GetMapping("/customers/search")
    public String searchCustomer(@RequestParam("searchType") String searchType,
                                 @RequestParam("searchValue") String searchValue, Model model) {
        if (searchType.equals("id")) {
            Optional<Customer> customer = customerListRepository.findById(Long.parseLong(searchValue));
            model.addAttribute("customers", customer.map(List::of).orElse(List.of()));
        } else if (searchType.equals("email")) {
            Optional<Customer> customer = customerListRepository.findByEmail(searchValue);
            model.addAttribute("customers", customer.map(List::of).orElse(List.of()));
        } else if (searchType.equals("firstName")) {
            List<Customer> customers = customerListRepository.findByFirstName(searchValue);
            model.addAttribute("customers", customers);
        } else if (searchType.equals("lastName")) {
            List<Customer> customers = customerListRepository.findByLastName(searchValue);
            model.addAttribute("customers", customers);
        }

        System.out.println(searchType + ", "  + searchValue);

        return "customers_search";
    }

    @GetMapping("customers/dummyDetails")
    public String getDummyCustomerDetails(Model model) {
        model.addAttribute("customerDetails", customerService.getDummyCustomerDetails());
        return "customer_details";
    }

}
