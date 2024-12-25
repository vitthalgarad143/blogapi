/**
 * Created By Vitthal Garad
 * Date:05-12-2024
 * Time:22:25
 * Project Name:blog_api
 */


package com.vitthal.blog_api.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException{
	String resourceName;
	String fieldName;
	long fieldValue;

	public ResourceNotFoundException(String message, String resourceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : %l",resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
}
