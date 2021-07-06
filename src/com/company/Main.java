package com.company;

import com.company.Abstract.BaseCustomerManager;
import com.company.Concrete.CustomerCheckManager;
import com.company.Concrete.NeroCustomerManager;
import com.company.Entities.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new NeroCustomerManager(new CustomerCheckManager());
        customerManager.save(new Customer(10, "Engin", "Demiroğ",
                new Date(2021, 07, 05), "111"));

    }
}
