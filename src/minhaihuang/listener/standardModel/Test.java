package minhaihuang.listener.standardModel;
/**
 * 测试标准的监听器模型
 * @author 黄帅哥
 *
 */
public class Test {
	public static void main(String[] args) {
		EventSource eventSource=new EventSource();
		
		eventSource.addListener(new Listener(){
			public void processEvent(Event event) {
				System.out.println("监听到了：info"+event.getInfo());
			}
		});
		
		 eventSource.productEvent();
	}
}
