package hello;

import javax.persistence.*;

@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private long id;
<<<<<<< HEAD
    @Column(name="thingName")
    private String thingName;
    @Column(name="thingSum")
    private String thingSum;
=======
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
>>>>>>> 66b174e3f4d0f182161198392569919aedb230ce
    @Column(name="sellerName")
    private String sellerName;
    protected Shop() {}

<<<<<<< HEAD
    public Shop(String thingName, String thingSum, String sellerName) {
        this.thingName = thingName;
        this.thingSum = thingSum;
=======
    public Shop(String firstName, String lastName, String sellerName) {
        this.firstName = firstName;
        this.lastName = lastName;
>>>>>>> 66b174e3f4d0f182161198392569919aedb230ce
        this.sellerName = sellerName;
    }


<<<<<<< HEAD
    public String getThingName() {
        return thingName;
    }

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    public String getThingSum() {
        return thingSum;
    }

    public void setThingSum(String thingSum) {
        this.thingSum = thingSum;
=======
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
>>>>>>> 66b174e3f4d0f182161198392569919aedb230ce
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