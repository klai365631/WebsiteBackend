package team.skyprojava.websitebackend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import team.skyprojava.websitebackend.dto.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/ads")
@RequiredArgsConstructor
public class AdsController {

    @GetMapping
    public ResponseEntity<ResponseWrapperAdsDto> getAllAds() {
        System.out.println("Проверка отклика getAllAds");
        return ResponseEntity.ok(new ResponseWrapperAdsDto());
    }

    @PostMapping
    public ResponseEntity<AdsDto> addAds(@RequestBody CreateAdsDto createAdsDto, @RequestBody MultipartFile image) {
        System.out.println("Проверка отклика addAds");
        return ResponseEntity.ok(new AdsDto());
    }


    @GetMapping("/{id}")
    public ResponseEntity<FullAdsDto> getAds(@PathVariable int id) {
        System.out.println("Проверка отклика getFullAd_id");
        return ResponseEntity.ok(new FullAdsDto());
    }

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

    @GetMapping("/me")
    public ResponseEntity<ResponseWrapperAdsDto> getAdsMe() {
        System.out.println("Проверка отклика getAdsMe");
        return ResponseEntity.ok(new ResponseWrapperAdsDto());
    }

    @PatchMapping("/{id}/image")
    public ResponseEntity<byte[]> updateAdsImage(@PathVariable int id, @RequestBody MultipartFile image) {
        System.out.println("Проверка отклика image_id");
        return ResponseEntity.ok().build();
    }
}
