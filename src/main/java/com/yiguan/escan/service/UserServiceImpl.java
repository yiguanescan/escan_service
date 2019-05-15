package com.yiguan.escan.service;

import com.yiguan.escan.domin.sys.User;
import com.yiguan.escan.repository.sys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    private UserServiceImpl(
            final  UserRepository userRepository
    ){
        this.userRepository = userRepository;
    }

    public User findUserByUserName(String userName){
        return userRepository.findByLoginName(userName);
    }

}
