package hello;

import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static void main(String args[]) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1: Жаны дукон кошуу");
        System.out.println("2: Жаны сатуучу кошуу");
        System.out.println("Сан киргизиниз:");
        String choice = input.readLine();

        if(choice.equals("1")){
            System.out.println("Дукондун атын киргизиниз:");
            String shop_name = input.readLine();
            System.out.print("Дукондун контакттарын киргизиниз:");
            String contacts = input.readLine();
            String url = String.format("http://localhost:8080/add/%s/%s",shop_name,contacts);
            Shops shop = restTemplate.getForObject(url, Shops.class);

            Shops[] shops = restTemplate.getForObject("http://localhost:8080/shops/", Shops[].class);
            for( Shops shopElement : shops){
                System.out.println("Id:     "+ shopElement.getId());
                System.out.println("Shop name:     "+ shopElement.getShop_name());
                System.out.println("Shop contacts:     "+ shopElement.getContacts());
            }

        }
        else {

        String name = input.readLine();
        String surname = input.readLine();
        String url = String.format("http://localhost:8080/add/%s/%s",name,surname);
        Customer customer = restTemplate.getForObject(url, Customer.class);

        Customer[] customers = restTemplate.getForObject("http://localhost:8080/users/", Customer[].class);
        for (Customer customerElement : customers){
            System.out.println("ID:    " + customerElement.getId());
            System.out.println("firstName:   " + customerElement.getFirstName());
            System.out.println("lastName:   " + customerElement.getLastName());
        }
        }
    }

}