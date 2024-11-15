package com.igrowker.miniproject.User.Service;

import com.igrowker.miniproject.User.Model.UserEntity;
import com.igrowker.miniproject.User.Repository.UserRepository;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository ;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(UserEntity userEntity){
        userRepository.save(userEntity);
    }

    public UserEntity getUserProfile(Long id){
        return userRepository.findById(id).orElse(null);
    }

}