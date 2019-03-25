package DBAccess;

import FunctionLayer.BuildException;
import FunctionLayer.Order;
import FunctionLayer.OrderException;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of UserMapper is to...
 *
 * @author kasper
 */
public class DataMapper {


    public static void createUser(User user) throws BuildException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO users (email, password, role) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getRole());
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new BuildException(ex.getMessage());
        }
    }

    
    public static void makeOrder(Order order, User user) throws OrderException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orders (user_id, length, width, "
                    + "heigth, status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, user.getId());
            ps.setInt(2, order.getLength());
            ps.setInt(3, order.getWidth());
            ps.setInt(4, order.getHeight());
            ps.setInt(5, order.setShipped(0));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new OrderException(ex.getMessage());
        }
    }

    public static List<Order> getAllOrders() throws BuildException {
        ArrayList<Order> orders = new ArrayList();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT order_id, email, length, width, heigth, "
                    + "status, `password`, role FROM useradmin.orders JOIN useradmin.users"
                    + " where orders.email = users.email;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int order_id = rs.getInt("order_id");
                String email = rs.getString("email");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("heigth");
                int shipped = rs.getInt("status");
                String password = rs.getString("password");
                String role = rs.getString("role");
                User user = new User(email, password, role);
                orders.add(new Order(order_id, length, width, height, shipped));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new BuildException(ex.getMessage());
        }
        return orders;
    }
    
    public static ArrayList<Order> getOrdersByUser(User user) throws BuildException {
        ArrayList<Order> orders = new ArrayList();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECt orders.user_id, order_id, length, width, heigth, status FROM "
                    + "useradmin.users, useradmin.orders WHERE users.email = (?);";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, user.getEmail());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int user_id = rs.getInt("user_id");
                int order_id = rs.getInt("order_id");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int heigth = rs.getInt("heigth");
                int status = rs.getInt("status");
                orders.add(new Order(order_id, length, width, heigth, status));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new BuildException(ex.getMessage());
        }
        return orders;
    }

}
