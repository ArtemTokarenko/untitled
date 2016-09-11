package untitled.bean;

import lombok.Getter;
import lombok.Setter;
import untitled.util.StringUtil;
import untitled.entity.Admin;

/**
 * Created by Ультрамар on 09.09.2016.
 */
@Getter
@Setter
public class AdminBean {

    private Integer id;
    private String login;
    private String password;
    private String email;
    private String createdDate;
    private Integer role;
    private boolean ban;



    public static AdminBean toBean(Admin admin) {
        AdminBean bean = new AdminBean();
        bean.setId(admin.getId());
        bean.setLogin(admin.getLogin());
        bean.setPassword(admin.getPassword());
        bean.setEmail(admin.getEmail());
        bean.setCreatedDate(StringUtil.dateFormat.format(admin.getCreatedDate()));
        bean.setRole(admin.getRole().ordinal());
        bean.setBan(admin.getBan());


        return bean;
    }







    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public boolean isBan() {
        return ban;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }


}