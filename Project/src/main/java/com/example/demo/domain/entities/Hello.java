package com.example.demo.domain.entities;

import lombok.Data;
import org.hibernate.exception.DataException;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class Hello extends BaseEntity{
    private String greeting;
    private String name;
    private Date greetingDate;
}
