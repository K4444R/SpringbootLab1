package kz.alishev.springstudents.model;
import java.time.LocalDate;

import lombok.*;

@Data
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    private String email;
    private int age;
}