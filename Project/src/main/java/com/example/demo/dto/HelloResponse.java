package com.example.demo.dto;

import lombok.Data;

import java.util.Date;

@Data
public class HelloResponse {
    private String greeting;
    private String name;
    private Date greetingDate;
    private long id;
}
