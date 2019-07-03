package com.example.demo.resource;

import java.time.LocalDateTime;

import com.example.demo.serializer.JsonDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Data;

@Data
public class TestResource {
    @JsonDeserialize(using = JsonDateDeserializer.class)
    private LocalDateTime testTime;
}
