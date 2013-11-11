package hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@Controller
public class ShopsController {
    @RequestMapping(value = "/allSatuuchu")
    public @ResponseBody
    Iterable<Shops> listShops() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addDucon/{nameDucon}/{nameTovar}")
    public @ResponseBody Shops addShops(@PathVariable("nameDucon") String nameShop, @PathVariable("nameTovar") String nameTovars) {

        Shops shops= new Shops(nameShop,nameTovars);
        getRepository().save(shops);

        return shops;
    }

    @RequestMapping(value = "/addSatuuchu/{firstName}/{lastName}")
    public @ResponseBody Satuuchu addUser(@PathVariable("firstName") String name, @PathVariable("lastName") String surname) {

        Satuuchu satuuchu= new Satuuchu(name,surname);
        getRepository().save((Iterable<Shops>) satuuchu);

        return satuuchu;
    }

    public ShopsRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ShopsRepository shopsRepository = context.getBean(ShopsRepository.class);
        return shopsRepository;
    }
}
