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
 * User: Admin
 * Date: 27.10.13
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */

@Component
@Controller
public class ShopsController {

    @RequestMapping(value = "/users")
    public @ResponseBody
    Iterable<Customer> listUsers() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/add/{Name}/{Contacts}")
    public @ResponseBody Shops addUser(@PathVariable("Name") String Name, @PathVariable("Contacts") Character Contacts) {

        Shops shops= new Shops(Name,Contacts);
        getRepository().save(shops);

        return shops;
    }

    @RequestMapping(value = "/delete/{id}")
    public @ResponseBody Shops deleteUser(@PathVariable("id") long id) {
        getRepository().delete(id);
        return null;
    }

    public ShopsRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ShopsRepository shopsRepository = context.getBean(ShopsRepository.class);
        return ShopsRepository;
    }
}

