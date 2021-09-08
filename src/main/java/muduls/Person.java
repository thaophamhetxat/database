package muduls;

import javax.persistence.*;
import java.sql.Date;
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPerson;
    String userName;
    String passWord;
    String email;
    int phone;
    Date date;
    String sex;
    String avatar;

    @ManyToOne
    private  Role role;
}
