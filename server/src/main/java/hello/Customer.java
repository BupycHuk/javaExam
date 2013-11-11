package hello;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Column(name="buyum_ati")
    private String buyum_ati;
    @Column(name="turabi")
    private boolean turabi;

    protected Customer() {}

    public Customer(String firstName, boolean turabi) {
        this.buyum_ati = buyum_ati;
        this.turabi = turabi;
    }


    public String getBuyum_ati() {
        return buyum_ati;
    }

    public void setBuyum_ati(String buyum_ati) {
        this.buyum_ati = buyum_ati;
    }

    public boolean getTurabi() {
        return turabi;
    }

    public void setTurabi(boolean turabi) {
        this.turabi = turabi;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }
}

