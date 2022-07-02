package com.conncare.Model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Patient extends User {


    public Patient(String uuid, String name, String email, String pathPhoto, String password, Number weight, Number height, LocalDate birthDate) {
        super(uuid, name, email, pathPhoto, password, weight, height, birthDate);
    }

    public void scheduleAppointment(){

    }

}
