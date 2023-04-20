package team.skyprojava.websitebackend.service.impl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.skyprojava.websitebackend.controller.AdsController;
import team.skyprojava.websitebackend.dto.AdsDto;
import team.skyprojava.websitebackend.entity.Ads;
import team.skyprojava.websitebackend.repository.AdsRepository;
import team.skyprojava.websitebackend.service.AdsService;

import java.util.List;
@CrossOrigin(value = "http://localhost:3000")
@RequiredArgsConstructor
@RestController
@RequestMapping("/ads")
@Tag(name = "Объявления", description = "AdsController")
public class AdsServiceImpl implements AdsService {

    Logger logger = LoggerFactory.getLogger(AdsController.class);
    private final AdsService adsService;
    private final AdsRepository adsRepository;
    @Override
    public Ads getAds(long id) {
        return null;
    }

    @Operation(summary = "Просмотр всех объявлений",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Все найденные объявления",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = AdsDto[].class)
                            )
                    )
            },
            tags = "Ads"
    )
    @Override
    public List<AdsDto> getAllAds() {
        logger.info("Was invoked method for get all ads");
        return adsMapper.toDto(adsRepository.findAll());
    }


}
