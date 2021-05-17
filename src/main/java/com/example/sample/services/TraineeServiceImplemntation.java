package com.example.sample.services;

import com.example.sample.model.Trainee;
import com.example.sample.repository.TraineeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class TraineeServiceImplemntation implements TraineeService {
    private final TraineeRepository traineeRepository;

    public TraineeServiceImplemntation(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }

    @Override
    public List<Trainee> getAllTrainees() {
        List<Trainee> trainees = new ArrayList<>();
//        getting trainees from db and adding them to list
        traineeRepository.findAll().iterator().forEachRemaining(trainees::add);
        return trainees;
    }

    @Override
    public List<Trainee> findByName(String name) {
        List<Trainee> trainees = new ArrayList<>();
//        saving all trainess who have given name to the list
        traineeRepository.findAll().iterator().forEachRemaining(trainee -> {
            if (trainee.getTraineeName().equals(name)) {
                trainees.add(trainee);
            }
        });
        return trainees;
    }

    @Override
    public Trainee findTraineeById(Long id) {
        Optional<Trainee> trainee = traineeRepository.findById(id);
        return trainee.orElseThrow(() -> new RuntimeException("Trainee Not Found id :" + id));
    }

    @Override
    public void deleteTraineeById(Long id) {
        traineeRepository.deleteById(id);
    }

    @Override
    public Trainee updateTrainee(Trainee trainee) {
        Long id = trainee.getTraineeId();
        traineeRepository.save(trainee);
        Optional<Trainee> savedTrainee = traineeRepository.findById(id);
        return savedTrainee.get();
    }

    @Override
    public Trainee newTrainee(Trainee trainee) {
        traineeRepository.save(trainee);
//        Optional<Trainee> savedTrainee=traineeRepository.findBy();
        return trainee;

    }

    @Override
    public void saveAll(List<Trainee> trainees) {
        traineeRepository.saveAll(trainees);
    }
}
