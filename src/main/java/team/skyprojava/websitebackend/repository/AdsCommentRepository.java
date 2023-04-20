package team.skyprojava.websitebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.skyprojava.websitebackend.entity.Comment;

import java.util.List;
import java.util.Optional;

public interface AdsCommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByAdsId(long adsId);

    Optional<Comment> findByIdAndAdsId(long id, long adsId);
}