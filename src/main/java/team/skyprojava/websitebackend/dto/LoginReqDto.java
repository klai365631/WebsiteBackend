package team.skyprojava.websitebackend.dto;

import lombok.Data;

@Data
public class LoginReqDto {
    private String password;
    private String username;
}
