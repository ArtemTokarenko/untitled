package untitled.entity;

import javax.persistence.*;

/**
 * Created by Ультрамар on 06.09.2016.
 */
@Entity
@Table(name="PHOTO_OF_PRODUCT")
public class PhotoOfProduct {


    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    @Column(name = "URL")
    private String url;
    public String geturl() { return url; }
    public void seturl(String url) { this.url = url; }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }


}
