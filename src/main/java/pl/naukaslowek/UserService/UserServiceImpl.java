package pl.naukaslowek.UserService;


import jakarta.persistence.EntityManager;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserServiceImpl implements UserService{

    EntityManager entityManager;

    public UserServiceImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public boolean addUser(UserDto userDto) {
        if (validUser(userDto)) {
            entityManager.persist(userDto);
        }
        return false;
    }

    private boolean validUser(UserDto userDto){
        if(userDto.getLogin().length() == 0 || userDto.getPassword().length() == 0){
            System.out.println("Can not add user with empty login or password");
            return false;
        }
        return true;
    }

}
