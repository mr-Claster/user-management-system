package springboot.usermanagementsystem.dao.response;

import lombok.Data;
import springboot.usermanagementsystem.model.Role;
import springboot.usermanagementsystem.model.Status;

@Data
public class UserResponseDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Role role;
    private Status status;
}
