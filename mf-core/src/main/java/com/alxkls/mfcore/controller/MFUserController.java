package com.alxkls.mfcore.controller;

import com.alxkls.mfcore.map.MFUser;
import com.alxkls.mfcore.repository.MFUserRepository;
import com.alxkls.mfcore.service.MFUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class MFUserController {

    private final MFUserService userService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void saveUser(@RequestBody MFUser user){
        userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MFUser> getUser(@PathVariable(name = "id") long id){
        return ResponseEntity.ok(userService.findUserById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<MFUser>> getAllUsers(){
        return ResponseEntity.ok(userService.findAllUsers());
    }
}
