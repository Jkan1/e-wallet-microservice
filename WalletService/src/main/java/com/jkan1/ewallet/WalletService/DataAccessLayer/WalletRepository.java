/**
 *
 * @author kan
 */
package com.jkan1.ewallet.WalletService.DataAccessLayer;

import com.jkan1.ewallet.WalletService.DataAccessLayer.Models.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WalletRepository extends JpaRepository<Wallet, Integer> {

    @Query("SELECT w FROM Wallet w WHERE w.user_id = ?1")
    Wallet findWalletByUserId(int userId);
}
