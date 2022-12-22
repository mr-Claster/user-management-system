package springboot.usermanagementsystem.dao.mapper;


import org.springframework.stereotype.Component;
import springboot.usermanagementsystem.dao.request.UserRequestDto;
import springboot.usermanagementsystem.dao.response.UserResponseDto;
import springboot.usermanagementsystem.model.Status;
import springboot.usermanagementsystem.model.User;

@Component
public class UserMapper {
    public User toModel(UserRequestDto dto) {
        User user = new User();
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setPassword(dto.getPassword());
        user.setUsername(dto.getUsername());
        user.setStatus(Status.valueOf(dto.getStatus()));
        user.setRole(dto.getRole());//TODO: check
        return user;
    }

    public UserResponseDto toResponseDto(User user) {
        UserResponseDto dto = new UserResponseDto();
        dto.setId(user.getId());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setStatus(user.getStatus());
        dto.setRole(user.getRole());
        return dto;
    }
}
