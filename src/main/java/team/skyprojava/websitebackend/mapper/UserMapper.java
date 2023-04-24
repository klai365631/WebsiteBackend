package team.skyprojava.websitebackend.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import team.skyprojava.websitebackend.dto.RegisterReqDto;
import team.skyprojava.websitebackend.dto.UserDto;
import team.skyprojava.websitebackend.entity.User;

@Mapper
@Component
public interface UserMapper{

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "userImage", ignore = true)
    @Mapping(target = "role", ignore = true)
    @Mapping(target = "username", ignore = true)
    @Mapping(target = "password", ignore = true)
    User toEntity(UserDto userDto);

    @Mapping(target = "role", defaultValue = "USER")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "email", ignore = true)
    @Mapping(target = "userImage", ignore = true)
    User toEntity(RegisterReqDto registerReqDto);

    @Mapping(target = "image", expression = "java(user.getUserImage().getId().toString())")
    UserDto toDto(User user);
}