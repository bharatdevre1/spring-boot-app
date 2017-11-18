/**
 * 
 */
package com.springboot.assignment.utils;

import java.util.Date;
import java.util.Map;

import com.springboot.assignment.pojo.User;

/**
 * @author Bharat Devre
 * Created on : 18-Nov-2017
 *
 */
public class UserValidations {

	public static boolean validateEmail(String email){
	  for(Map.Entry<String,User> entry : DataHolder.users.entrySet()){
		  if(entry.getValue().getEmail() == email && entry.getValue().isActive()){
			  return false;
		  }
	  }
	  return true;
	}
	
	
	public static boolean birthDateValidation(Date date){
		return date.getTime() > System.currentTimeMillis() ? false :true;
	}
}
