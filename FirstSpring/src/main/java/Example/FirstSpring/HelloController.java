package Example.FirstSpring;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse hello(){
        return new HelloResponse("Hello World!");
    }

    // for users/{users id}
    // users/1
    @GetMapping("/hello/{name}")
    public HelloResponse helloParam(@PathVariable String name){
        return new HelloResponse("Hello "+name+ "!");
    }

    @PostMapping("/hello")
    public HelloResponse HelloPost(@RequestBody String name){
        return new HelloResponse( "Hello "+name+ "!");
    }
}
