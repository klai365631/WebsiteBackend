package team.skyprojava.websitebackend.service;

import team.skyprojava.websitebackend.dto.*;

import java.util.Optional;

public interface AdsService {
    Optional<ResponseWrapperAds> getAllAds();
    Ads addAds(CreateAds createAds, String image);
    Optional<ResponseWrapperComment> getComments(String adPk);
    Comment addComments(String adPk, Comment comment);
    Optional<FullAds> getFullAd(int id);
    void removeAds(int id);
    Optional<Ads> updateAds(int id, CreateAds createAds);
    Optional<Comment> getCommentsById(String adPk, int id);
    void deleteComments(String adPk, int id);
    Optional<Comment> updateComments(String adPk, int id, Comment comment);
    Optional<ResponseWrapperAds> getAdsMe();
}
