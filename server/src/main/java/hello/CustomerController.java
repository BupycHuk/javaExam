package hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
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
public class CustomerController {

    @RequestMapping(value = "/users")
    public @ResponseBody
    Iterable<Store> listUsers() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/add/{name}/{surname}")
    public @ResponseBody
    Store addUser(@PathVariable("name") String name, @PathVariable("surname") String surname) {

        Store store = new Store(name,surname);
        getRepository().save(store);

        return store;
    }

    @RequestMapping(value = "/delete/{id}")
    public @ResponseBody
    Store deleteUser(@PathVariable("id") long id) {
        getRepository().delete(id);
        return null;
    }

    public CustomerRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
        return customerRepository;
    }
}

