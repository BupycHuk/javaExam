package hello;

import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static void main(String args[]) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
        boolean teksheruu=false;
        String username="Adilet";
        String password="1";
        System.out.println("koldonuuchunun atyn jana syr sozun kirgiziniz:");
        while(teksheruu!=true){
            System.out.println("koldonuuchu:");
            String koldonuuchu = d.readLine();
            System.out.println("syr soz:");
            String syrSoz = d.readLine();
            if(koldonuuchu.equals(username)&&password.equals(syrSoz)){
                teksheruu = true;
            }
            else
                System.out.println("koldonuuchunun atyn jana syr sozun tuura kirgiziniz");
        }
        System.out.println("buyumdun aty:");
        String thingName = d.readLine();
        System.out.println("buyumdun sany:");
        String thingSum = d.readLine();
        System.out.println("satuuchunun aty:");
        String sellerName = d.readLine();
        String url = String.format("http://localhost:8080/addToShop/%s/%s", thingName,thingSum);
        Shop shop = restTemplate.getForObject(url, Shop.class);
        url = String.format("http://localhost:8080/addToSellers/%s", sellerName);
        Sellers sellers = restTemplate.getForObject(url, Sellers.class);
//        Shop[] shopses = restTemplate.getForObject("http://localhost:8080/things/", Shop[].class);
//        for (Shop shopElement : shopses){
//            System.out.println("ID:    " + shopElement.getId());
//            System.out.println("thingName:   " + shopElement.getThingName());
//            System.out.println("thingSum:   " + shopElement.getThingSum());
//        }
//
//        Sellers[] sellerses = restTemplate.getForObject("http://localhost:8080/sellers/", Sellers[].class);
//        for (Sellers sellersElement : sellerses){
//            System.out.println("ID:    " + sellersElement.getId());
//            System.out.println("sellerName:   " + sellersElement.getSellerName());
//        }

    }

}