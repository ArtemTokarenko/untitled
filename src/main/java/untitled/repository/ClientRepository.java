package untitled.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import untitled.entity.Client;


/**
 * Created by Ультрамар on 10.09.2016.
 */
public interface ClientRepository extends JpaRepository<Client, Integer> {



}
