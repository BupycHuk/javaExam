package hello;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 11/11/13
 * Time: 2:35 PM
 * To change this template use File | Settings | File Templates.
 */
import javax.persistence.*;

@Entity
public class Shops {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    @Column (name = "shop_name")
    private String shop_name;
    @Column (name = "contacts")
    private String contacts;

    protected Shops(){}

    public Shops(String shop_name, String contacts){
        this.shop_name = shop_name;
        this.contacts = contacts;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
