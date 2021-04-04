package lexicon.se.exercises.controllers;

import lexicon.se.exercises.dto.ContactDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {

        return "index";

    }

    @GetMapping("/contact")
    public String contact() {

        return "contact";
    }


    @PostMapping("/contact")
    public void init() {
        List<ContactDto> contactDtoList = new ArrayList<>();

        if (contactDtoList == null) contactDtoList = new ArrayList<>();
        ContactDto contactDto = new ContactDto();
        contactDto.setPhoneNum(0765455);
        contactDto.setEmail("12pinkpanda@gmali.com");
        contactDto.setAddress("Sweden");

        ContactDto contactDto2 = new ContactDto();
        contactDto2.setPhoneNum(07654432);
        contactDto2.setEmail("17pinkpanda@gmali.com");
        contactDto2.setAddress("Germany");
        contactDtoList.add(contactDto);
        contactDtoList.add(contactDto2);

    }


    @GetMapping("/contactList")
    public String getAllContacts(Model model) {
        List<ContactDto> contactDtoList = new ArrayList<>();
        model.addAttribute("contactDtoList", contactDtoList);
        return "contact";
    }

    @GetMapping("/about")
    public String about() {

        return "about";
    }
}
