package hello;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Component
@Controller
public class buiumController {
    @RequestMapping(value = "/buium/")
    public @ResponseBody
    Iterable<Buium> buiumList(){
        return  getRepository().findAll();
    }

    @RequestMapping(value = "addbuium/{buium_aty}/{contacts}")
    public @ResponseBody Buium addBuium(@PathVariable("buium_aty")String buium_aty){
        Buium buium= new Buium(buium_aty);
        getRepository().save(buium);
        return buium;
    }


    public BuiumRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        BuiumRepository buiumRepository = context.getBean(BuiumRepository.class);
        return buiumRepository;
    }


}
