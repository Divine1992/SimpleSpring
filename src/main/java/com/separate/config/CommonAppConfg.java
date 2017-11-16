package com.separate.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan(basePackages = "com.separate.config")
// using ComponentScan we can find beans in packages without config class DON'T forget add @Component or etc to class
@Import({SoapConfig.class, RestConfig.class})
public class CommonAppConfg {
}
