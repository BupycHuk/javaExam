package hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Component
@Controller
public class ShopController {

    @RequestMapping(value = "/users")
    public @ResponseBody
    Iterable<Shop> listUsers() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/add/{thingName}/{thingSum}/{sellerName}")
    public @ResponseBody Shop addUser(@PathVariable("thingName") String name, @PathVariable("thingSum") String surname,@PathVariable("sellerName") String seller) {
        Shop shop= new Shop(name,surname,seller);
        getRepository().save(shop);
        return shop;
    }


    public ShopRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ShopRepository shopRepository = context.getBean(ShopRepository.class);
        return shopRepository;
    }
}
