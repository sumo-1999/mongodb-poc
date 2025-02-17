package com.mongodb.learning.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUpdate {

    @CreatedDate
    private LocalDateTime createdDateTime;
    @CreatedDate
    private LocalDateTime updatedDateTime;
    private String createdBy;
    private String updatedBy;

}