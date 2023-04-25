package team.skyprojava.websitebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.skyprojava.websitebackend.entity.Ads;

import java.util.List;


public interface AdsRepository extends JpaRepository<Ads, Integer> {

    List<Ads> findAllByAuthorId(Integer id);
}
