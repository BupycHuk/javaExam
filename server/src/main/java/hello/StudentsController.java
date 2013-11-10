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
public class StudentsController {

    @RequestMapping(value = "/students")
    public @ResponseBody
    Iterable<Students> listUsers() {

        return  getRepository().findAll();
    }
    @RequestMapping(value = "/groups/{GroupName}")
    public @ResponseBody
    Iterable<Students> listGroupStudents(@PathVariable("GroupName") String name) {

        return getRepository().findByGroupName(name);
    }

    public StudentsRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(StudentsRepository.class);
    }
}
