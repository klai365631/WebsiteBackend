package team.skyprojava.websitebackend.service;

import java.util.List;
import java.util.Optional;

public interface ImageService {
    Optional<List<String>> updateAdsImage(int id, String image);
}
