package com.onyx.note.entity;

/**
 * 请求返回实体
 * @author lxg
 * 2018年1月5日
 */
public class ResultReturn {
	public static final int SUCCESS = 0;//操作成功
	public static final int FAILURE = 1;//操作失败

	private int result_code;

	private String message;//操作失败描述
	
	private Object data;//请求返回值
	
	public ResultReturn() {
		super();
		this.result_code = ResultReturn.SUCCESS;
	}
	
	public ResultReturn(Object data) {
		super();
		this.result_code = ResultReturn.SUCCESS;
		this.data = data;
	}

	public ResultReturn(int result_code) {
		this.result_code = result_code;
	}

	public ResultReturn(int result_code, String message) {
		this.result_code = result_code;
		this.message = message;
	}

	public int getResult_code() {
		return result_code;
	}

	public void setResult_code(int result_code) {
		this.result_code = result_code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
