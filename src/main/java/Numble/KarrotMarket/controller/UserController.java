package Numble.KarrotMarket.controller;

import Numble.KarrotMarket.domain.User;
import Numble.KarrotMarket.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user/signup")
    public String createForm(Model model){
        model.addAttribute("userForm",new UserForm());
        return "users/createUser";
    }

    @PostMapping("/user/signup")
    public String create(UserForm form){
        User user = new User();
        user.setEmail(form.getEmail());
        user.setPwd(form.getPwd());
        user.setName(form.getName());
        user.setPhone(form.getPhone());
        user.setNickname(form.getNickname());

        userService.join(user);
        return "redirect:/";
    }

    @GetMapping("/user/signin")
    public String login(Model model){
        model.addAttribute("loginForm", new LoginForm());
        return "/users/loginUser";
    }
}
