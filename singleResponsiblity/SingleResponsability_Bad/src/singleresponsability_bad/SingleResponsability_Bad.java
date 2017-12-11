/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleresponsability_bad;

import src.Customer;
import src.ICustomerProvider;
import src.OrderBad;
import src.OrderGood;
import src.impl.CustomerProviderImpl;

/**
 *
 * @author alexrazinkov
 */
public class SingleResponsability_Bad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final ICustomerProvider provider = new CustomerProviderImpl();
        OrderBad.setCustomerProvider(provider);
        final OrderBad orderBad = new OrderBad(1, "salt", 10);
        final Customer customer = provider.getCustomer(1);
        final OrderGood orderGood = new OrderGood(customer, "water", 5);
    }
    
}
