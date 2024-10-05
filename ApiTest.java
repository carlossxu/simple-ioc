import org.junit.Test;

public class ApiTest {
    @Test
    public void test_BeanFactory() {
        BeanFactory beanFactory = new BeanFactory();
        UserDao userDao1 = (UserDao) beanFactory.getBean("userDao");
        userDao1.queryUserInfo();

        UserDao userDao2 = (UserDao) beanFactory.getBean("userDao");
        userDao2.queryUserInfo();

        System.out.println(userDao1.equals(userDao2));
    }
}
