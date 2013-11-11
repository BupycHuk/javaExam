package hello;
import javax.persistence.*;

@Entity

public class Buium {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    @Column (name = "BuiumAty")
    private String buiumAty;

    protected Buium(){}

    public Buium(String buiumAty){

        this.buiumAty = buiumAty;

    }

    public String getBuiumAty() {
        return buiumAty;
    }

    public void setBuiumAty(String buiumAty) {
        this.buiumAty = buiumAty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
} 