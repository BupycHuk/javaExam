package hello.Controller;

import hello.Config;
import hello.Model.Seller;
import hello.Model.SellerRepository;
import hello.Model.Shop;
import hello.Model.ShopRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Admin on 12.12.13.
 */
public class ShopController
{
    @RequestMapping(value = "/shop")
    public @ResponseBody
    Iterable<Shop> listShop() {

        return  getRepository().findAll();
    }
    public ShopRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ShopRepository getShopRepository = context.getBean(ShopRepository.class);
        return getShopRepository;

    }
}
