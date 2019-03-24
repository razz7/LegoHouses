
package PresentationLayer;

import FunctionLayer.House;
import FunctionLayer.Order;
import java.util.ArrayList;

/**
 *
 * @author rh
 */
public class Tables {
    
    
    public static String generateOrders(ArrayList<Order> orders) {
        String Table = "<table id=\"orders\">"
                + "<tr><th>Order ID </th><th>Length </th><th>Width </th><th>Height </th><th>User </th><th>Shipped\t</th></tr>";
        for (Order order : orders) {
            Table += "<tr><td>" + order.getOrder_id() + " </td>" + "<td>" + order.getLength() + " </td>" + "<td>" + 
                    order.getWidth() + " </td>" + "<td>" + order.getHeight() + " </td>" + "<td>" + 
                     " </td>" + "<td>" + order.isShipped() + " </td></tr>";
        }
        return Table;
    }
    public static String legohouse(House house) {
        String cartTable = "<table id=\"house\">"
                + "<tr><th>Legohouse</th><th>Length = " + house.getLength() 
                + "</th><th>Width = " + house.getWidth() + "</th><th>Height "
                + "= " + house.getHeight() + "</th></tr>"
                + "<tr><th>Layer</th><th>Side 1&3 (Length)</th><th>Side 2&4 (Width)</th></tr>";
        for (int i = 0; i < house.getLayers().size(); i++) {
            cartTable += "<tr><td>" + (i + 1) + "</td>"
                    + "<td>" + house.getLayers().get(i).getLength().toString() + "</td>"
                    + "<td>" + house.getLayers().get(i).getWidth().toString() + "</td></tr>";
        }
        cartTable = cartTable.replace("{","<pre>");
        cartTable = cartTable.replace("}","</pre>");
        return cartTable;
    }



}
