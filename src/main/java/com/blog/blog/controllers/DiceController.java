package com.blog.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String diceRoll() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{guess}")
    public String guessOne(@PathVariable int guess, Model viewModel) {
        Random random = new Random();
        int diceNumber = random.nextInt((6 - 1) + 1) + 1;
        viewModel.addAttribute("guess", guess);
        viewModel.addAttribute("diceNumber", diceNumber);

        return "roll-results";
    }

}