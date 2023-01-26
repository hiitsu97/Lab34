package kot.laborki.main.Controllers;

import kot.laborki.main.Entities.AppUser;
import kot.laborki.main.Routers.Router;
import kot.laborki.main.Services.AppUserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppUsersController {

    private final AppUserBean appUserService;

    @Autowired
    public AppUsersController(AppUserBean appUserService) {
        this.appUserService = appUserService;
    }
    @GetMapping(Router.APPUSERS_PATH)
    public List<AppUser> getAllUsers(){
        return appUserService.findAllUsers();
    }
    @GetMapping(Router.APPUSER_PATH)
    public AppUser getUser(@PathVariable long id){
        return appUserService.findUserById(id);
    }
    @PostMapping(Router.APPUSERS_PATH)
    public AppUser postAppUser(@RequestBody AppUser appUser) {
        return appUserService.createUser(appUser);
    }
    @PutMapping(Router.APPUSER_PATH)
    public AppUser putAppUser(@PathVariable long id, @RequestBody AppUser appUser) {
        appUser.setId(id);
        return appUserService.updateAppUser(appUser);
    }
    @DeleteMapping(Router.APPUSER_PATH)
    public void deleteAppUser(@PathVariable long id) {
        appUserService.deleteAppUser(id);
    }
}
