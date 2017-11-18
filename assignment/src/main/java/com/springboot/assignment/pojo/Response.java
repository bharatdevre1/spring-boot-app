/**
 * 
 */
package com.springboot.assignment.pojo;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author Bharat Devre
 * Created on : 18-Nov-2017
 *
 */

@JsonSerialize
public class Response {

	private String resMsg;
	private String userId;
	private List<Validation> valErrors;
	
	public Response(String resMsg, String userId, List<Validation> valErrors) {
		super();
		this.resMsg = resMsg;
		this.userId = userId;
		this.valErrors = valErrors;
	}
	
	public String getResMsg() {
		return resMsg;
	}
	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Validation> getValErrors() {
		return valErrors;
	}
	public void setValErrors(List<Validation> valErrors) {
		this.valErrors = valErrors;
	}
	
}
