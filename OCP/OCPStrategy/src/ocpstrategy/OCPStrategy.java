/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocpstrategy;

import java.util.Calendar;
import java.util.Date;
import src.CustomCalendar;
import src.impl.GBDatePrinter;
import src.impl.RussianDatePrinter;
import src.impl.USADatePrinter;

/**
 *
 * @author alexrazinkov
 */
public class OCPStrategy {
    
    private static void print(final String s) {
        System.out.println(s);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Date currentDate = Calendar.getInstance().getTime();
        CustomCalendar cal = new CustomCalendar(currentDate, new RussianDatePrinter());
        print(cal.getFormattedDate());
        cal.setDateFormatStrategy(new GBDatePrinter());
        print(cal.getFormattedDate());
        cal.setDateFormatStrategy(new USADatePrinter());
        print(cal.getFormattedDate());
    }
    
}
