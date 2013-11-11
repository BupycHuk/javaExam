package hello;

import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static void main(String args[]) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Эмне кылгыңыз келип жатат?\n1 - Жабдып туруучулардын тизмесин көрсөт\n2 - Жабдып туруучуну өчүрүү");
        String one = d.readLine();
        String two = d.readLine();
        if (one=="1") {String url = String.format("http://localhost:8080/providers");
        Customer customer = restTemplate.getForObject(url, Customer.class);}
        else
        if (one=="2") {String url = String.format("http://localhost:8080/delete/{name}");
            Customer customer = restTemplate.getForObject(url, Customer.class);}  else
        {
            String url = String.format("http://localhost:8080/"+"error command not found");
            Customer customer = restTemplate.getForObject(url, Customer.class);
        }
        }


        }

    }

