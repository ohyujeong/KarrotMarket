package Numble.KarrotMarket.controller;

import Numble.KarrotMarket.domain.User;
import Numble.KarrotMarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "user/signup")
    public String createForm(){
        return "users/createUser";
    }

    @PostMapping(value = "user/signup")
    public String createUser(UserForm form){
        User user = new User();
        user.setId(form.getId());
        user.setPwd(form.getPwd());
        user.setName(form.getName());
        user.setPhone(form.getPhone());
        user.setNickname(form.getNickname());

        userService.join(user);

        return "redirect:/";
    }
}
