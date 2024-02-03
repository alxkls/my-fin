package com.alxkls.mfcore.repository;

import com.alxkls.mfcore.map.MFUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MFUserRepository extends JpaRepository<MFUser, Long> {
}
