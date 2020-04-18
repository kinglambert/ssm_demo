import com.king.ssm.dao.AccountDao;
import com.king.ssm.domain.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        AccountDao accountDao = ac.getBean(AccountDao.class);
        Account a = accountDao.findById(2);
        System.out.println(a);
    }
}
