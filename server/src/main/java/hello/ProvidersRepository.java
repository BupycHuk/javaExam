package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProvidersRepository extends CrudRepository<Providers, Long> {

    @Query("SELECT S FROM Providers S INNER JOIN S.providers G WHERE G.providerName=:providerName")
    Iterable<Providers> findByProviderName(@Param("ProviderName") String ProviderName);
}
