package minhaihuang.listener.web.webListener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * 实现自己的web域对象属性变化监听器
 * @author 黄帅哥
 *
 */
public class MyServletContextAttributeListener implements ServletContextAttributeListener{

	public void attributeAdded(ServletContextAttributeEvent event) {
		
		System.out.println("监听到了属性的设置：name="+event.getName()+",value="+event.getValue());
	}

	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("监听到了属性的删除：name="+event.getName()+",value="+event.getValue());	
	}

	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out.println("监听到了属性的变化：name="+event.getName()+",value="+event.getValue());

	}

}
