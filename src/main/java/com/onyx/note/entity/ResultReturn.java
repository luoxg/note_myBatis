package com.onyx.note.entity;

/**
 * 请求返回实体
 * @author lxg
 * 2018年1月5日
 */
public class ResultReturn {
	public static final String SUCCESS = "success";//操作成功
	public static final String FAILURE = "failure";//操作失败

	private String operationResult;//操作结果标识
	
	private String failureMsg;//操作失败描述
	
	private Object responseList;//请求返回值
	
	public ResultReturn() {
		super();
		this.operationResult = ResultReturn.SUCCESS;
	}
	
	public ResultReturn(Object responseList) {
		super();
		this.operationResult = ResultReturn.SUCCESS;
		this.responseList = responseList;
	}
	
	public ResultReturn(String operationResult, String failureMsg) {
		super();
		this.operationResult = operationResult;
		this.failureMsg = failureMsg;
	}

	public ResultReturn(String operationResult, String failureMsg, Object responseList) {
		super();
		this.operationResult = operationResult;
		this.failureMsg = failureMsg;
		this.responseList = responseList;
	}

	public String getOperationResult() {
		return operationResult;
	}

	public void setOperationResult(String operationResult) {
		this.operationResult = operationResult;
	}

	public String getFailureMsg() {
		return failureMsg;
	}

	public void setFailureMsg(String failureMsg) {
		this.failureMsg = failureMsg;
	}

	public Object getResponseList() {
		return responseList;
	}

	public void setResponseList(Object responseList) {
		this.responseList = responseList;
	}
}
