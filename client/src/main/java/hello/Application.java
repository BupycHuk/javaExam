package hello;

import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static void main(String args[]) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        String name = d.readLine();
        String surname = d.readLine();
        String url = String.format("http://192.168.1.69:8080/add/%s/%s",name,surname);
        Customer customer = restTemplate.getForObject(url, Customer.class);

        Customer[] customers = restTemplate.getForObject("http://192.168.1.69:8080/users/", Customer[].class);
        for (Customer customerElement : customers){
            System.out.println("ID:    " + customerElement.getId());
            System.out.println("buyum_ati:   " + customerElement.getbuyum_ati());
            System.out.println("turabi:   " + customerElement.getTurabi());
        }

    }

}