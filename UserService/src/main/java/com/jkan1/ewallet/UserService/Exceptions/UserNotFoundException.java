/**
 *
 * @author kan
 */
package com.jkan1.ewallet.UserService.Exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(int id) {
        super("User id not found : " + id);
    }

}
