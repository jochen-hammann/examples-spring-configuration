package com.example.spring.configuration.configurationproperties.hello;

import com.example.spring.configuration.configurationproperties.config.MyConfig;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.spring.configuration.configurationproperties.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private Config config;

    @Autowired
    private MyConfig myConfig;

    @Value("${app-name}")
    private String appName;

    // ============================== [Construction / Destruction] ==============================

    // -------------------- [Public Construction / Destruction] --------------------

    // ============================== [Getter/Setter] ==============================

    // -------------------- [Private Getter/Setter] --------------------

    // -------------------- [Public Getter/Setter] --------------------

    // ============================== [Methods] ==============================

    // -------------------- [Private Methods] --------------------

    // -------------------- [Public Methods] --------------------

    @GetMapping(path = "config")
    public String getConfig() throws JsonProcessingException
    {
        return this.objectMapper.writeValueAsString(this.config);
    }

    @GetMapping(path = "myconfig")
    public String getMyConfig() throws JsonProcessingException
    {
        return this.objectMapper.writeValueAsString(this.myConfig);
    }

    @GetMapping(path = "appname")
    public String getAppName() throws JsonProcessingException
    {
        return this.appName;
    }
}
