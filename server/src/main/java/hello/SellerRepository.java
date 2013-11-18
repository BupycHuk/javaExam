package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SellerRepository extends CrudRepository<Seller, Long> {
    Iterable<Seller> findByFullName (String fullName);
}

