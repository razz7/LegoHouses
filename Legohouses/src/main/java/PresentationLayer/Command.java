package PresentationLayer;

import FunctionLayer.BuildException;
import FunctionLayer.LoginSampleException;
import FunctionLayer.OrderException;
import FunctionLayer.OrderSampleException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put( "createLegohouse", new createLegohouse());
        commands.put( "orderpage", new Orders());
        commands.put( "OrdersPage", new getUserOrders());
        commands.put("allDone", new allDone());
    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) 
            throws BuildException, LoginSampleException, OrderSampleException, OrderException;

}
