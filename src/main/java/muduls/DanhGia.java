package muduls;

import javax.persistence.*;

@Entity
public class DanhGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idDanhGia;
    int rate;  //số sao
    int idPerson;
    int idBlog;

    @ManyToOne
    private Person person;
    @ManyToOne
    private BlogMusic blogMusic;
}
