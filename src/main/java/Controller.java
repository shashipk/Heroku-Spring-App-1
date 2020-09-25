package com.example.DemoApp1;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    @GetMapping("/hi")
    public String sayHello(){
        return "Hello Coders!! 1st API";
    }

    // https://www.google.com/search?q=sachin
    // http://localhost:9090/convert?q=5

    @GetMapping("/convert")
    public int convertToINR(@RequestParam int q){
        int usd = q;
        return 74 * usd;
    }

    @GetMapping("/newHi")
    public String sayHello2(){
        return "Hello new Coders!! 1st API";
    }

    @GetMapping("/hi2")
    public String sayHello3(){
        return "Hello Coders 3 3 3 !! 1st API";
    }



    

}
