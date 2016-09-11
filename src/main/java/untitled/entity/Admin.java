package untitled.entity;

import lombok.Getter;
import lombok.Setter;
import untitled.enumm.Role;

import javax.persistence.Entity;

/**
 * Created by Ультрамар on 09.09.2016.
 */
@Getter
@Setter
@Entity
public class Admin extends User {

    public Admin() {
        setRole(Role.ROLE_ADMIN);
    }
}
