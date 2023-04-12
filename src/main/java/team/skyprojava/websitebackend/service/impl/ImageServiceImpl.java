package team.skyprojava.websitebackend.service.impl;

import org.springframework.stereotype.Service;
import team.skyprojava.websitebackend.service.ImageService;

import java.util.List;
import java.util.Optional;

@Service
public class ImageServiceImpl implements ImageService {
    @Override
    public Optional<List<String>> updateAdsImage(int id, String image) {
        return Optional.empty();
    }
}
