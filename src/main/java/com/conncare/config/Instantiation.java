package com.conncare.config;


import com.conncare.Model.Patient;
import com.conncare.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;


@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();

        Patient patient = new Patient(null,"Leticia Dupont","leticia.dupont@gmail.com","path/path/path","hid123", 60.00, 1.90, LocalDate.now());

        userRepository.save(patient);

    }
}