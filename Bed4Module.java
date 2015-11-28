package coreservlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="Bed4Module", urlPatterns={"/Bed4Module"})

public class Bed4Module extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Cast the object and get the attribute of bed object
        Bed nb4 = (Bed)getServletContext().getAttribute("newBed4");
        
        //Choose a random number from 0 until the size of the arrayList
        int randomCounter = (int)(Math.random() * ((nb4.getPulseRate().size())));
        
        out.print(nb4.getPulseRate().get(randomCounter) + "," 
                + nb4.getBreathingRate().get(randomCounter) + "," 
                + nb4.getBlood_pressure_systolic().get(randomCounter) + "," 
                + nb4.getBlood_pressure_diastolic().get(randomCounter) + "," 
                + nb4.getTemperature().get(randomCounter));
    }

}
