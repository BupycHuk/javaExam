package hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 11/11/13
 * Time: 2:33 PM
 * To change this template use File | Settings | File Templates.
 */

@Component
@Controller
public class ShopsController {

    @RequestMapping(value = "/shops/")
    public @ResponseBody
    Iterable<Shops> shopsList(){
        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addShop/{shop_name}/{contacts}")
    public @ResponseBody Shops addShop(@PathVariable("shop_name")String shop_name, @PathVariable("contacts") String contacts){
        Shops shop = new Shops(shop_name, contacts);
        getRepository().save(shop);
        return shop;
    }


    public ShopsRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ShopsRepository shopsRepository = context.getBean(ShopsRepository.class);
        return shopsRepository;
    }

}
