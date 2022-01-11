package Numble.KarrotMarket.service;

import Numble.KarrotMarket.repository.UserRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
}
