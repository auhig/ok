package h.ji.okm.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @RequestMapping
    public void say() {
        System.out.println("hello world");
    }

}
