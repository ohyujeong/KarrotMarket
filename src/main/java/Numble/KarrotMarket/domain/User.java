package Numble.KarrotMarket.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class User {

    @Id @GeneratedValue
    @Column(name = "userid")
    private Long id;

    private String email;
    private String pwd;

    private String name;

    private String phone;

    private String nickname;

}
