package team.skyprojava.websitebackend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import team.skyprojava.websitebackend.dto.AdsDto;
import team.skyprojava.websitebackend.dto.CreateAdsDto;
import team.skyprojava.websitebackend.dto.FullAdsDto;
import team.skyprojava.websitebackend.entity.Ads;

@Mapper
@Component
public interface AdsMapper{
    AdsMapper INSTANCE = Mappers.getMapper(AdsMapper.class);

    @Mapping(source = "pk", target = "id")
    @Mapping(source = "author", target = "author.id")
    @Mapping(target = "adsImage", ignore = true)
    @Mapping(target = "description", ignore = true)
    Ads toEntity(AdsDto adsDto);

    @Mapping(target = "author", ignore = true)
    @Mapping(target = "adsImage", ignore = true)
    @Mapping(target = "id", ignore = true)
    Ads toEntity(CreateAdsDto createAdsDto);

    @Mapping(source = "author.id", target = "author")
    @Mapping(source = "id", target = "pk")
    @Mapping(target = "image", expression = "java(ads.getAdsImage().getId().toString())")
    AdsDto toAdsDto(Ads ads);

    @Mapping(source = "author.firstName", target = "authorFirstName")
    @Mapping(source = "author.lastName", target = "authorLastName")
    @Mapping(source = "author.phone", target = "phone")
    @Mapping(source = "author.email", target = "email")
    @Mapping(target = "image", expression = "java(ads.getAdsImage().getId().toString())")
    @Mapping(source = "id", target = "pk")
    FullAdsDto toDto(Ads ads);
}