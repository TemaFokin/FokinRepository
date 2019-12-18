package com.example.demo.domain.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Hello extends BaseEntity {
    private String greeting;
    private String name;
    private Date greetingDate;
}
