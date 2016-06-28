package minhaihuang.listener.web.webListener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听当前在线人数
 * @author 黄帅哥
 *
 */
public class OnlineNumberListener implements HttpSessionListener{

	public void sessionCreated(HttpSessionEvent event) {
		//获得servletContext对象
		Integer onlineNumber=(Integer)event.getSession().getServletContext().getAttribute("onlineNumber");
		//如果为空，则是还没有人访问过
		if(onlineNumber==null){
			onlineNumber=0;
		}
		onlineNumber++;
		//设置回去
		event.getSession().getServletContext().setAttribute("onlineNumber",onlineNumber);
	}

	public void sessionDestroyed(HttpSessionEvent event) {
		//获得servletContext对象
		Integer onlineNumber=(Integer)event.getSession().getServletContext().getAttribute("onlineNumber");
		
		onlineNumber--;
		//设置回去
		event.getSession().getServletContext().setAttribute("onlineNumber",onlineNumber);
	}

}
