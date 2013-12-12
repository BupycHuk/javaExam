package hello.Model;

import javax.persistence.*;

/**
 * Created by Admin on 12.12.13.
 */
@Entity
public class Cassa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="chet")
    private Integer chet;

    public void setChet(Integer chet) {
        this.chet = chet;
    }

    public Integer getChet() {
        return chet;
    }
}
