package coreservlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="Bed7Module", urlPatterns={"/Bed7Module"})

public class Bed7Module extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Cast the object and get the attribute of bed object
        Bed nb7 = (Bed)getServletContext().getAttribute("newBed7");
        
        //Choose a random number from 0 until the size of the arrayList
        int randomCounter = (int)(Math.random() * ((nb7.getPulseRate().size())));
        
        out.print(nb7.getPulseRate().get(randomCounter) + "," 
                + nb7.getBreathingRate().get(randomCounter) + "," 
                + nb7.getBlood_pressure_systolic().get(randomCounter) + "," 
                + nb7.getBlood_pressure_diastolic().get(randomCounter) + "," 
                + nb7.getTemperature().get(randomCounter));
    }

}
