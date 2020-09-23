/**
 *
 * @author kan
 */
package com.jkan1.ewallet.WalletService.DataAccessLayer.Models;

import java.util.List;

public class Response {

    private List<User> list;

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

}
