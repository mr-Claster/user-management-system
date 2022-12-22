package springboot.usermanagementsystem.dao.request;

import jakarta.validation.constraints.Pattern;
import lombok.Data;
import springboot.usermanagementsystem.model.Role;

@Data
public class UserRequestDto {
    private final String PATTERN_ONLY_LETTERS = "^[A-Za-z]+$";
    private final String PATTERN_PASSWORD = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).+$";

    @Pattern(regexp = PATTERN_ONLY_LETTERS)
    private String firstName;
    @Pattern(regexp = PATTERN_ONLY_LETTERS)
    private String lastName;
    @Pattern(regexp = PATTERN_ONLY_LETTERS)
    private String username;
    @Pattern(regexp = PATTERN_PASSWORD)
    private String password;
    private String status;
    private Role role;
}
