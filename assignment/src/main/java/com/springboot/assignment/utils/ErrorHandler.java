/**
 * 
 */
package com.springboot.assignment.utils;

import java.util.ArrayList;
import java.util.List;

import com.springboot.assignment.pojo.Validation;

/**
 * @author Bharat Devre
 * Created on : 18-Nov-2017
 *
 */
public class ErrorHandler {

	public static List<Validation> getError(String field, String value){
		Validation validation=new Validation("VAL_ERR", field,"Error with "+field +" with value "+value);
		List<Validation> validations=new ArrayList<Validation>();
		validations.add(validation);
	
		return validations;
	}
	
}
