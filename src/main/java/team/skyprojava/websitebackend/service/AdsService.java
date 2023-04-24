package team.skyprojava.websitebackend.service;

import org.springframework.security.core.Authentication;
import team.skyprojava.websitebackend.dto.AdsDto;
import team.skyprojava.websitebackend.dto.CreateAdsDto;
import team.skyprojava.websitebackend.dto.ResponseWrapperAdsDto;
import team.skyprojava.websitebackend.entity.Ads;

import java.io.IOException;
import java.util.List;

public interface AdsService {

    Ads getAds(long id);

    ResponseWrapperAdsDto getAllAds();

    AdsDto createAds(CreateAdsDto createAdsDto, Authentication authentication) throws IOException;

}
