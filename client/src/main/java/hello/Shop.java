package hello;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Shop
{

    private long id;
<<<<<<< HEAD
    private String thingName, thingSum, sellerName;
=======
    private String firstName, lastName, sellerName;
>>>>>>> 66b174e3f4d0f182161198392569919aedb230ce



    public long getId() {
        return id;
    }

<<<<<<< HEAD
    public String getThingName() {
        return thingName;
    }

    public String getThingSum() {
        return thingSum;
=======
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
>>>>>>> 66b174e3f4d0f182161198392569919aedb230ce
    }
    public String getSellerName() {
        return sellerName;
    }
}
