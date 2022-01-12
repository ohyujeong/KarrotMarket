package Numble.KarrotMarket.service;

import Numble.KarrotMarket.domain.User;
import Numble.KarrotMarket.repository.UserRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public String join(User user){
        userRepository.save(user);
        return user.getId();
    }
}
