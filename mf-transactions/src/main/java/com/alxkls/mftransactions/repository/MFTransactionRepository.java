package com.alxkls.mftransactions.repository;

import com.alxkls.mftransactions.map.MFTransaction;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MFTransactionRepository extends JpaRepository<MFTransaction, Long> {

  @Query(value = "SELECT * FROM MFTRANSACTIONS t WHERE t.user_id = ?1", nativeQuery = true)
  List<MFTransaction> findByUserId(long userId);
}
