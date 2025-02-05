package csc340.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/api")
public class Controller {

    private static final String DB_COCKTAILS = "www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita\n";


    @GetMapping("/Margarita")
    public String getMagaritaInfo() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(DB_COCKTAILS, String.class);
    }
}
