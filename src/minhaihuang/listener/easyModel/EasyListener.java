package minhaihuang.listener.easyModel;
/**
 * 简单的监听器模型
 * @author 黄帅哥
 *
 */
public class EasyListener {
	public static void main(String[] args) {
		A a=new A();
		B b=new B(a);
		b.b();
	}
	
	
}

/**
 * A类是监听器
 * @author 黄帅哥
 *
 */
class A{
	public void a(){
		System.out.println("A类的a方法执行了");
	}
}

/**
 * B类是事件源
 * @author 黄帅哥
 *
 */
class B{
	private A a;
	
	public B(A a) {
		this.a=a;
	}

	public void b(){
		System.out.println("B类的b方法执行了");
		a.a();
	}
}