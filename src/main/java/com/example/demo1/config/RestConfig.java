package com.example.demo1.config;

import com.example.demo1.Repository.StudentRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        // Disable auto-exposure of StudentRepository
//        config.disableDefaultExposure();
        
        // Alternatively, you can selectively disable specific repositories:
        // config.getExposureConfiguration()
        //     .forDomainType(User.class)
        //     .withItemExposure((metadata, httpMethods) -> httpMethods.disable())
        //     .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable());
    }
}