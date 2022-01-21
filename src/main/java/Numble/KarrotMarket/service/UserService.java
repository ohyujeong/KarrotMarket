package Numble.KarrotMarket.service;

import Numble.KarrotMarket.domain.User;
import Numble.KarrotMarket.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public Long join(User user){
        userRepository.save(user);
        return user.getId();
    }

//    @Transactional(readOnly = true)
//    public Long findOne(Long id){
//
//    }
}
