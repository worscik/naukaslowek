package pl.naukaslowek.UserService;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name = "USER_ACCOUNT")
class UserDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String login;
    @NotBlank
    private String password;

    public UserDto(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

