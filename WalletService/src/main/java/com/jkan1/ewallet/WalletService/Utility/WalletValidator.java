/**
 *
 * @author kan
 */
package com.jkan1.ewallet.WalletService.Utility;

import com.jkan1.ewallet.WalletService.DataAccessLayer.Models.Wallet;

public class WalletValidator {

    public boolean validateWalletRequest(Wallet wallet) {
        if (wallet.getUser_id() == 0) {
            return false;
        }
        return true;
    }
}
