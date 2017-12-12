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
public class Archer extends Warrior {
    
    private int maxArrowsCount;
    
    private int arrowsLeft;
    
    private boolean noArrows;

    public Archer(final int fullHealth, final int damage, final int maxArrowsCount) {
        super(fullHealth, damage);
        this.maxArrowsCount = maxArrowsCount;
        noArrows = maxArrowsCount <= 0;
    }
    
    public int getMaxArrowsCount() {
        return maxArrowsCount;
    }
    
    public int getRemainedArrowsCount() {
        return arrowsLeft;
    }
    
    public boolean noArrows() {
        return noArrows;
    }
    
    public void decreaseArrowsCount() {
        --arrowsLeft;
        noArrows = arrowsLeft == 0;
    }
    
    public void stepBack() {}
}
