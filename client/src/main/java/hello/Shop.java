package hello;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Shop
{

    private long id;
    private String firstName, lastName, sellerName;



    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getSellerName() {
        return sellerName;
    }
}
