package com.example.demo.mapping.hello;

import com.example.demo.domain.entities.Hello;
import com.example.demo.dto.HelloRequest;
import com.example.demo.dto.HelloResponse;
import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.MediaSize;
import java.util.Date;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static org.junit.jupiter.api.Assertions.*;

class HelloMapperTest {

    public static final String NAME = "Name";
    public static final String GREETING = "Greeting";
    public static final Date GREETING_DATE = new Date();
    public static final long ID = 1;

    @Test
    void helloRequestToHello() {
        HelloRequest helloRequest = helloRequest();

        Hello hello = HelloMapper.MAPPER.helloRequestToHello(helloRequest);

        assertAll(
                () -> assertEquals(helloRequest.getGreeting(), hello.getGreeting()),
                () -> assertEquals(helloRequest.getName(), hello.getName()),
                () -> assertEquals(new Date().toString(), hello.getGreetingDate().toString())
        );
    }

    @Test
    void helloToHelloResponse() {
        Hello hello = hello();

        HelloResponse helloResponse = HelloMapper.MAPPER.helloToHelloResponse(hello);

        assertAll(
                () -> assertEquals(hello.getGreeting(), helloResponse.getGreeting()),
                () -> assertEquals(hello.getGreetingDate(), helloResponse.getGreetingDate()),
                () -> assertEquals(hello.getName(), helloResponse.getName()),
                () -> assertEquals(hello.getId(), helloResponse.getId())
        );
    }

    private HelloRequest helloRequest() {
        HelloRequest helloRequest = new HelloRequest();
        helloRequest.setName(NAME);
        helloRequest.setGreeting(GREETING);
        return helloRequest;
    }

    private Hello hello() {
        Hello hello = new Hello();
        hello.setGreeting(GREETING);
        hello.setGreetingDate(GREETING_DATE);
        hello.setName(NAME);
        hello.setId(ID);
        return hello;
    }
}