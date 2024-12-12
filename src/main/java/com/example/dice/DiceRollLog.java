package com.example.dice;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Entity
public class DiceRollLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identifiant unique

    private int diceCount; // Nombre de dés lancés

    @ElementCollection
    @CollectionTable(name = "dice_roll_results", joinColumns = @JoinColumn(name = "dice_roll_log_id"))
    @Column(name = "result")
    private List<Integer> results; // Liste des valeurs obtenues

    private LocalDateTime timestamp; // Horodatage du lancé

    public DiceRollLog() {}


    public DiceRollLog(int diceCount, List<Integer> results, LocalDateTime timestamp) {
        this.diceCount = diceCount;
        this.results = results;
        this.timestamp = timestamp;
    }


}
