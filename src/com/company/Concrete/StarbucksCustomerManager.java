package com.company.Concrete;

import com.company.Abstract.BaseCustomerManager;
import com.company.Abstract.CustomerCheckService;
import com.company.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    CustomerCheckService customerCheckService;

    @Override
    public void save(Customer customer) throws Exception {
        if (customerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }else {
            throw new Exception("Not a valid person");
        }
    }
}
