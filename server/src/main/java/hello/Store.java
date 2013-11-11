package hello;

import javax.persistence.*;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Buiumdar")
    private String Buiumdar;
    @Column(name="Satuuchu")
    private String Satuuchu;


    public Store(String Buiumdar, String Satuuchu) {
        this.Buiumdar = Buiumdar;
        this.Satuuchu = Satuuchu;
    }


    public String getBuiumdar() {
        return Buiumdar;
    }

    public void setBuiumdar(String Buiumdar) {
        this.Buiumdar = Buiumdar;
    }

    public String getSatuuchu() {
        return Satuuchu;
    }

    public void setSatuuchu(String Satuuchu) {
        this.Satuuchu = Satuuchu;
    }

}