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
    public ResponseEntity<?> updateAdsImage(@PathVariable int id, @RequestBody String image) {
        System.out.println("Проверка отклика image_id");
        return ResponseEntity.ok().build();
    }
}
