package com.alxkls.mfusers.repository;

import com.alxkls.mfusers.map.MFUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MFUserRepository extends JpaRepository<MFUser, Long> {

}
