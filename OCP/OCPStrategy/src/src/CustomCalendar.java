/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Date;

/**
 *
 * @author alexrazinkov
 */
public class CustomCalendar {
    
    private Date date;
    
    private IDatePrinter printerStrategy;
    
    public CustomCalendar(final Date date, final IDatePrinter printer) {
        this.date = date;
        printerStrategy = printer;
    }

    CustomCalendar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setDateFormatStrategy(final IDatePrinter p) {
        printerStrategy = p;
    }
    
    public String getFormattedDate() {
        return printerStrategy.getDate(date);
    }
}
