package springboot.usermanagementsystem.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.usermanagementsystem.dao.mapper.UserMapper;
import springboot.usermanagementsystem.dao.request.UserRequestDto;
import springboot.usermanagementsystem.dao.response.UserResponseDto;
import springboot.usermanagementsystem.model.Status;
import springboot.usermanagementsystem.model.User;
import springboot.usermanagementsystem.service.UserService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService,
                          UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/user")
    List<UserResponseDto> getAll() {
        return userService.getAll().stream()
                .map(userMapper::toResponseDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/user/{id}")
    UserResponseDto getById(@PathVariable Long id) {
        User user = userService.get(id);
        if (user.getStatus().equals(Status.ACTIVE)) {
            user.setStatus(Status.INACTIVE);
        } else {
            user.setStatus(Status.ACTIVE);
        }
        user = userService.save(user);
        return userMapper.toResponseDto(user);
    }

    @PostMapping("/user/new")
    UserResponseDto create(@RequestBody @Valid UserRequestDto userRequestDto) {
        return userMapper.toResponseDto(
                userService.save(
                        userMapper.toModel(userRequestDto)));
    }

    @PostMapping("/user/{id}/edit")
    UserResponseDto update(@PathVariable Long id,
                           @RequestBody @Valid UserRequestDto userRequestDto) {
        User user = userMapper.toModel(userRequestDto);
        user.setId(id);
        return userMapper.toResponseDto(userService.save(user));

    }
}
