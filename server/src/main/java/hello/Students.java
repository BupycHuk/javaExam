package hello;

import javax.persistence.*;

@Entity
public class Students {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="fullName")
    private String fullName;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "groupId")
    private Postavshik postavshik;

    public Postavshik getPostavshik() {
        return postavshik;
    }
}
