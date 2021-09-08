package muduls;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
public class YeuThich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idYeuThich;
    int idPerson;
    int idBlog;

    @ManyToOne
    private Person person;
    @ManyToOne
    private BlogMusic blogMusic;
}
