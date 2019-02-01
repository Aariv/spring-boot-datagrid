/**
 * 
 */
package org.elearn.users.rest;

import java.util.ArrayList;
import java.util.List;

import org.elearn.users.model.Users;
import org.elearn.users.repository.UsersRepository;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kloudone
 *
 */
@RestController
public class UserResource {

	private UsersRepository usersRepository;
	
	@GetMapping("/users")
	public List<Users> findAll() {
		//return (List<Users>) usersRepository.findAll();
		List<Users> users = new ArrayList<>();
		users.add(new Users(1, "Ariv"));
		return users;
	}
}
