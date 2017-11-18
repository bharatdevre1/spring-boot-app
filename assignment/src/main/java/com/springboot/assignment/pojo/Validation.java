/**
 * 
 */
package com.springboot.assignment.pojo;

/**
 * @author Bharat Devre
 * Created on : 18-Nov-2017
 *
 */
public class Validation {

	private String code;
	private String field;
	private String message;
	
	
	public Validation(String code, String field, String message) {
		super();
		this.code = code;
		this.field = field;
		this.message = message;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
