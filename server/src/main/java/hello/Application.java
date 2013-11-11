package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        Scanner inport =new Scanner(System.in);
        RestTemplate restTemplate = new RestTemplate();
        Integer number;
        System.out.print("Эмне кылгыныз келип жатат : ");
        number=inport.nextInt();

        if (number==1){
            String nameDucon,Tovars;
            nameDucon = inport.next();
            Tovars = inport.next();
            String url = String.format("http://localhost:8080/addDukon/%s/%s", nameDucon, Tovars);
            Shops shops = restTemplate.getForObject(url, Shops.class);
        }
        else if (number == 2){
            String nameDucon,Tovars;
            nameDucon = inport.next();
            Tovars = inport.next();
            String url = String.format("http://localhost:8080/addSatuuchu/%s/%s", nameDucon, Tovars);
            Shops shops = restTemplate.getForObject(url, Shops.class);
        }

        Shops[] shopses = restTemplate.getForObject("http://localhost:8080/allSatuuchu/",Shops[].class);

        for (Shops shops1 : shopses) {
            System.out.println("id  :" + shops1.getId());
            System.out.println("firstName  :" + shops1.getName());
            System.out.println("nameTovar  :" + shops1.getTovars());
            System.out.println("\n");
        }

    }
}
