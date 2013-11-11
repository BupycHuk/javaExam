package hello;

import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static void main(String args[]) throws IOException
    {
        RestTemplate restTemplate = new RestTemplate();
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Jany buium kowuu");
        String choice = input.readLine();

      {
            System.out.println("Jany buium kowuu:");
            String buium_aty= input.readLine();
            String url = String.format("http://localhost:8080/add/%s", buium_aty);
           Buium buium = restTemplate.getForObject(url,Buium.class);

            Buium[] shops = restTemplate.getForObject("http://localhost:8080/buium/", Buium[].class);
            for( Buium buiumElement : shops)
            {
                System.out.println("Id:     "+ buiumElement.getId());
                System.out.println("Buium aty:     "+ buiumElement.getBuiumAty());

            }

      }

    }