/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import src.IDatePrinter;

/**
 *
 * @author alexrazinkov
 */
public class USADatePrinter implements IDatePrinter {

    @Override
    public String getDate(Date date) {
        final DateFormat df = new SimpleDateFormat("MM-dd-YYYY");
        return df.format(date);
    }
    
}
