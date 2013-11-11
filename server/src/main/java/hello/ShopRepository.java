package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 11/11/13
 * Time: 5:40 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ShopRepository extends CrudRepository<Shop, Long> {

    List<Shop> findByLastName(String lastName);
}
