package com.example.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class DiceRollController {

    private final DiceRollService diceRollService;

    @Autowired
    public DiceRollController(DiceRollService diceRollService) {
        this.diceRollService = diceRollService;
    }

    // Endpoint pour lancer un seul dé
    @GetMapping("/rollDice")
    public int rollDice() {
        return diceRollService.rollDice();
    }

    // Endpoint pour lancer X dés, où X est un paramètre dynamique
    @GetMapping("/rollDices/{x}")
    public List<Integer> rollDices(@PathVariable("x") int diceCount) {
        return diceRollService.rollDices(diceCount);
    }

}
