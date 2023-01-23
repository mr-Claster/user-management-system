package springboot.usermanagementsystem.dao.mapper;


import org.springframework.stereotype.Component;
import springboot.usermanagementsystem.dao.request.UserRequestDto;
import springboot.usermanagementsystem.dao.response.UserResponseDto;
import springboot.usermanagementsystem.model.Status;
import springboot.usermanagementsystem.model.User;
import springboot.usermanagementsystem.service.UserRoleService;

@Component
public class UserMapper {
    private final UserRoleService userRoleService;

    public UserMapper(UserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }

    public User toModel(UserRequestDto dto) {
        User user = new User();
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setPassword(dto.getPassword());
        user.setUsername(dto.getUsername());
        user.setStatus(Status.valueOf(dto.getStatus()));
        user.setRole(userRoleService.get(dto.getUserRole()));
        return user;
    }

    public UserResponseDto toResponseDto(User user) {
        UserResponseDto dto = new UserResponseDto();
        dto.setId(user.getId());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setStatus(user.getStatus().toString());
        dto.setUserRole(user.getRole().getRole());
        return dto;
    }
}
