package com.example.dice;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class DiceRollService {
    private final DiceRollLogRepository diceRollLogRepository;
    private final Random random = new Random();

    public DiceRollService(DiceRollLogRepository diceRollLogRepository) {
        this.diceRollLogRepository = diceRollLogRepository;
    }

    // Lance un seul dé et retourne le résultat
    public int rollDice() {
        return random.nextInt(6) + 1; // Génère un nombre entre 1 et 6
    }

    // Lance X dés et retourne la liste des résultats
    public List<Integer> rollDices(int diceCount) {
        List<Integer> results = new ArrayList<>();

        // Lancer les dés et collecter les résultats
        for (int i = 0; i < diceCount; i++) {
            results.add(random.nextInt(6) + 1); // Génère un nombre entre 1 et 6
        }

        // Enregistrer l'historique du lancé dans la base de données
        DiceRollLog log = new DiceRollLog(diceCount, results, LocalDateTime.now());
        diceRollLogRepository.save(log);

        // Retourner les résultats des lancés
        return results;
    }
}
