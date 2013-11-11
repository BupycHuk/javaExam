package hello;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Person {

    private long id;
    private String name;
    private String kontakt;


    public long getId() {
        return id;
    }
   

    public String getName() {
      
        return name;
    }

    public String getKontakt() {

        return kontakt;
    }
}
