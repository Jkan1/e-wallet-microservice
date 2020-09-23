/**
 *
 * @author kan
 */
package com.jkan1.ewallet.WalletService.DataAccessLayer.Models;

public class Balance {

    private int uid;
    private int amount;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
