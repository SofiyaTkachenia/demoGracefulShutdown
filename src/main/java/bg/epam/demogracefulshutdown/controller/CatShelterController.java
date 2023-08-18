package bg.epam.demogracefulshutdown.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cat")
public class CatShelterController {

    @RequestMapping("/get-cat")
    public String getCat() throws InterruptedException {
        Thread.sleep(30000);
        return "Here you go. Your cat is ready to go to the new home!";
    }
}
