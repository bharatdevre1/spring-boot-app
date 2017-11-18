/**
 * 
 */
package com.springboot.assignment.repo;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.springboot.assignment.pojo.User;
import com.springboot.assignment.utils.DataHolder;


/**
 * @author Bharat Devre
 * Created on : 18-Nov-2017
 *
 */
public class UserRepoTests {

	UserRepo userRepo=new UserRepo();
	
	
	@Before
	public void setUp(){
		User user=new User();
		user.setfName("Bharat");
		user.setId("1");
		user.setActive(true);

		User user1=new User();
		user1.setfName("Bharat");
		user1.setId("2");
		
		DataHolder.users.put("1",user);
		
		DataHolder.users.put("2",user1);
	}
	
	
	@Test
	public void testUpdateUser(){
		User user=new User();
		user.setPinCode(123);
		user.setBirthDate(new Date());
		user.setId("1");
		userRepo.updateUser(user);
		
		org.junit.Assert.assertEquals(123, DataHolder.users.get("1").getPinCode());
		
	}
	
	@Test
	public void testDeleteUser(){

		User user=new User();
		user.setId("1");
		
		org.junit.Assert.assertEquals(true, DataHolder.users.get("1").isActive());
		
		userRepo.deleteUser(user);
		
		org.junit.Assert.assertEquals(false, DataHolder.users.get("1").isActive());

	}
}
