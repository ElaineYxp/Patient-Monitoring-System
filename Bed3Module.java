package coreservlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="Bed3Module", urlPatterns={"/Bed3Module"})

public class Bed3Module extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Cast the object and get the attribute of bed object
        Bed nb3 = (Bed)getServletContext().getAttribute("newBed3");
        
        //Choose a random number from 0 until the size of the arrayList
        int randomCounter = (int)(Math.random() * ((nb3.getPulseRate().size())));
        
        out.print(nb3.getPulseRate().get(randomCounter) + "," 
                + nb3.getBreathingRate().get(randomCounter) + "," 
                + nb3.getBlood_pressure_systolic().get(randomCounter) + "," 
                + nb3.getBlood_pressure_diastolic().get(randomCounter) + "," 
                + nb3.getTemperature().get(randomCounter));
    }

}
