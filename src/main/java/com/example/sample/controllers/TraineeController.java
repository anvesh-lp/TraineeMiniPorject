package com.example.sample.controllers;


import com.example.sample.services.TraineeService;
import org.springframework.stereotype.Controller;

@Controller
public class TraineeController {

    private final TraineeService traineeService;

    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

//    Write code here to interact with html forms or jsp pages(front end)


}
