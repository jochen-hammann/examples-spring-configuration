package com.example.spring.configuration.configurationproperties.config;

import com.example.spring.configuration.configurationproperties.config.factory.YamlPropertySourceFactory;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// Caution: @PropertySource does not load yaml files per default. Only .properties files. Thus we have to provide a YamlPropertySourceFactory.

@Configuration
@ConfigurationProperties("myconfig")
@PropertySource(value = "classpath:myconfig.yml",
                factory = YamlPropertySourceFactory.class)
@Getter
@Setter
@JsonIgnoreProperties(value = { "CGLIB$CALLBACK_0", "CGLIB$CALLBACK_1", "CGLIB$CALLBACK_2", "$$beanFactory" })
public class MyConfig
{
    // ============================== [Fields] ==============================

    // -------------------- [Private Fields] --------------------

    private Integer number;

    // ============================== [Construction / Destruction] ==============================

    // -------------------- [Public Construction / Destruction] --------------------

    // ============================== [Spring Beans] ==============================

    // -------------------- [Public Spring Beans] --------------------

    // ============================== [Getter/Setter] ==============================

    // -------------------- [Private Getter/Setter] --------------------

    // -------------------- [Public Getter/Setter] --------------------

    // ============================== [Methods] ==============================

    // -------------------- [Private Methods] --------------------

    // -------------------- [Public Methods] --------------------

}
