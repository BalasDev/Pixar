package by.pixar.uvd.web;

import by.pixar.uvd.domain.Personal;
import by.pixar.uvd.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class PersonalController {
    @Autowired
   PersonalService personalService;

    @RequestMapping("/")
    public String listContacts(Map<String, Object> map) {

        map.put("personal", new Personal());
        map.put("personalList", personalService.listPersonal());

        return "personal";
    }
}
