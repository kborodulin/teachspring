package ru.teach.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("ru.teach.spring")
@Import(ConfigDatabase.class)
public class ConfigWebApp {
}