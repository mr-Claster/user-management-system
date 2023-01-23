package springboot.usermanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.usermanagementsystem.model.UserRole;
import java.util.Optional;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    Optional<UserRole> findUserRoleByRole(String role);
}
