package hello;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SellersRepository extends CrudRepository<Sellers, Long> {

    List<Sellers> findBySellerName(String sellerName);
}
