package Numble.KarrotMarket.repository;

import Numble.KarrotMarket.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final EntityManager em;

    public void save(User user){
        em.persist(user); //persist로 엔티티 저장
    }

}
