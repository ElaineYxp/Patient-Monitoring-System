package coreservlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="Bed8Module", urlPatterns={"/Bed8Module"})

public class Bed8Module extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Cast the object and get the attribute of bed object
        Bed nb8 = (Bed)getServletContext().getAttribute("newBed8");
        
        //Choose a random number from 0 until the size of the arrayList
        int randomCounter = (int)(Math.random() * ((nb8.getPulseRate().size())));
        
        out.print(nb8.getPulseRate().get(randomCounter) + "," 
                + nb8.getBreathingRate().get(randomCounter) + "," 
                + nb8.getBlood_pressure_systolic().get(randomCounter) + "," 
                + nb8.getBlood_pressure_diastolic().get(randomCounter) + "," 
                + nb8.getTemperature().get(randomCounter));
    }

}
