package cz.boris.demo;

import cz.boris.data.DatabaseMock;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Created by Boris on 22.4.2014.
 */

@EnableAutoConfiguration
@ComponentScan
@Import(value = {Application.DevelopmentConfiguration.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication();
        app.run(Application.class, args);
    }

    @Configuration
    @Profile("development")
    static class DevelopmentConfiguration {

        @Bean
        public DatabaseMock databaseMock() {
            return new DatabaseMock();
        }
    }

}
