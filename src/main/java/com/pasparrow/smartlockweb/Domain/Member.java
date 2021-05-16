package com.pasparrow.smartlockweb.Domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

//    @ManyToOne
//    @JoinColumn(name = "member_username")
//    private Member member;

    @Builder
    public Member(Long id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
