import com.library.bean.Book;
import com.library.dao.AdminDao;
import com.library.dao.BookDao;
import com.library.service.LoginService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Mytest {
    @Test
    public void test(){
            ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//            ApplicationContext context=new ClassPathXmlApplicationContext("spring/spring-dao.xml");
            Object user= context.getBean("loginDao");
            String[] str=context.getBeanDefinitionNames();
            for (String string : str) {
                System.out.println("..."+string);
            }
            System.out.println("----"+user);
    }
    @Test
    public void test1(){
            ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
            AdminDao lendDao= (AdminDao)context.getBean("adminDao");
            lendDao.getMatchCount(Long.parseLong("123456"), "123456");
    }
}
