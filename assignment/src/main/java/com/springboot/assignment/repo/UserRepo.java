/**
 * 
 */
package com.springboot.assignment.repo;

import org.springframework.stereotype.Service;

import com.springboot.assignment.pojo.User;
import com.springboot.assignment.utils.DataHolder;

/**
 * @author Bharat Devre
 * Created on : 18-Nov-2017
 *
 */

@Service
public class UserRepo {

	public void updateUser(User user){
		User userToUpdate= DataHolder.users.get(user.getId());
		userToUpdate.setPinCode(user.getPinCode());
		userToUpdate.setBirthDate(user.getBirthDate());
		DataHolder.users.put(user.getId(),userToUpdate);
	}
	
	public void deleteUser(User user){
		User updateUser=user;
		updateUser.setActive(false);
		
		DataHolder.users.put(user.getId(),user);
	}
   
}
