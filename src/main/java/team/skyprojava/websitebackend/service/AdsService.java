package team.skyprojava.websitebackend.service;

import team.skyprojava.websitebackend.dto.AdsDto;
import team.skyprojava.websitebackend.entity.Ads;

import java.util.List;

public interface AdsService {

    Ads getAds(long id);

    List<AdsDto> getAllAds();

}
