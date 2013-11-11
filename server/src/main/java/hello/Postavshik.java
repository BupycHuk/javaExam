package hello;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Postavshik {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="Name")
    private String Name;
    @Column(kontakt="Kontact")
    private String Kontact;

    private String getName() {
        return Name;
    }

    public void setName(String Kontakt) {
        this.Name = Name;
    }
    private String getKontact() {
        return Kontakt;
    }

    public void setKontact(String Kontakt) {
        this.Kontact = Kontakt;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }

    @OneToMany(mappedBy="groups")
    @JsonIgnore
    private Set<Students> students;


    public Set<Students> getStudents() {
        return students;
    }
}
