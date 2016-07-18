package service;  
  
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.lzm.domain.User;
import com.lzm.service.UserService;  

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"file:config/spring/spring-mybatis.xml"})  
  
public class TestUserService{  
    private static Logger logger = Logger.getLogger(TestUserService.class);  
    @Autowired 
    private UserService userService;  

    @Test  
    public void test1() {  
        User user = userService.getUserByUserName("lzm");  
  //      Assert.assertNull(user);
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
        logger.info(JSON.toJSONString(user));  
    }  
}  