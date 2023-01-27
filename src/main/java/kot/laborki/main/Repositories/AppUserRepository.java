package kot.laborki.main.Repositories;

import kot.laborki.main.Entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findUser(String firstName, String lastName, String departmentName);
    List<AppUser> findAllUsers();
    List<AppUser> findUsersFromDepartment(String departmentName);
    List<AppUser> findUsersWithPaymentIsHigher(float payment);
}
