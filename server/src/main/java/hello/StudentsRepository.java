package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentsRepository extends CrudRepository<Students, Long> {

    @Query("SELECT S FROM Students S INNER JOIN S.groups G WHERE G.groupName=:groupName")
    Iterable<Students> findByGroupName(@Param("groupName") String GroupName);
}
