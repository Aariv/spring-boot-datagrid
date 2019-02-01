/**
 * 
 */
package org.elearn.users.repository;

import org.elearn.users.model.Users;
import org.springframework.data.repository.CrudRepository;

/**
 * @author kloudone
 *
 */
public interface UsersRepository extends CrudRepository<Users, Integer> {

}
