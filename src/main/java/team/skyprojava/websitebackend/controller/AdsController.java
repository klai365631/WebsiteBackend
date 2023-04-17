package team.skyprojava.websitebackend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public ResponseEntity<ResponseWrapperAds> getAllAds() {
        System.out.println("Проверка отклика getAllAds");
        return ResponseEntity.ok(new ResponseWrapperAds());
    }

    @PostMapping
    public ResponseEntity<Ads> addAds(@RequestBody CreateAds createAds, @RequestBody String image) {
        System.out.println("Проверка отклика addAds");
        return ResponseEntity.ok(new Ads());
    }


    @GetMapping("/{id}")
    public ResponseEntity<FullAds> getAds(@PathVariable int id) {
        System.out.println("Проверка отклика getFullAd_id");
        return ResponseEntity.ok(new FullAds());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeAds(@PathVariable int id) {
        System.out.println("Проверка отклика  removeAd_id");
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Ads> updateAds(@PathVariable int id, @RequestBody CreateAds createAds) {
        System.out.println("Проверка отклика  updateAds_id");
        return ResponseEntity.ok(new Ads());
    }

    @GetMapping("/me")
    public ResponseEntity<ResponseWrapperAds> getAdsMe() {
        System.out.println("Проверка отклика getAdsMe");
        return ResponseEntity.ok(new ResponseWrapperAds());
    }

    @PatchMapping("/{id}/image")
    public ResponseEntity<List<String>> updateAdsImage(@PathVariable int id, @RequestBody String image) {
        System.out.println("Проверка отклика image_id");
        return ResponseEntity.ok(new ArrayList<>());
    }
}
