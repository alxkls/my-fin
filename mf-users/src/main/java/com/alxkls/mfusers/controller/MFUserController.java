package com.alxkls.mfusers.controller;

import com.alxkls.mfusers.map.MFUser;
import com.alxkls.mfusers.service.MFUserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class MFUserController {

  private final MFUserService userService;

  @PostMapping("/save")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public void saveUser(@RequestBody MFUser user) {
    userService.saveUser(user);
  }

  @GetMapping("/{id}")
  public ResponseEntity<MFUser> getUser(@PathVariable(name = "id") long id) {
    return ResponseEntity.ok(userService.findUserById(id));
  }

  @GetMapping("/all")
  public ResponseEntity<List<MFUser>> getAllUsers() {
    return ResponseEntity.ok(userService.findAllUsers());
  }
}
