package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Customer[] customers = restTemplate.getForObject("http://192.168.1.69:8080/users/", Customer[].class);
        for (Customer customerElement : customers){
            System.out.println("ID:    " + customerElement.getId());
            System.out.println("firstName:   " + customerElement.getFirstName());
            System.out.println("lastName:   " + customerElement.getLastName());
            System.out.println(" Эмне кылгыныз келип жатат ? ");
            System.out.println(" 1 - Дүкөндөрдүн тизмесин чыгаруу ");
            System.out.println(" 2 - Тизмедеги дүкөндү өзгөртүү ");

        SpringApplication.run(Application.class, args);
    }
    }
}