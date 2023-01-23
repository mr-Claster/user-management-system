package springboot.usermanagementsystem.service;

import springboot.usermanagementsystem.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);

    User get(Long id);

    List<User> getAll();

    Optional<User> findByUsername(String username);
}
