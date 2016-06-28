package minhaihuang.listener.domain;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * 测试session的钝化与活化监听器（HttpSessionActivationListener）
 * @author 黄帅哥
 *
 */
//记得要实现一个序列化接口(Serializable)，否则无法保存数据到硬盘中
public class Human implements Serializable,HttpSessionActivationListener{

	public void sessionDidActivate(HttpSessionEvent arg0) {
		System.out.println("监听到Human对象从硬盘中活化回来了");	
	}

	public void sessionWillPassivate(HttpSessionEvent arg0) {
		System.out.println("监听到Human对象钝化到了硬盘中");
	}

}
