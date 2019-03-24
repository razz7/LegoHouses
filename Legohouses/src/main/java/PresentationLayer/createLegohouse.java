/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.House;
import FunctionLayer.BuildException;
import FunctionLayer.LogicFacade;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rh
 */



public class createLegohouse extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws BuildException {
        int length = Integer.parseInt(request.getParameter("length")) ;
        int width = Integer.parseInt(request.getParameter("width"));
        int height = Integer.parseInt(request.getParameter("height"));

        
        House ls = LogicFacade.createhouse(length, width, height);
        String html = Tables.legohouse(ls);
        request.getSession().setAttribute("legohouse", ls);
        request.setAttribute("pcelist", html);
        return "legohousepage";
    }
    
}
