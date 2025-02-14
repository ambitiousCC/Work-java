package 类成员;

/**
 * @see		面向对象.成员变量和局部变量.概念 || 面对对象.初始化块.静态初始化块
 * @author 崔秦
 */
/**
 * 	static关键字：
 * 	!类成员是属于类的，类成员的作用域比实例成员的作用域要大，因而初始化完成以后可能实例初始化还未开始!
 *	所以类成员(方法，初始化块，内部类和枚举)不能访问实例成员(成员变量，方法，初始化块，内部类，枚举类)
 */
//补充static修饰的静态初始化块，在初始化结束以后就不再有被执行的机会
public class 理解类成员 {
/**
 * 	Java 类里只包含：成员变量，方法，构造器，初始化块，内部类(接口，枚举)
 * 	static 只是不能修饰构造器		修饰的成员就是类成员，类成员属于整个类而不属于单个对象
 * 	类变量和类紧密相连	分配内存，初始化，生存范围等
 * 
 * 	类变量可以通过类直接访问，可以通过构造新的对象来访问。
 * 	通过对象访问 也是访问原来的类的类变量
 * 	因为构造新的对象时，系统不会再次分配内存和初始化，对象根本不拥有对应类的类变量
 * 
 * 	因此，所有新的类对象访问的类变量都是同一块内存
 * 
 * 	类方法同理
 */
	public String name = "崔秦";
	private static void test()
	{
		System.out.println("static 修饰的类方法");
	}
	public static void main(String[] args)
	{
		//即便是值为null的对象，仍然可以委托类来访问类成员
		理解类成员 nas = null;
		nas.test();
	/**
	 * 	然而访问实例变量和实例方法时报错：NullPointerException异常		 
	 * 	null表明了实例不存在，实例变量和实例方法都不存在
	 * 	使用实例来访问类成员，依然是委托给该类来访问类成员。
	 */
		System.out.println(nas.name);
	}
	
}
