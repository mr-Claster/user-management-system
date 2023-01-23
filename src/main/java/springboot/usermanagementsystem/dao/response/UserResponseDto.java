package springboot.usermanagementsystem.dao.response;

import lombok.Data;

@Data
public class UserResponseDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String userRole;
    private String status;
}
