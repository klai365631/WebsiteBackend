package team.skyprojava.websitebackend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/image")
@RequiredArgsConstructor
public class ImageController {

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateAdsImage(@RequestParam int id, @RequestBody String image) {
        return ResponseEntity.ok().build();
    }
}
