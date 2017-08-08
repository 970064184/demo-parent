package com.common.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 返回结果处理信息
 * @author admin
 *
 */
public class Feedback {
	public static final String SUCCESS="success";
	public static final String ERROR="error";
	private String state=SUCCESS;//状态
	private String msg;//返回信息
	private Object data;//返回数据
	public Feedback() {}
	public Feedback(String state, String msg, Object data) {
		this.state = state;
		this.msg = msg;
		this.data = data;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public static String getSuccess() {
		return SUCCESS;
	}
	public static String getError() {
		return ERROR;
	}
	//success方法
	public void success(String msg){
		this.setMsg(msg);
		this.setState(SUCCESS);
	}
	//error方法
	public void error(String msg){
		this.setMsg(msg);
		this.setState(ERROR);
	}
	//返回String类型
	public String toJson(){
		 return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
	}
}
