package com.mongodb.learning.entity;


import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Document
public class Employee extends CreateUpdate{

    @Id
    private String id;

    private String name;

    private String email;

    private Double salary;

    private LocalDate joiningDate;

    private  String department;

    private String employeeCode;

    private String phoneNumber;

//    @PrePersist
//    public void prePersistUpdateDateTime() {
//        if (null == super.getUpdatedDateTime()) {
//            super.setUpdatedDateTime(LocalDateTime.now());
//        }
//        if (null == super.getCreatedDateTime()) {
//            super.setCreatedDateTime(LocalDateTime.now());
//        }
//
//        if (null == super.getCreatedBy()) {
//            super.setCreatedBy("SYSTEM");
//        }
//        if (null == super.getUpdatedBy()) {
//            super.setUpdatedBy("SYSTEM");
//        }
//
//    }
}


