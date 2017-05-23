import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.DemoService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration   
({"/applicationContext.xml"}) //加载配置文件  
public class ControlRoomTest {
	
	
	@Autowired
	DemoService demoService;
	
	@Test
	public void test() {
		
		demoService.sayHello();
		System.out.println("111");
	}

}
