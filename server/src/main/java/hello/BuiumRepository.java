package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

    public interface BuiumRepository extends CrudRepository<Buium, Long> {

        List<Buium> findByBuiumAty(String buiumAty);
    }



