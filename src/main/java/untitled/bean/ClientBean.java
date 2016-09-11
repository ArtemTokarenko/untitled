package untitled.bean;

import untitled.util.StringUtil;
import untitled.entity.User;

/**
 * Created by Ультрамар on 09.09.2016.
 */
public class ClientBean {

    private Integer id;
    private String login;
    private String password;
    private String email;
    private String createdDate;
    private Integer role;
    private boolean ban;



    public static ClientBean toBean(User user) {
        ClientBean bean = new ClientBean();
        bean.setId(user.getId());
        bean.setLogin(user.getLogin());
        bean.setPassword(user.getPassword());
        bean.setEmail(user.getEmail());
        bean.setCreatedDate(StringUtil.dateFormat.format(user.getCreatedDate()));
        bean.setRole(user.getRole().ordinal());
        bean.setBan(user.getBan());
        bean.setEmail(user.getEmail() != null ? user.getEmail() : "");

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
