package springboot.usermanagementsystem.service;

import springboot.usermanagementsystem.model.UserRole;

public interface UserRoleService {
    UserRole get(Long id);
    UserRole get(String role);
}
