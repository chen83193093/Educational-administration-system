package com.zy.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * ���������װ������
 * @author Administrator
 *
 */
public class Entity implements Serializable {
	//��ʶ
	private int flag;
	//�����Ƿ�ɹ�
	private	boolean result;
	//��Ϣ
	private String message;
	//װ�ص�������
	private Object obj;
	//װ�ض������
	private List<Object> list;
	private Set<Object> set;
	private Map<String, Object> map;
	
	private Object [] objs;
	
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	public Set<Object> getSet() {
		return set;
	}
	public void setSet(Set<Object> set) {
		this.set = set;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public Object[] getObjs() {
		return objs;
	}
	public void setObjs(Object[] objs) {
		this.objs = objs;
	}
	
}
