package com.alxkls.mfcore.service;

import com.alxkls.mfcore.map.MFUser;
import com.alxkls.mfcore.repository.MFUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MFUserService {
    private final MFUserRepository userRepository;

    public void saveUser(MFUser user){
        userRepository.save(user);
    }

    public List<MFUser> findAllUsers(){
        return userRepository.findAll();
    }
    public MFUser findUserById(long id){
        return userRepository.findById(id).get();
    }
}
