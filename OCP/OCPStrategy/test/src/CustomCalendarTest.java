/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import src.impl.GBDatePrinter;
import src.impl.RussianDatePrinter;
import src.impl.USADatePrinter;

/**
 *
 * @author alexrazinkov
 */
public class CustomCalendarTest {
    
    final Map<String, IDatePrinter> FORMAT_TO_PRINTER = new HashMap<String, IDatePrinter>() {
        {
            put("dd.MM.YYYY", new RussianDatePrinter());
            put("MM-dd-YYYY", new USADatePrinter());
            put("dd/MM/YYYY", new GBDatePrinter());
        }
    };
    
    public void testGetFormattedDate(final String format, final IDatePrinter printer) {
        final DateFormat df = new SimpleDateFormat(format);
        final Date d = Calendar.getInstance().getTime();
        CustomCalendar cal = new CustomCalendar(d, printer);
        assertEquals(df.format(d), cal.getFormattedDate());
    }
    
    @Test
    public void testUSAFormat() {
        testGetFormattedDate("MM-dd-YYYY", new USADatePrinter());
    }
    
    @Test
    public void testRussianFormat() {
        testGetFormattedDate("dd.MM.YYYY", new RussianDatePrinter());
    }
    
    @Test
    public void testGBFormat() {
        testGetFormattedDate("dd/MM/YYYY", new GBDatePrinter());
    }
}
