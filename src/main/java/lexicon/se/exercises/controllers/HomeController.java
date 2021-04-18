package lexicon.se.exercises.controllers;

import lexicon.se.exercises.dto.ContactDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    List<ContactDto> contactDtoList = new ArrayList<>();

    @PostConstruct
    public void text() {
        contactDtoList = new ArrayList<>();
    }

    @GetMapping("/")
    public String index() {
        return "index";

    }

    @GetMapping("/contact")
    public String contact(Model model) {
        ContactDto dto = new ContactDto();
        model.addAttribute("dto", dto);
        return "contact";
    }

    @GetMapping("/contactList")
    public String contactList(Model model) {
        model.addAttribute("contactDtoList", contactDtoList);
        return "contact";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
