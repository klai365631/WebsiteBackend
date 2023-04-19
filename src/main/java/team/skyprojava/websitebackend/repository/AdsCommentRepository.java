package team.skyprojava.websitebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.skyprojava.websitebackend.entity.AdsComment;

import java.util.List;
import java.util.Optional;

public interface AdsCommentRepository extends JpaRepository<AdsComment, Long> {

    List<AdsComment> findAllByAdsId(long adsId);

    Optional<AdsComment> findByIdAndAdsId(long id, long adsId);
}