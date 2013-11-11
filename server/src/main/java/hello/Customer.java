package hello;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    @Column(name="providerName")
    private String providerName;


    protected Customer() {}

    public Customer(String providerName) {
        this.providerName = providerName;

    }
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }  }








