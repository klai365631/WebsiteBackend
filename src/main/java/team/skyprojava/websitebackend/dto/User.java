package team.skyprojava.websitebackend.dto;

import lombok.Data;

@Data
public class User {
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String regDate;
    private String city;
    private String image;
}
