package kot.laborki.main.Services;

import kot.laborki.main.Entities.AppUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppUserService {
    AppUser findUser(String firstName, String lastName, String departmentName);
    List<AppUser> findAllUsers();
    List<AppUser> findUsersFromDepartment(String departmentName);
    List<AppUser> findUsersWithPaymentIsHigher(float payment);

    AppUser createUser(AppUser appUser);

    AppUser updateAppUser(AppUser appUser);

    void deleteAppUser(long id);

    AppUser findUserById(long id);
}
