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
public class Settings implements ICoreSettings {

    private boolean ipv6Enabled;

    private boolean udpEnabled;
    
    public Settings() {
        ipv6Enabled = true;
        udpEnabled = false;
    }
    
    @Override
    public boolean isIPv6Enabled() {
        return ipv6Enabled;
    }

    @Override
    public boolean isUdpEnabled() {
        return udpEnabled;
    }
    
}
