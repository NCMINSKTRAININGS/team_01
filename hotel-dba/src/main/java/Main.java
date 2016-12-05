<<<<<<< HEAD
/**
 * Created by Valeria on 04.12.2016.
 */

import by.nc.teamone.dba.dao.HibernateConfiguration;
import by.nc.teamone.dba.dao.room.IRoomDAO;
import by.nc.teamone.dba.dao.status.IStatusDAO;
import by.nc.teamone.dba.dao.type.ITypeDAO;
import by.nc.teamone.dba.dao.user.IUserDAO;
import by.nc.teamone.entities.Room;
import by.nc.teamone.entities.Status;
import by.nc.teamone.entities.Type;
=======

import by.nc.teamone.dba.dao.HibernateConfiguration;
import by.nc.teamone.dba.dao.user.IUserDao;
>>>>>>> a6d92c00b7f9acf34601d275609a2bfcfb66eb23
import by.nc.teamone.entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

<<<<<<< HEAD
import java.util.List;

public class Main {

    Status status = new Status();
    Type type = new Type();

    public static void main(String[] args){
        Main main = new Main();

        /*   add means 'add and show'   */
        main.addUser();       // works well
        main.addStatus();     // works well
        main.addType();       // works well
        main.addRoom();
=======
public class Main {

    public static void main(String[] args){
        Main main = new Main();
        main.addUser();
>>>>>>> a6d92c00b7f9acf34601d275609a2bfcfb66eb23
    }

    public void addUser(){

        ApplicationContext ctx = new
                AnnotationConfigApplicationContext(HibernateConfiguration.class);

        User user = new User();
<<<<<<< HEAD
        user.setName("Derek");
        user.setSurname("Hinnighan");
        user.setEmail("mrCoolGuy@gmail.com");
        user.setLogin("mrCoolGuy");
        user.setMoney(10000);
        user.setPhone("375257245181");
        user.setRole("client");

        IUserDAO userDAO = (IUserDAO) ctx.getBean("userDAOImpl");

        userDAO.add(user);

        List<User> userList = userDAO.getAll();
        for (User user1 : userList){
            System.out.println("Id: " + user1.getId() + " Name: " + user1.getName() + ", Surname: " + user1.getSurname() +
                    " Email: " + user1.getEmail() + " Login: " + user1.getLogin() + " Phone: " + user1.getPhone() +
                    " Role: " + user1.getRole()+ " Money: " + user1.getMoney());
        }

    }

    public void addStatus(){

        ApplicationContext ctx = new
                AnnotationConfigApplicationContext(HibernateConfiguration.class);

        status.setStatusEn("English");
        status.setStatusRu("Russian");

        IStatusDAO statusDAO = (IStatusDAO) ctx.getBean("statusDAOImpl");

        statusDAO.add(status);

        List<Status> statusList = statusDAO.getAll();
        for (Status status1 : statusList){
            System.out.println("Id: " + status1.getId() + " en: " + status1.getStatusEn() +
                    " ru: " + status1.getStatusRu());
        }

    }

    public void addType(){

        ApplicationContext ctx = new
                AnnotationConfigApplicationContext(HibernateConfiguration.class);

        type.setTypeRu("type ru");
        type.setTypeEn("type en");

        ITypeDAO typeDAO = (ITypeDAO) ctx.getBean("typeDAOImpl");

        typeDAO.add(type);

        List<Type> typeList = typeDAO.getAll();
        for (Type type1 : typeList){
            System.out.println("Id: " + type1.getId() + " type en: " + type1.getTypeEn() +
                    " ru: " + type1.getTypeRu());
        }

    }

    public void addRoom() {

        ApplicationContext ctx = new
                AnnotationConfigApplicationContext(HibernateConfiguration.class);

        Room room = new Room();

        room.setSeats(2);
        room.setStatusId(status);
        room.setTypeId(type);

        IRoomDAO roomDAO = (IRoomDAO) ctx.getBean("roomDAOImpl");

        roomDAO.add(room);

        List<Room> roomList = roomDAO.getAll();
        for (Room room1 : roomList){
            System.out.println("Id: " + room1.getId() + " seats: " + room1.getSeats() +
                    " statusId: " + room1.getStatusId() + " typeId: " + room1.getTypeId());
        }

=======
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
>>>>>>> a6d92c00b7f9acf34601d275609a2bfcfb66eb23
    }

}