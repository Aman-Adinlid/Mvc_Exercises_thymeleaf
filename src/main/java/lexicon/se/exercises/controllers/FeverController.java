package lexicon.se.exercises.controllers;

import lexicon.se.exercises.dto.Temperature;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeverController {
    @GetMapping("/fever")
    public String fever(Model model) {
        Temperature temperature = new Temperature();
        model.addAttribute("temperature", temperature);
        return "fever";
    }
}
