package team.skyprojava.websitebackend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ads_image")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class AdsImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ads_image_id")
    private Integer id;
    @Column(name = "image")
    private String image;
}
