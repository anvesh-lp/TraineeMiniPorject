package com.example.sample.bootstrap;


import com.example.sample.model.Trainee;
import com.example.sample.services.TraineeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//To populate database with dummy data when application starts
@Component
public class DataLoader implements CommandLineRunner {
    private final TraineeService traineeService;

    public DataLoader(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @Override
    public void run(String... args) throws Exception {

        traineeService.saveAll(loadData());
    }

    public List<Trainee> loadData() {
        List<Trainee> list = new ArrayList<>();
        Trainee anvesh = Trainee.builder().traineeName("Anvesh").traineeDomain("Java").traineeLocation("Bengaluru").build();
        Trainee kk = Trainee.builder().traineeName("kk").traineeDomain("Java").traineeLocation("Bengaluru").build();
        Trainee pk = Trainee.builder().traineeName("pk").traineeDomain("Java").traineeLocation("Bengaluru").build();
        list.add(anvesh);
        list.add(kk);
        list.add(pk);
        return list;
    }


}
