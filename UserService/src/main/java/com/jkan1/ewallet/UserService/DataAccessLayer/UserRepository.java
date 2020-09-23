/**
 *
 * @author kan
 */
package com.jkan1.ewallet.UserService.DataAccessLayer;

import com.jkan1.ewallet.UserService.DataAccessLayer.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
