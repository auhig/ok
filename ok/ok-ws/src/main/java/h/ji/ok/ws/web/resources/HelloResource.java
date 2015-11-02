package h.ji.ok.ws.web.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResource {

    @RequestMapping("/say")
    public String say(@RequestParam("name") String name) {
        return "hello " + name;
    }

}
