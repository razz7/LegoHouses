/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.OrderException;
import FunctionLayer.OrderSampleException;

import FunctionLayer.User;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rh
 */
public class allDone extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException, OrderSampleException, OrderException{
        String email = request.getParameter("email");
        String password = request.getParameter("password");
//        User user = LogicFacade.login(email, password);
//        int width = Integer.parseInt(request.getParameter("width"));
//        int length = Integer.parseInt(request.getParameter("length"));
//        int height = Integer.parseInt(request.getParameter("height"));
//
//        if (width < 4 || length < 4 || height < 4) {
//            try {
//                throw new OrderSampleException("too small");
//            } catch (OrderSampleException ex) {
//                Logger.getLogger(allDone.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else {
//            LogicFacade.createOrder(user, length, width, height, 0);
//        }

        
        return "allDone";
    }


}
