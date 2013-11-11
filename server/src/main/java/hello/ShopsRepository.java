package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ShopsRepository extends CrudRepository<Shops, Long> {

    List<Shops> findByLastName(String lastName);
}

