package team.skyprojava.websitebackend.dto;

import lombok.Data;

@Data
public class LoginReq {
    private String password;
    private String username;
}
