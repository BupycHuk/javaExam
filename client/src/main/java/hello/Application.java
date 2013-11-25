package hello;

import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static void main(String args[]) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("* * Дүкөндүн аты-->" );
        String shopname = d.readLine();
        System.out.println("* * Сатуучунун аты-жөнү-->");
        String sellername = d.readLine();
        System.out.println("* * Логин-->" );
        String login =d.readLine();
        System.out.println("* * Пароль-->");
        String password  =d.readLine();

       String url = String.format("http://localhost:8080/addSeller/%s/%s/%s/%s",shopname,sellername,login,password);
        Seller customer = restTemplate.getForObject(url, Seller.class);

         Seller[] sellers = restTemplate.getForObject("http://localhost:8080/sellers/", Seller[].class);
        for (Seller seller : sellers){
            System.out.println("ID:    " + seller.getId());
            System.out.println("fullname:   " + seller.getFullName());
            System.out.println("login:   " + seller.getLogin());
            System.out.println("Shop:   " + seller.getShop());
        }

    }

}