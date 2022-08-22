package contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todoController {

    @GetMapping("/")
    public String todo() {
        return "To-do Application !";
    }
}
