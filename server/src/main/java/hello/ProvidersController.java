package hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@Controller
public class ProvidersController {

    @RequestMapping(value = "/Providers")
    public @ResponseBody
    Iterable<Providers> listProviders() {

        return  getRepository().findAll();
    }


    public ProvidersRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ProvidersRepository.class);
    }
}
