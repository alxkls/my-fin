package com.alxkls.mfusers.service;

import com.alxkls.mfusers.map.MFUser;
import com.alxkls.mfusers.repository.MFUserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MFUserService {

  private final MFUserRepository userRepository;

  public void saveUser(MFUser user) {
    userRepository.save(user);
  }

  public List<MFUser> findAllUsers() {
    return userRepository.findAll();
  }

  public MFUser findUserById(long id) {
    return userRepository.findById(id).get();
  }
}
