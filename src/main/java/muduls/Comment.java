package muduls;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idComment;
    String comments;

    @ManyToOne
    private Person person;
    @ManyToOne
    private BlogMusic blogMusic;
}
