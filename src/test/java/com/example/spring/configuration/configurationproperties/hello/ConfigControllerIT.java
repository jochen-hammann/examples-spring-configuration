package com.example.spring.configuration.configurationproperties.hello;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class ConfigControllerIT
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    @Autowired
    private MockMvc mvc;

    @Autowired
    private String customConfig;

    // ============================== [Unit Tests] ==============================

    // -------------------- [Test Helper Classes] --------------------

    @TestConfiguration
    static class CustomTestConfiguration
    {
        @Bean
        public String customConfig()
        {
            return "This is a test configuration.";
        }
    }

    // -------------------- [Test Helper Methods] --------------------

    // -------------------- [Test Initialization] --------------------

    // -------------------- [Tests] --------------------

    @Test
    void getConfig() throws Exception
    {
        String result = mvc.perform(get("/config")).andReturn().getResponse().getContentAsString();

        System.out.println(result);
    }

    @Test
    void getMyConfig() throws Exception
    {
        String result = mvc.perform(get("/myconfig")).andReturn().getResponse().getContentAsString();

        System.out.println(result);
    }

    @Test
    void getAppName() throws Exception
    {
        String result = mvc.perform(get("/appname")).andReturn().getResponse().getContentAsString();

        System.out.println(result);
    }

    @Test
    void getCustomTestConfig() throws Exception
    {
        System.out.println(this.customConfig);
    }
}
