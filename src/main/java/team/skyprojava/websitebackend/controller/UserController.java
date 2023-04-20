package team.skyprojava.websitebackend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import team.skyprojava.websitebackend.dto.NewPasswordDto;
import team.skyprojava.websitebackend.dto.UserDto;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    @PostMapping("/set_password")
    public ResponseEntity<?> setPassword(@RequestBody NewPasswordDto newPasswordDto) {
        System.out.println("Проверка set_password");
        return ResponseEntity.ok().build();

    }

    @GetMapping("/me")
    public ResponseEntity<UserDto> getUser() {
        System.out.println("Проверка get_me");
        return ResponseEntity.ok(new UserDto());
    }

    @PatchMapping("/me")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto) {
        System.out.println("Проверка_me");
        return ResponseEntity.ok(new UserDto());
    }

    @PatchMapping("/me/image")
    public ResponseEntity<Void> updateUserImage(@RequestBody MultipartFile image) {
        System.out.println("Проверка_me_image");
        return ResponseEntity.ok().build();
    }


}
