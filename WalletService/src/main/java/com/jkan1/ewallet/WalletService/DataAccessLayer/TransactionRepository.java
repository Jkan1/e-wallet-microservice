/**
 *
 * @author kan
 */
package com.jkan1.ewallet.WalletService.DataAccessLayer;

import com.jkan1.ewallet.WalletService.DataAccessLayer.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    @Query("select u from Transaction u where u.sid = ?1 OR u.rid = ?1")
    List<Transaction> findBysidAndrid(int sid);
}
