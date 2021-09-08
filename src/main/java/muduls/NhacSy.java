package muduls;

import javax.persistence.*;

@Entity
public class NhacSy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idNhacSy;
    String nameNhacSy;

}
