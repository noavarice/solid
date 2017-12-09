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
public class GoodCore {
    
    private ICoreSettings s;
    
    public GoodCore(final ICoreSettings settings) {
        s = settings;
    }
    
    public boolean connect() {
        if (s.isIPv6Enabled()) {
            // ...
        }
        
        if (!s.isUdpEnabled()) {
            // ...
        }
        
        return true;
    }
}
