package kot.laborki.main.Services;

import kot.laborki.main.Entities.AppUser;
import kot.laborki.main.Repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    public AppUser findUser(String firstName, String lastName, String departmentName){
        return appUserRepository.findUser(firstName,lastName,departmentName);
    };
    public List<AppUser> findAllUsers(){
        return appUserRepository.findAllUsers();
    };
    public List<AppUser> findUsersFromDepartment(String departmentName){
        return appUserRepository.findUsersFromDepartment(departmentName);
    };
    public List<AppUser> findUsersWithPaymentIsHigher(float payment){
        return appUserRepository.findUsersWithPaymentIsHigher(payment);
    };

    //public AppUser createUser(AppUser appUser);

    //public AppUser updateAppUser(AppUser appUser);

    //public void deleteAppUser(long id);

    //public AppUser findUserById(long id);
}
