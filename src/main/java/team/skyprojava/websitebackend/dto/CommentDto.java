package team.skyprojava.websitebackend.dto;

import lombok.Data;

@Data
public class CommentDto {
    private int author;
    private String authorImage;
    private String authorFirstName;
    private int createdAt;
    private int pk;
    private String text;
}
