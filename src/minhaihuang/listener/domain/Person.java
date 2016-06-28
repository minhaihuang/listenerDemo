package minhaihuang.listener.domain;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * 这是一个javaBean类
 * @author 黄帅哥
 *
 */
public class Person implements HttpSessionBindingListener{
	private String name;
	private int age;
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("person对象监听到自己被添加到session对象中");
	}

	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("person对象监听到自己在session对象中被移除");
	}
	
	
}
