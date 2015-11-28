package coreservlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="Bed1Module", urlPatterns={"/Bed1Module"})

public class Bed1Module extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Cast the object and get the attribute of bed object
        Bed nb1 = (Bed)getServletContext().getAttribute("newBed1");
        
        //Choose a random number from 0 until the size of the arrayList
        int randomCounter = (int)(Math.random() * ((nb1.getPulseRate().size())));
        
        out.print(nb1.getPulseRate().get(randomCounter) + "," 
                + nb1.getBreathingRate().get(randomCounter) + "," 
                + nb1.getBlood_pressure_systolic().get(randomCounter) + "," 
                + nb1.getBlood_pressure_diastolic().get(randomCounter) + "," 
                + nb1.getTemperature().get(randomCounter));
    }

}
