/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author alexrazinkov
 */
public class OrderBad {
    private Customer customer;
    
    private String productName;
    
    private int count;
    
    private static ICustomerProvider provider = null;
    
    public OrderBad(final int customerId, final String product, final int count) {
        customer = provider.getCustomer(customerId);
        productName = product;
        this.count = count;
    }
    
    public static void setCustomerProvider(final ICustomerProvider p) {
        provider = p;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public int getCount() {
        return count;
    }
}
