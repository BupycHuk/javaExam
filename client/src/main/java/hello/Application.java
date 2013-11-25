package hello;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String args[]) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
//        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("* * Дүкөндүн аты-->" );
//        String shopname = d.readLine();
//        System.out.println("* * Сатуучунун аты-жөнү-->");
//        String sellername = d.readLine();
//        System.out.println("* * Логин-->" );
//        String login =d.readLine();
//        System.out.println("* * Пароль-->");
//        String password  =d.readLine();
        String shopname="Narodniy";
        String sellername = "test";
        String login = "login";
        String password = "password";

        PostExample postExample = new PostExample(shopname, sellername,login,password);

        String url = "http://localhost:8080/addSeller/";
        Seller seller1 = restTemplate.postForObject(url, postExample, Seller.class);
//        url = String.format("http://localhost:8080/addSeller/%s/%s/%s/%s",shopname,sellername,login,password);
//        Seller customer = restTemplate.getForObject(url, Seller.class);

        System.out.println("ID:    " + seller1.getId());
        System.out.println("fullname:   " + seller1.getFullName());
        System.out.println("login:   " + seller1.getLogin());
        System.out.println("Shop:   " + seller1.getShop());

         Seller[] sellers = restTemplate.getForObject("http://localhost:8080/sellers/", Seller[].class);
        for (Seller seller : sellers){
            System.out.println("ID:    " + seller.getId());
            System.out.println("fullname:   " + seller.getFullName());
            System.out.println("login:   " + seller.getLogin());
            System.out.println("Shop:   " + seller.getShop());
        }

    }

}