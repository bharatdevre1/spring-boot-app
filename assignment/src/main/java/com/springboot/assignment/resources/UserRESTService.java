/**
 * 
 */
package com.springboot.assignment.resources;

import java.util.Map;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.assignment.pojo.Response;
import com.springboot.assignment.pojo.User;
import com.springboot.assignment.repo.UserRepo;
import com.springboot.assignment.utils.DataHolder;
import com.springboot.assignment.utils.ErrorHandler;
import com.springboot.assignment.utils.UserValidations;


/**
 * @author Bharat Devre
 * Created on : 18-Nov-2017
 *
 */

@RestController
@RequestMapping("/spring-boot/v1")
public class UserRESTService {

	@Autowired
	UserRepo userRepo;
	
	@RequestMapping(value = "/users/" , method = RequestMethod.POST)
	public Response createUser(@RequestBody User user){
		
		if(!UserValidations.validateEmail(user.getEmail())){
			
			return new Response("Email already exist . Please use another one ", user.getId() ,ErrorHandler.getError("email",user.getEmail()) );	
		}
		
        if(!UserValidations.birthDateValidation(user.getBirthDate())){
			
			return new Response("Date of Birth is invalid ", user.getId() ,ErrorHandler.getError("birth date ",user.getBirthDate().toString()) );	
		}
		
		if(DataHolder.users.get(user.getId()) == null ){
			DataHolder.users.put(user.getId(), user);
			return new Response("User created successfully ", user.getId() , null);
		}else{
			return new Response("User already exist ", user.getId() , ErrorHandler.getError("id",user.getId()));
		}
		
	}

	
	@RequestMapping(value = "/users/" , method = RequestMethod.PUT)
	public Response updateUser(@RequestBody User user){
		
        if(!UserValidations.birthDateValidation(user.getBirthDate())){
			
			return new Response("Date of Birth is invalid ", user.getId() ,ErrorHandler.getError("birth date ",user.getBirthDate().toString()) );	
		}
		
		if(DataHolder.users.get(user.getId()) != null ){
			userRepo.updateUser(user);
			return new Response("User updated successfully ", user.getId() , null);
		}else{
			return new Response("User not exist ", user.getId() , ErrorHandler.getError("id",user.getId()));
		}
		
	}
	
	
	@RequestMapping(value = "/users/{id}" , method = RequestMethod.DELETE)
	public Response deleteUser(@PathVariable("id") String id){
		System.out.println("-------------------"+id);
		if(DataHolder.users.get(id) != null ){
			userRepo.deleteUser(DataHolder.users.get(id));
			return new Response("User deleted successfully ", id , null);
		}else{
			return new Response("User does not exist ", id , ErrorHandler.getError("id",id));
		}
		
	}
	
	@RequestMapping(value = "/users/" , method = RequestMethod.GET)
	public Map<String, User> getUsers(){
	  return DataHolder.users;	
	}
		
	@RequestMapping
	public String get(){
		return "Hey there , you are on right path !!!";
	}
	
}
