package com.example.dice;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Dice {

    private final Random random;

    public Dice() {
        this.random = new Random();
    }

    public Dice(Random random) {
        this.random = random;
    }

    public int rollDice() {
        return random.nextInt(6) + 1;
    }
}
