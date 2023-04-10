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
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> addAds(@RequestBody Ads ads) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{ad_pk}/comments")
    public ResponseEntity<?> getComments(@RequestParam int ad_pk) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{ad_pk}/comments")
    public ResponseEntity<?> addComments(@RequestParam int ad_pk, @RequestBody Comment comment) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getFullAd(@RequestParam int id) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeAds(@RequestParam int id) {
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateAds(@RequestParam int id, @RequestBody CreateAds createAds) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{ad_pk}/comments/{id}")
    public ResponseEntity<?> getComments(@RequestParam int id, int ad_pk) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{ad_pk}/comments/{id}")
    public ResponseEntity<?> deleteComments(@RequestParam int id, int ad_pk) {
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{ad_pk}/comments/{id}")
    public ResponseEntity<?> updateComments(@RequestParam int id, int ad_pk, @RequestBody Comment comment) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/me")
    public ResponseEntity<?> getAdsMe() {
        return ResponseEntity.ok().build();
    }
}
