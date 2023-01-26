package kot.laborki.main.Services;

import kot.laborki.main.Entities.AppUser;
import kot.laborki.main.Repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppUserBean implements AppUserService{
    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserBean(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }
    @Override
    public AppUser findUser(String firstName, String lastName, String departmentName) {
        return null;
    }

    @Override
    public List<AppUser> findAllUsers() {
        return null;
    }

    @Override
    public List<AppUser> findUsersFromDepartment(String departmentName) {
        return null;
    }

    @Override
    public List<AppUser> findUsersWithPaymentIsHigher(float payment) {
        return null;
    }

    @Override
    public AppUser createUser(AppUser appUser) {
        return null;
    }

    @Override
    public AppUser updateAppUser(AppUser appUser) {
        return null;
    }

    @Override
    public void deleteAppUser(long id) {

    }

    @Override
    public AppUser findUserById(long id) {
        return null;
    }
}
