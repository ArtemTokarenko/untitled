package untitled.entity;

import untitled.enumm.Role;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    @Column(name = "LOGIN")
    private String login;
    public String getLogin() {return login;}
    public void setLogin(String login) {this.login = login;}

    @Column(name = "PASSWORD")
    private String password;
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    @Column(name = "EMAIL")
    private String email;
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    @Column(name = "CREATED_DATE", nullable = false)
    private Date createdDate = new Date();
    public Date getCreatedDate() { return createdDate; }
    public void setCreatedDate(Date createdDate) { this.createdDate = createdDate; }

    @Column (name = "ROLE", nullable = false)
    @Enumerated(value = EnumType.ORDINAL)
    private Role role;
    public Role getRole() {return role;}
    public void setRole(Role role) {this.role = role;}

    @Column(name = "BAN", columnDefinition = "boolean default false", nullable = false)
    private boolean ban = false;
    public boolean getBan() { return ban; }
    public void setBan(boolean ban) { this.ban = ban; }


//    @ManyToMany(targetEntity=BuyList.class, cascade=CascadeType.ALL, fetch=FetchType.LAZY)
//    @JoinTable(name="BuyList", joinColumns=@JoinColumn(name="ID"), inverseJoinColumns=@JoinColumn(name="USER_ID"))
//    private List<BuyList> buyList;
//    public List<BuyList> getCategories() { return buyList; }
//    public void setCategories(List<BuyList> buyList) { this.buyList = buyList; }

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL, CascadeType.PERSIST}, mappedBy = "user")
    private List<Comment> comments;
    public List<Comment> getComments() { return comments; }
    public void setComments(List<Comment> comments) { this.comments = comments; }



}
