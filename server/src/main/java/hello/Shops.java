
package hello;

import javax.persistence.*;

@Entity
public class Shops {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Column(name="Name")
    private String Name;
    @Column(name="Contacts")
    private Character Contacts;


    protected Shops() {}

    public Shops(String Name,Character Contacts) {
        this.Name = Name;
        this.Contacts=Contacts;

    }


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Character getContacts() {
        return Contacts;
    }

    public void setContacts(Character Contacts) {
        this.Contacts = Contacts;
    }



    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }
}

