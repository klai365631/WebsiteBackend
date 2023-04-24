package team.skyprojava.websitebackend.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import team.skyprojava.websitebackend.dto.*;
import team.skyprojava.websitebackend.entity.Ads;
import team.skyprojava.websitebackend.service.AdsService;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/ads")
@RequiredArgsConstructor
public class AdsController {

    Logger logger = LoggerFactory.getLogger(AdsController.class);
    private final AdsService adsService;

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
    @GetMapping
    public ResponseEntity<ResponseWrapperAdsDto> getAllAds() {
        ResponseWrapperAdsDto responseWrapperAdsDto = adsService.getAllAds();
        return ResponseEntity.ok(responseWrapperAdsDto);
    }
    @SneakyThrows
    @Operation(summary = "Создание объявления",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Созданное объявление",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = AdsDto.class)
                            )
                    )
            },
            tags = "Ads"
    )
    @PostMapping
    public ResponseEntity<AdsDto> addAds(@RequestBody CreateAdsDto createAdsDto, Authentication authentication) {
        logger.info("Request for add new ad");
        return ResponseEntity.ok(adsService.createAds(createAdsDto, authentication));
    }

    @Operation(summary = "Поиск объявления по id",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Объявление, найденное по id",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                                    schema = @Schema(implementation = Ads.class)
                            )
                    )
            },
            tags = "Ads"
    )
//    @GetMapping("/{id}")
//    public ResponseEntity<FullAdsDto> getAds(@PathVariable long id) {
//        logger.info("Request for get ad by id");
//        return adsService.getAdsDto(id);
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeAds(@PathVariable int id) {
        System.out.println("Проверка отклика  removeAd_id");
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<AdsDto> updateAds(@PathVariable int id, @RequestBody CreateAdsDto createAdsDto) {
        System.out.println("Проверка отклика  updateAds_id");
        return ResponseEntity.ok(new AdsDto());
    }

    @PatchMapping("/{id}/image")
    public ResponseEntity<byte[]> updateAdsImage(@PathVariable int id, @RequestBody MultipartFile image) {
        System.out.println("Проверка отклика image_id");
        return ResponseEntity.ok().build();
    }
}
