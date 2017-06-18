import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class mybeanfactory {
	public static UserService createService(){
		
		final UserService userservice =new UserServiceImp();
		final MyAspect myaspect=new MyAspect();
		UserService proxService=(UserService) Proxy.newProxyInstance(
				mybeanfactory.class.getClassLoader(), 
				userservice.getClass().getInterfaces(), 
				new InvocationHandler(){
					public Object invoke(Object proxy, Method method,Object[] args) throws Throwable {
						myaspect.before();
						Object obj=method.invoke(userservice, args);
						myaspect.after();
						System.out.println();
						return obj;
					}
				});
		return proxService;
		
	};

}
