package Numble.KarrotMarket.repository;

import Numble.KarrotMarket.domain.User;

import javax.persistence.EntityManager;

public class JpaUserRepository implements UserRepository{

    private final EntityManager em;

    public JpaUserRepository(EntityManager em){
        this.em=em;
    }

    @Override
    public User save(User user) {
        em.persist(user);
        return user;
    }

}
