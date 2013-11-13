package hello;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Shop
{

    private long id;
    private String thingName, thingSum, sellerName;



    public long getId() {
        return id;
    }

    public String getThingName() {
        return thingName;
    }

    public String getThingSum() {
        return thingSum;
    }
    public String getSellerName() {
        return sellerName;
    }
}
