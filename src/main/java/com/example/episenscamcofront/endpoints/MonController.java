package com.example.episenscamcofront.endpoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

@RestController
public class MonController {

    @PostMapping("/add/order")
    @ResponseBody
    @CrossOrigin("*")
    public void add_order(@RequestBody String order) throws FileNotFoundException {
        System.out.println(order);
        PrintWriter writer = new PrintWriter("./orders.txt");
        writer.println(order);
        writer.close();
    }

}
