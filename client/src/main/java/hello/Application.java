package hello;

import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static void main(String args[]) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("postavshiktin  aty:");
        String name = d.readLine();
        System.out.println("postavshiktin  kontagy: ");
        String kontakt = d.readLine();
        String url = String.format("http://localhost:8080/add/%s/%s",name,kontakt);
        Person person = restTemplate.getForObject(url, Person.class);

        Person[] persons = restTemplate.getForObject("http://localhost:8080/users/", Person[].class);
        for (Person personElement : persons){
            System.out.println("ID:    " + personElement.getId());
            System.out.println("Name:   " + personElement.getName());
            System.out.println("Kontakt:   " + personElement.getKontakt());
        }

    }

}