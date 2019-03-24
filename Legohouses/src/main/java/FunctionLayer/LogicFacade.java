package FunctionLayer;

import DBAccess.DataMapper;
import DBAccess.UserMapper;
import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws BuildException {
        User user = new User(email, password, "customer");
        DataMapper.createUser( user );
        return user;
    }
        public static void createOrder(User user, int order_id, int length,
            int width, int height) throws OrderException {
        Order order = new Order(order_id, length, width, height, 0);
        DataMapper.makeOrder(order, user);
    }
    public static List<Order> getAll () throws BuildException {
        return DataMapper.getAllOrders();
    }
    
    public static ArrayList<Order> getAllOrdersByUser (User user) throws BuildException {
        return DataMapper.getOrdersByUser(user);
    }
    


    public static House createhouse(int length, int width, int height) {
        House house = new House(length, width, height);
        return Calculator.createPartList(house);
    }

}
