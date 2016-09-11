package untitled.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ультрамар on 06.09.2016.
 */
@Entity
@Table(name = "COMMENT")
public class Comment {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    @Column(name = "TEXT")
    private String text;
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ID")
    private User user;
    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    @Column(name = "CREATED_DATE")
    private Date createdDate = new Date();
    public Date getCreatedDate() { return createdDate; }
    public void setCreatedDate(Date createdDate) { this.createdDate = createdDate; }
}
