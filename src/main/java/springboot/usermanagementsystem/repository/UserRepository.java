package springboot.usermanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.usermanagementsystem.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String name);
}
