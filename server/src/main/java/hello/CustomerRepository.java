package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Store, Long> {

    List<Store> findByLastName(String lastName);
}

