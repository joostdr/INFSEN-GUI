package main.models;

import javax.persistence.*;

/**
 * Created by joost on 14-6-2016.
 */
@Entity
@Table(name = "product")
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String productName;
    @Column(name = "description")
    private String productDescription;
    @Column(name = "category")
    private String category;
    @Column(name = "price")
    private int price;
    @Column(name = "filename")
    private String filename;

    public Product() {
    }

    public Product(int id, String productName, String productDeescription, String category, int price, String filename) {
        this.id = id;
        this.productName = productName;
        this.productDescription = productDeescription;
        this.category = category;
        this.price = price;
        this.filename = filename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
