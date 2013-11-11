package hello;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Customer {

    private long id;
    private String buyum_ati;
    private boolean turabi;


    public long getId() {
        return id;
    }

    public String getFirstName() {
        return buyum_ati;
    }

    public boolean getLastName() {
        return turabi;
    }

    public boolean getTurabi() {
        return turabi;
    }

    public String getbuyum_ati() {
        return buyum_ati;
    }
}
