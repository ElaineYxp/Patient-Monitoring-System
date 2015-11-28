package coreservlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="Bed2Module", urlPatterns={"/Bed2Module"})

public class Bed2Module extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Cast the object and get the attribute of bed object
        Bed nb2 = (Bed)getServletContext().getAttribute("newBed2");
        
        //Choose a random number from 0 until the size of the arrayList
        int randomCounter = (int)(Math.random() * ((nb2.getPulseRate().size())));
        
        out.print(nb2.getPulseRate().get(randomCounter) + "," 
                + nb2.getBreathingRate().get(randomCounter) + "," 
                + nb2.getBlood_pressure_systolic().get(randomCounter) + "," 
                + nb2.getBlood_pressure_diastolic().get(randomCounter) + "," 
                + nb2.getTemperature().get(randomCounter));
    }

}
