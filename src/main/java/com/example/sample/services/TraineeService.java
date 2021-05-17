package com.example.sample.services;

import com.example.sample.model.Trainee;

import java.util.List;

public interface TraineeService {
    List<Trainee> getAllTrainees();

    List<Trainee> findByName(String name);

    Trainee findTraineeById(Long id);

    void deleteTraineeById(Long id);

    Trainee updateTrainee(Trainee trainee);

    Trainee newTrainee(Trainee trainee);

    void saveAll(List<Trainee> trainees);


}
