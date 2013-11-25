package hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

@Component
@Controller
public class SellersController {

    @RequestMapping(value = "/sellers")
    public @ResponseBody
    Iterable<Sellers> listUsers() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addToSellers/{sellerName}")
    public @ResponseBody
    Sellers addUser(@PathVariable("sellerName") String name) {
        Sellers sellers= new Sellers(name);
        getRepository().save(sellers);
        return sellers;
    }


    public SellersRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SellersRepository sellersRepository = context.getBean(SellersRepository.class);
        return sellersRepository;
    }
}
