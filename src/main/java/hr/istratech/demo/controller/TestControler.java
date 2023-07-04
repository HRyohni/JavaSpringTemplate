package hr.istratech.demo.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestControler {

    @GetMapping("/api")
    public String test()
    {
        return "toString(5*5)" ;
    }

    @GetMapping("/leo")
    public String leo()
    {
        return "toString(5*5)" ;
    }
    @PostMapping("post")
    public  String test2 ()
    {
        return "asdsad";
    }
}
