package hello;

import javax.persistence.*;

@Entity
public class Providers {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(name="providerName")
    private String providerName;


    public String getProvidersName() {
        return providerName;
    }

    public void setProvidersName(String providerName) {
        this.providerName = providerName;
    }



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ProvidersId")
    private Providers providers;

    public Providers getProviders() {
        return providers;
    }
}
