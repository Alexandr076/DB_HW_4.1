package com.aleksandr.db_hw_41.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @Embedded
    private PersonInfo personInfo;

    private String phoneNumber;

    @Column(name = "city_of_living")
    private String cityOfLiving;
}
