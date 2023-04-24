package team.skyprojava.websitebackend.service.impl;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;
import team.skyprojava.websitebackend.dto.UserDto;
import team.skyprojava.websitebackend.mapper.UserMapper;
import team.skyprojava.websitebackend.repository.UserRepository;
import team.skyprojava.websitebackend.service.UserService;

import java.util.List;
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    private final UserServiceImpl userDetailsService;
    private final UserMapper userMapper;
    @Override
    public List<UserDto> getUsers() {
        logger.info("Получение всех пользователей");
        return userMapper.toDto(userRepository.findAll());
    }

    @Override
    public UserDto getUserById(int id) {
        logger.info("Получение пользователей по id");
        return userMapper.toDto(userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Пользователь с id " + id + " не найден!")));
    }
}
