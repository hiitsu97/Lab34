package kot.laborki.main.Repositories;

import kot.laborki.main.Entities.AppUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserRepository {
    AppUser findUser(String firstName, String lastName, String departmentName);
    List<AppUser> findAllUsers();
    List<AppUser> findUsersFromDepartment(String departmentName);
    List<AppUser> findUsersWithPaymentIsHigher(float payment);
}
