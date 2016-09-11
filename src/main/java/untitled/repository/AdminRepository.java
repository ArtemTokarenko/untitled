package untitled.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import untitled.entity.Admin;

import java.util.List;

/**
 * Created by Ультрамар on 09.09.2016.
 */
public interface AdminRepository extends JpaRepository<Admin, Integer> {


    @Query(value = "SELECT LOGIN FROM ADMIN WHERE ID= :id", nativeQuery = true)
    public String getAdminLogin(Integer id);

    @Query(value = "DELETE  FROM ADMIN WHERE ID= :id", nativeQuery = true)
    public String deleteAdmin(Integer id);


}