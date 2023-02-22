package pl.naukaslowek.UserService;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UserWebController {

    UserService userService;

    public UserWebController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public boolean addUser(@RequestBody UserDto userDto){
        return userService.addUser(userDto);
    }

}
