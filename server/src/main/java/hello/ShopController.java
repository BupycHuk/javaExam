package hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Component
@Controller
public class ShopController {

    @RequestMapping(value = "/things")
    public @ResponseBody
    Iterable<Shop> listUsers() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addToShop/{thingName}/{thingSum}")
    public @ResponseBody Shop addUser(@PathVariable("thingName") String thing, @PathVariable("thingSum") String sum) {
        Shop shop= new Shop(thing,sum);
        getRepository().save(shop);
        return shop;
    }


    public ShopRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ShopRepository shopRepository = context.getBean(ShopRepository.class);
        return shopRepository;
    }
}

