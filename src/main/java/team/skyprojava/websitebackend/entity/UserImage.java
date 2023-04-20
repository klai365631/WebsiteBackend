package team.skyprojava.websitebackend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user_image")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class UserImage {
    @Id
    @Column(name = "user_image_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "image")
    private String image;
}
