package untitled.entity;

import lombok.Getter;
import lombok.Setter;
import untitled.enumm.Role;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Client extends User {

    public Client() {
        setRole(Role.ROLE_CLIENT);
    }
}
