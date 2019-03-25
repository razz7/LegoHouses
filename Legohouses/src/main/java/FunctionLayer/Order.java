package FunctionLayer;

/**
 *
 * @author rh
 */
public class Order {
    private int order_id, length, width, heigth;
    private User user;
    private int status;

    public Order(int order_id ,int length, int width, int heigth, int status) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        
        this.status = status;
    }

    public Order(int order_id, int length, int width, int heigth, User user, int status) {
        this.order_id = order_id;
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        this.user = user;
        this.status = status;
    }

    public int getOrder_id() {
        return order_id;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return heigth;
    }

    public User getUser() {
        return user;
    }

    public int isShipped() {
        return status;
    }

    public int setShipped(int shipped) {
        return shipped;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    
    
}
