package com.example.dice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
//@RequestMapping("/DiceRollLog")
public class DiceRollLogController {

    private final DiceRollLogRepository diceRollLogRepository;

    @Autowired
    public DiceRollLogController(DiceRollService diceRollService, DiceRollLogRepository diceRollLogRepository) {
        this.diceRollLogRepository = diceRollLogRepository;
    }


    // Endpoint pour récupérer les lancés après une certaine date
    @GetMapping("/diceLogs")
    public List<DiceRollLog> getAllLogs() {
        return diceRollLogRepository.findAll();
    }
}
