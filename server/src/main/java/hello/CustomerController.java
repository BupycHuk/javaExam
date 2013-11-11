package hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value = "/providers")
    public @ResponseBody
    Iterable<Customer> listProviders() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/add/{name}")
    public @ResponseBody Customer addUsers(@PathVariable("name") String name)  {

        Customer customer= new Customer(name);
        getRepository().save(customer);

        return customer;
    }

    @RequestMapping(value = "/delete/{name}")
    public @ResponseBody Customer deleteProvider(@PathVariable("name") String name) {
       getRepository().delete(name);
        return null;
    }

    public CustomerRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
        return customerRepository;
    }
}

