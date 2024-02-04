package com.alxkls.mfcore.repository;

import com.alxkls.mfcore.map.MFTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MFTransactionRepository extends JpaRepository<MFTransaction,Long> {
    @Query(value = "SELECT * FROM MFTRANSACTIONS t WHERE t.userId == ?1", nativeQuery = true)
    List<MFTransaction> findByUserId(long userId);
}
