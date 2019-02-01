/**
 * 
 */
package org.elearn.users.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author kloudone
 *
 */
@Entity
public class Users {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
