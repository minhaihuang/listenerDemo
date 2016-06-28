package minhaihuang.listener.standardModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是事件源
 * @author 黄帅哥
 *
 */
public class EventSource {
	//持有一个监听器的列表，即持有多个监听器
	private List<Listener> listeners;
	
	public void productEvent(){
		//创建Event对象，并初始化
		Event event=new Event(this, "有用的信息");
		
		if (listeners != null) {
			for (Listener listener : listeners) {
				listener.processEvent(event);
			}
		}
	}
	/**
	 * 增加监听器的方法
	 */
	public void addListener(Listener listener){
		//如果链表为空，创建对象
		if(listeners==null){
			listeners=new ArrayList<Listener>(); 
		}
		//加入对象
		listeners.add(listener);
	}
	
	/**
	 * 删除监听器的方法
	 * @param listener
	 */
	public void removeListener(Listener listener){
		if(listeners==null){
			return;
		}
		
		listeners.remove(listener);
	}
}
