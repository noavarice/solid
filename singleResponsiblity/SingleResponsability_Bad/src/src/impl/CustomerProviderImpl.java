/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.impl;

import src.Customer;
import src.ICustomerProvider;

/**
 *
 * @author alexrazinkov
 */
public class CustomerProviderImpl implements ICustomerProvider {

    @Override
    public Customer getCustomer(int id) {
        return new Customer(id, "Bob", 30);
    }
    
}
