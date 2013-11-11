package hello;

import javax.persistence.*;

@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private long id;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="sellerName")
    private String sellerName;
    protected Shop() {}

    public Shop(String firstName, String lastName, String sellerName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sellerName = sellerName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }
}