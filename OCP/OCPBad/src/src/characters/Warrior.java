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
public class Warrior {
    private int fullHealth;
    
    private int healthLeft;
    
    private boolean isAlive;
    
    private int damage;
    
    public Warrior(final int fullHealth, final int damage) {
        this.fullHealth = fullHealth;
    }
    
    public int getFullHealth() {
        return fullHealth;
    }
    
    public int getRemainedHealth() {
        return healthLeft;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public boolean isAlive() {
        return isAlive;
    }
    
    public void decreaseHealth(final int damage) {
        healthLeft -= damage;
        isAlive = healthLeft > 0;
    }
}
