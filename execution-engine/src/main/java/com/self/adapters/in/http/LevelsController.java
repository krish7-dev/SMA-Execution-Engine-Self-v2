package com.self.adapters.in.http;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LevelsController {

    @PostMapping("/levels")
    public String setLevels(){
        return "SAVED";
    }
}
