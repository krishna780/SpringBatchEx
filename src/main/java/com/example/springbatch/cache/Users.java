package com.example.springbatch.cache;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String teamName;
    private Long salary;
}
