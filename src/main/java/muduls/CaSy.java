package muduls;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CaSy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idCaSy;
    String nameCaSy;
}
