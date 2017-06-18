import org.junit.Test;
public class test {
	@Test
	public void demo(){
		UserService userservice =mybeanfactory.createService();
		userservice.addUser();
		userservice.updateUser();
		userservice.deleteUser();
	}

}
