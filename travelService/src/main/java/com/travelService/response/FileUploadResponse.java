package com.travelService.response;

import org.springframework.stereotype.Component;

@Component
public class FileUploadResponse {

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	int code;
	String  message;
	String result;
}
