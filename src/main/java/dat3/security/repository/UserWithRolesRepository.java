package dat3.security.repository;

import dat3.security.entity.UserWithRoles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface
UserWithRolesRepository extends JpaRepository<UserWithRoles,String> {
    Boolean existsByEmail(String email);
    boolean existsByEmailAndUsernameNotLike(String email, String username);
}
