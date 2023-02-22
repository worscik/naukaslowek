package pl.naukaslowek.UserService;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
public class UserWebController {

    UserService userService;

    public UserWebController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public boolean addUser(@RequestBody @Valid UserDto userDto, Errors erros){
        if(erros.hasErrors()) {
            return false;
        }
        return userService.addUser(userDto);
    }

}
