package hello;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Buium {
    private long id;
    private String BuiumAty;


    public long getId() {
        return id;
    }

    public String getBuiumAty() {
        return BuiumAty;
    }


}
