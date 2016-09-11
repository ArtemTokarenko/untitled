package untitled.enumm;

/**
 * Created by Ультрамар on 06.09.2016.
 */
public enum Role {

    /*0*/ROLE_ADMIN("Admin"),
    /*1*/ROLE_CLIENT("Client");

    Role(String description) {
        this.description = description;
    }

    private String description;

    public String getDescription() {
        return description;
    }
}
