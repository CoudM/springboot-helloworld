package example.demo.springboot.helloworld.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    String home() {
        long ret = accumulate(Int.max/2);
        System.out.println(ret);
        return "Hello from Test CI/CD!";
    }

    private long accumulate(long max) {
        long ret;
        for(long i = 1; i <= max; i++) {
            ret += i;
        }
        return ret;
    }

}
