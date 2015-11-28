package coreservlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="Bed5Module", urlPatterns={"/Bed5Module"})

public class Bed5Module extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Cast the object and get the attribute of bed object
        Bed nb5 = (Bed)getServletContext().getAttribute("newBed5");
        
        //Choose a random number from 0 until the size of the arrayList
        int randomCounter = (int)(Math.random() * ((nb5.getPulseRate().size())));
        
        out.print(nb5.getPulseRate().get(randomCounter) + "," 
                + nb5.getBreathingRate().get(randomCounter) + "," 
                + nb5.getBlood_pressure_systolic().get(randomCounter) + "," 
                + nb5.getBlood_pressure_diastolic().get(randomCounter) + "," 
                + nb5.getTemperature().get(randomCounter));
    }

}
