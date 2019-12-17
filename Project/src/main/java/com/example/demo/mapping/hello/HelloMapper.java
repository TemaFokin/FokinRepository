package com.example.demo.mapping.hello;

import com.example.demo.domain.entities.Hello;
import com.example.demo.dto.HelloRequest;
import com.example.demo.dto.HelloResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface HelloMapper {
    HelloMapper MAPPER = Mappers.getMapper(HelloMapper.class);

    @Mapping(source = "greeting", target = "greeting")
    @Mapping(source = "name", target = "name")
    @Mapping(expression = "java(new java.util.Date())", target = "greetingDate")
    Hello helloRequestToHello(HelloRequest helloRequest);

    @Mapping(source = "greeting", target = "greeting")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "greetingDate", target = "greetingDate")
    @Mapping(source = "id", target = "id")
    HelloResponse helloToHelloResponse(Hello hello);
}
