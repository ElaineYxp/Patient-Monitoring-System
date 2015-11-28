package coreservlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="Bed6Module", urlPatterns={"/Bed6Module"})

public class Bed6Module extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Cast the object and get the attribute of bed object
        Bed nb6 = (Bed)getServletContext().getAttribute("newBed6");
        
        //Choose a random number from 0 until the size of the arrayList
        int randomCounter = (int)(Math.random() * ((nb6.getPulseRate().size())));
        
        out.print(nb6.getPulseRate().get(randomCounter) + "," 
                + nb6.getBreathingRate().get(randomCounter) + "," 
                + nb6.getBlood_pressure_systolic().get(randomCounter) + "," 
                + nb6.getBlood_pressure_diastolic().get(randomCounter) + "," 
                + nb6.getTemperature().get(randomCounter));
    }

}
