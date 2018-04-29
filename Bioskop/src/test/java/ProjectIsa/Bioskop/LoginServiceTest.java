package ProjectIsa.Bioskop;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import domain.Adresa;
import domain.User;
import domain.UserType;
import service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceTest {

	@Autowired
	UserService userService;
	
	@Before
	public void init() {
		User u = new User("Marko", "Markovic", "Marko", "1234", UserType.REGISTEREDUSER, new Adresa("asd", "asd"), "asd@asd");
		User u1 = new User("Marko", "Markovic", "Marko1", "1234", UserType.REGISTEREDUSER, new Adresa("asd", "asd"), "asd@asd");
		userService.addUser(u);
		userService.addUser(u1);
	}
	
	
	
}
