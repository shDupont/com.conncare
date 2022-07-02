package com.conncare.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;



@Getter
@Setter
@Document(collection = "patient")
public class Patient implements Serializable {

    @Id
    private String uuid;
    private String name;
    private String email;
    private String pathPhoto;
    private String password;
    private Number weight;
    private Number height;
    private LocalDate birthDate = LocalDate.now();
    

}
