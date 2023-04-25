package team.skyprojava.websitebackend.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
@Getter
@Setter
@RequiredArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User author;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "text")
    private String text;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ads_id")
    private Ads ads;
}
