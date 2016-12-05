
import by.nc.teamone.dba.dao.HibernateConfiguration;
import by.nc.teamone.dba.dao.user.IUserDao;
import by.nc.teamone.entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        Main main = new Main();
        main.addUser();
    }

    public void addUser(){

        ApplicationContext ctx = new
                AnnotationConfigApplicationContext(HibernateConfiguration.class);

        User user = new User();
        user.setName("stas");
        user.setEmail("haha");
        user.setId(1);
        user.setLogin("petrus");
        user.setMoney(100500);
        user.setPhone("228228");
        user.setEmail("petius96@gmail.com");
        user.setRole("boss");

        IUserDao userDao = (IUserDao) ctx.getBean("userDaoImpl");

        userDao.add(user);
    }

}