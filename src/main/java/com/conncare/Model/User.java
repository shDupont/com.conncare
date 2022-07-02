package com.conncare.Model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@Document(collection = "user")

public class User {

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
