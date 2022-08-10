package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    {
        counter.incrementAndGet();
    }

    @RequestMapping("/greeting/{name}")
    public Greeting greeting(@PathVariable("name") String name) {
        return new Greeting(Long.toString(counter.incrementAndGet()), String.format(template, name));
    }

}