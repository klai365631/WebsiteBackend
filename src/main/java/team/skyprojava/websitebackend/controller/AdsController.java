package team.skyprojava.websitebackend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import team.skyprojava.websitebackend.dto.*;

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
    public ResponseEntity<Ads> addAds(@RequestBody CreateAds createAds, String image) {
        System.out.println("Проверка отклика addAds");
        return ResponseEntity.ok(new Ads());
    }

    @GetMapping("/{ad_pk}/comments")
    public ResponseEntity<ResponseWrapperComment> getComments(@PathVariable String ad_pk) {
        System.out.println("Проверка отклика getComments");
        return ResponseEntity.ok(new ResponseWrapperComment());
    }

    @PostMapping("/{ad_pk}/comments")
    public ResponseEntity<Comment> addComments(@PathVariable String ad_pk, @RequestBody Comment comment) {
        System.out.println("Проверка отклика addComments");
        return ResponseEntity.ok(new Comment());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FullAds> getFullAd(@PathVariable int id) {
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

    @GetMapping("/{ad_pk}/comments/{id}")
    public ResponseEntity<Comment> getComments(@PathVariable String ad_pk, @PathVariable int id) {
        System.out.println("Проверка отклика  getComments_id");
        return ResponseEntity.ok(new Comment());
    }

    @DeleteMapping("/{ad_pk}/comments/{id}")
    public ResponseEntity<?> deleteComments(@PathVariable String ad_pk, @PathVariable int id) {
        System.out.println("Проверка отклика  deleteComments_id");
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{ad_pk}/comments/{id}")
    public ResponseEntity<Comment> updateComments(@PathVariable String ad_pk, @PathVariable int id, @RequestBody Comment comment) {
        System.out.println("Проверка отклика  updateComment_id");
        return ResponseEntity.ok(new Comment());
    }

    @GetMapping("/me")
    public ResponseEntity<ResponseWrapperAds> getAdsMe() {
        System.out.println("Проверка отклика getAdsMe");
        return ResponseEntity.ok(new ResponseWrapperAds());
    }
}
