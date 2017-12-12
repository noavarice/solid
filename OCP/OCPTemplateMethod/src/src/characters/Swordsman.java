/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.characters;

/**
 *
 * @author alexrazinkov
 */
public class Swordsman extends Warrior {
    
    private int fullArmor;
    
    private int armorLeft;
    
    private boolean noArmor;
    
    public Swordsman(final int fullHealth, final int damage, final int fullArmor) {
        super(fullHealth, damage);
        this.fullArmor = fullArmor;
        noArmor = fullArmor <= 0;
    }
    
    public int getFullArmor() {
        return fullArmor;
    }
    
    public int getRemainedArmor() {
        return armorLeft;
    }
    
    private void decreaseArmor(final int damage) {
        armorLeft -= damage;
        noArmor = armorLeft <= 0;
    }
    
    protected void shield() {}
    
    @Override
    public void applyDamage(int damage) {
        final int dmg = damage / 2;
        decreaseHealth(dmg);
        decreaseArmor(dmg);
    }

    @Override
    public void auxiliaryActions() {
        shield();
    }
}
