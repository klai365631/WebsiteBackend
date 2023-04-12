package team.skyprojava.websitebackend.service;

import team.skyprojava.websitebackend.dto.NewPassword;
import team.skyprojava.websitebackend.dto.User;

import java.util.Optional;

public interface UserService {
    Optional<NewPassword> setNewPassword();
    Optional<User> getUser();
    Optional<User> updateUser(User user);
    void updateUserImage(String image);
}
