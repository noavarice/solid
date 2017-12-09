/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp_good;

import src.GoodCore;
import src.ICoreSettings;
import src.Settings;

/**
 *
 * @author alexrazinkov
 */
public class Ocp_good {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final ICoreSettings s = new Settings();
        final GoodCore core = new GoodCore(s);
        core.connect();
    }
    
}
