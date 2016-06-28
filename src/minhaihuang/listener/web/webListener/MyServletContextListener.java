package minhaihuang.listener.web.webListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 自己实现一个ServletContextListener监听器
 * @author 黄帅哥
 *
 */
public class MyServletContextListener implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("监听到了servletContext对象被销毁--");
	}

	public void contextInitialized(ServletContextEvent event) {
		System.out.println("监听到了servletContext对象被创建++");
	}

}
