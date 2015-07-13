package by.pixar.uvd.controller;


import by.pixar.uvd.domain.Personal;
import by.pixar.uvd.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PersonalController {


    private PersonalService personalService;

    @Autowired
    public PersonalController(PersonalService personalService){
        this.personalService=personalService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getBooks(Model model) {
        List<Personal> personal = this.personalService.listPersonal();

        model.addAttribute("personal",personal);

        return "index";
    }
}
