package hello;

import javax.persistence.*;

@Entity
public class Shops {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="Name")
    private String Name;
    @Column(name="Tovars")
    private String Tovars;

    public Shops(String name, String surname) {
        this.Name=name;
        this.Tovars=surname;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }

    public String getTovars() {
        return Tovars;
    }

    public void setTovars(String tovars) {
        Tovars = tovars;
    }
}
