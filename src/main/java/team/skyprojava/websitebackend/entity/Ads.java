package team.skyprojava.websitebackend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ads")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Ads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ads_id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;
    @Column(name = "price")
    private int price;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @OneToMany
    @JoinColumn(name = "comment_id")
    private List<Comment> comments;
    @OneToMany
    @JoinColumn(name = "ads_image_id")
    private List<AdsImage> adsImage;
}
