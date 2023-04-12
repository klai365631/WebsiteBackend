package team.skyprojava.websitebackend.service.impl;

import org.springframework.stereotype.Service;
import team.skyprojava.websitebackend.dto.*;
import team.skyprojava.websitebackend.service.AdsService;

import java.util.Optional;

@Service
public class AdsServiceImpl implements AdsService {
    @Override
    public Optional<ResponseWrapperAds> getAllAds() {
        return Optional.empty();
    }

    @Override
    public Ads addAds(CreateAds createAds, String image) {
        return null;
    }

    @Override
    public Optional<ResponseWrapperComment> getComments(String adPk) {
        return Optional.empty();
    }

    @Override
    public Comment addComments(String adPk, Comment comment) {
        return null;
    }

    @Override
    public Optional<FullAds> getFullAd(int id) {
        return Optional.empty();
    }

    @Override
    public void removeAds(int id) {

    }

    @Override
    public Optional<Ads> updateAds(int id, CreateAds createAds) {
        return Optional.empty();
    }

    @Override
    public Optional<Comment> getCommentsById(String adPk, int id) {
        return Optional.empty();
    }

    @Override
    public void deleteComments(String adPk, int id) {

    }

    @Override
    public Optional<Comment> updateComments(String adPk, int id, Comment comment) {
        return Optional.empty();
    }

    @Override
    public Optional<ResponseWrapperAds> getAdsMe() {
        return Optional.empty();
    }
}
