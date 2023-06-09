package team.skyprojava.websitebackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class UserDto {
    private int id;
    @Schema(example = "user@user.ru")
    private String email;
    @NotBlank
    @Size(min = 3)
    private String firstName;
    @NotBlank
    @Size(min = 3)
    private String lastName;
    private String phone;
    private String image;

}
