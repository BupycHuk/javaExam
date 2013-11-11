package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {

// of course, an ApplicationContext is just a BeanFactory
//        BeanFactory factory = (BeanFactory) appContext;
//        repository = (CustomerRepository) factory.getBean("customerRepository");

        SpringApplication.run(Application.class, args);
    }
}
