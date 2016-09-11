package untitled.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Ультрамар on 06.09.2016.
 */
@Entity
@Table(name="PRODUCT")
public class Product {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    @Column(name = "TEXT")
    private String text;
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    @Column(name = "ACTIVE")
    private Boolean active = true;
    public Boolean getActive() {return active; }
    public void setActive(Boolean active){ this.active = active; }

    @Column(name = "CREATED_DATE", nullable = false)
    private Date createdDate = new Date();
    public Date getCreatedDate() { return createdDate; }
    public void setCreatedDate(Date createdDate) { this.createdDate = createdDate; }

//    @OneToMany(targetEntity=PhotoOfProduct.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
//    @JoinTable(name="PHOTO_OF_PRODUCT", joinColumns=@JoinColumn(name="ID"), inverseJoinColumns=@JoinColumn(name="PRODUCT_ID"))
//    private List<PhotoOfProduct> photoOfProduct;
//    public List<PhotoOfProduct> getPhotoOfProduct() { return photoOfProduct; }
//    public void setPhotoOfProduct(List<PhotoOfProduct> photoOfProduct) { this.photoOfProduct = photoOfProduct; }


    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL, CascadeType.PERSIST}, mappedBy = "product")
    private List<PhotoOfProduct> comments;
    public List<PhotoOfProduct> getComments() { return comments; }
    public void setComments(List<PhotoOfProduct> comments) { this.comments = comments; }


}
