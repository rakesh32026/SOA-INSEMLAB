package com.klu.euraka;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestaurantController {

    @GetMapping("/restaurant")
    public String restaurant() {
        return "{\"service\":\"Restaurant Service\","
             + "\"status\":\"UP\"}";
    }
}