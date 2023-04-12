package team.skyprojava.websitebackend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import team.skyprojava.websitebackend.dto.Ads;
import team.skyprojava.websitebackend.dto.Comment;
import team.skyprojava.websitebackend.dto.CreateAds;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/ads")
@RequiredArgsConstructor
public class AdsController {

    @GetMapping
    public ResponseEntity<?> getAds() {
        System.out.println("Проверка отклика getAds");
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> addAds(@RequestBody Ads ads) {
        System.out.println("Проверка отклика addAds");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{ad_pk}/comments")
    public ResponseEntity<?> getComments(@PathVariable String ad_pk) {
        System.out.println("Проверка отклика getComments");
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{ad_pk}/comments")
    public ResponseEntity<?> addComments(@PathVariable String ad_pk, @RequestBody Comment comment) {
        System.out.println("Проверка отклика addComments");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getFullAd(@PathVariable int id) {
        System.out.println("Проверка отклика getFullAd_id");
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeAds(@PathVariable int id) {
        System.out.println("Проверка отклика  removeAd_id");
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateAds(@PathVariable int id, @RequestBody CreateAds createAds) {
        System.out.println("Проверка отклика  updateAds_id");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{ad_pk}/comments/{id}")
    public ResponseEntity<?> getComments(@PathVariable String ad_pk, @PathVariable int id) {
        System.out.println("Проверка отклика  getComments_id");
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{ad_pk}/comments/{id}")
    public ResponseEntity<?> deleteComments(@PathVariable String ad_pk, @PathVariable int id) {
        System.out.println("Проверка отклика  deleteComments_id");
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{ad_pk}/comments/{id}")
    public ResponseEntity<?> updateComments(@PathVariable String ad_pk, @PathVariable int id, @RequestBody Comment comment) {
        System.out.println("Проверка отклика  updateComment_id");
        return ResponseEntity.ok().build();
    }

    @GetMapping("/me")
    public ResponseEntity<?> getAdsMe() {
        System.out.println("Проверка отклика getAdsMe");
        return ResponseEntity.ok().build();
    }
}
