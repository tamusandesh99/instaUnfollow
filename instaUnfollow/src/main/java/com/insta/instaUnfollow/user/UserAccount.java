package com.insta.instaUnfollow.user;
import jakarta.persistence.*;

@Entity
@Table
public class UserAccount {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )

    private Long id;
    private String userName;
    private String password;

    public UserAccount(){

    }

    public UserAccount(Long id, String userName, String password){
        this.id = id;
        this.userName = userName;
        this.password = password;

    }

    public UserAccount(String userName, String password){
        this.userName = userName;
        this.password = password;

    }

    public void setId(Long id){this.id = id;}
    public Long getId(){return id;}

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


