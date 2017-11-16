package com.separate.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SoapConfig.class, RestConfig.class})
public class CommonAppConfg {
}
