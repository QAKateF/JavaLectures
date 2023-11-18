package ObjectOrientedProgramming;

import ObjectOrientedProgramming.Animals;

public class Cats extends Mammals implements Animals {
    @Override
    public int numberOfLegs() {
        return 6;
    }

    @Override
    public boolean isFlying() {
        return false;
    }

    @Override
    public String voice() {
        return Animals.super.voice();
    }
    
}
