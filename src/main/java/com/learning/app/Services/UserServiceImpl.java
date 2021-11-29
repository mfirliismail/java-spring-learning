package com.learning.app.Services;

import com.learning.app.Entities.UserEntity;
import com.learning.app.Repositories.UserRepository;
import com.learning.app.SharedDto.UserDto;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto user){
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);

        UserEntity storedUserDetails = userRepository.save(userEntity);
        
        UserDto returnValues = new UserDto();
        BeanUtils.copyProperties(storedUserDetails, returnValues);
    
        return returnValues;
    }

    
}
