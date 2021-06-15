package will;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleWebApplicationClass {

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebApplicationClass.class,args);
    }

    @GetMapping("/health")
    public String health(){
        return "{\"status\":\"UP\"}";
    }

    @GetMapping("/hello")
    public String hello(){
        return "I'm not java";
    }
}
