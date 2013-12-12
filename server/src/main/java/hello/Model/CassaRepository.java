package hello.Model;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Admin on 12.12.13.
 */
public interface CassaRepository extends CrudRepository<Seller, Long> {
}
