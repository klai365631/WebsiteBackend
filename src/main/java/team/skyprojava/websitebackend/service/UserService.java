package team.skyprojava.websitebackend.service;

import team.skyprojava.websitebackend.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getUsers();

    UserDto getUserById(int id);
}
