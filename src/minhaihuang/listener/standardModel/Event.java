package minhaihuang.listener.standardModel;
/**
 * 这是事件
 * @author 黄帅哥
 *
 */
public class Event {
	public String info;
	public EventSource eventSource;
	
	public Event(EventSource eventSource,String info){
		this.info=info;
		this.eventSource=eventSource;
	}

	public String getInfo() {
		return info;
	}

	public EventSource getEventSource() {
		return eventSource;
	}
	
	
}
