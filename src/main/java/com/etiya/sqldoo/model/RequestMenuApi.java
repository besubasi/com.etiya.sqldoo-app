package com.etiya.sqldoo.model;

public class RequestMenuApi {

	private Integer userId;

	public RequestMenuApi() {
		super();
	}

	public RequestMenuApi(Integer userId) {
		super();
		this.userId = userId;
	}

	public Integer getUserId() {
		if(userId == null)
			return 0;
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
