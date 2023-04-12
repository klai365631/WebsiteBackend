package team.skyprojava.websitebackend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import team.skyprojava.websitebackend.dto.NewPassword;
import team.skyprojava.websitebackend.dto.User;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    @PostMapping("/set_password")
    public ResponseEntity<NewPassword> setPassword(@RequestBody NewPassword newPassword) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/me")
    public ResponseEntity<?> getUser() {
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/me")
    public ResponseEntity<?> updateUser(@RequestBody User user) {
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/me/image")
    public ResponseEntity<?> updateUserImage(@RequestBody String image) {
        return ResponseEntity.ok().build();
    }


}
