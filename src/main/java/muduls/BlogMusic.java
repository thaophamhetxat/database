package muduls;

import javax.persistence.*;

@Entity
public class BlogMusic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idBlog;
    String fileMusic;
    String fileImage;
    private double price;
    int views;
    int likes;
    int dislike;

    @ManyToOne
    private NhacSy nhacSy;
    @ManyToOne
    private CaSy caSy;
    @ManyToOne
    private TheLoai theLoai;
    @ManyToOne
    private Person person;

}
