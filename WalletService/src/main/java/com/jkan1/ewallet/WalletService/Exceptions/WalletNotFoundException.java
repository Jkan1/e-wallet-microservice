/**
 *
 * @author kan
 */
package com.jkan1.ewallet.WalletService.Exceptions;

public class WalletNotFoundException extends RuntimeException {

    public WalletNotFoundException(int id) {

        super("Wallet id not found : " + id);
    }

}
