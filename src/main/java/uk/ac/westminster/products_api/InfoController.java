package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.*;

@RestController

public class InfoController {
    @GetMapping("/info")
    public String info() {
        return "Products API application for Tutorial 1 - 5COSC019W.";
    }
}