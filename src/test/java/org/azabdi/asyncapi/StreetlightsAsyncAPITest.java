package org.azabdi.asyncapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class StreetlightsAsyncAPIMain {


    public static void main(String... arg) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        StreetlightsAsyncAPI streetlightsAsyncAPI = new StreetlightsAsyncAPI();
        String schemaString = objectMapper.writeValueAsString(streetlightsAsyncAPI);

        System.out.println(schemaString);
        Path file = Paths.get("target/asyncapi.json");
        Files.write(file, schemaString.getBytes());
    }



}