package team.skyprojava.websitebackend.service.impl;

import org.springframework.stereotype.Service;
import team.skyprojava.websitebackend.dto.NewPassword;
import team.skyprojava.websitebackend.dto.User;
import team.skyprojava.websitebackend.service.UserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Optional<NewPassword> setNewPassword() {
        return Optional.empty();
    }

    @Override
    public Optional<User> getUser() {
        return Optional.empty();
    }

    @Override
    public Optional<User> updateUser(User user) {
        return Optional.empty();
    }

    @Override
    public void updateUserImage(String image) {

    }
}
