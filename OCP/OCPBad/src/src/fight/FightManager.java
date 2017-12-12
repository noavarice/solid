/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.fight;

import src.characters.Archer;
import src.characters.Swordsman;
import src.characters.Warrior;

/**
 *
 * @author alexrazinkov
 */
public class FightManager {
    
    private static void swap(final Warrior w1, final Warrior w2) {}

    public static boolean fight(final Warrior w1, final Warrior w2) {
        Warrior attacking = w1, defensing = w2;
        do {
            if (attacking instanceof Archer) {
                Archer t = (Archer) attacking;
                final int dmg = attacking.getDamage() / 2;
                defensing.decreaseHealth(dmg);
                ((Swordsman)defensing).decreaseArmor(dmg);
                t.decreaseArrowsCount();
                t.stepBack();
            } else {
                final int dmg = attacking.getDamage();
                defensing.decreaseHealth(dmg);
                Swordsman s = (Swordsman) attacking;
                s.shield();
            }
            
            swap(w1, w2);
            
        } while (w1.isAlive() && w1.isAlive());
        return w1.isAlive();
    }
}
