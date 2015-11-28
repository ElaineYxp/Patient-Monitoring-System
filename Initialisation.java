package coreservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="Initialisation", urlPatterns={"/Initialisation"})

public class Initialisation extends HttpServlet 
{
    @Override
    public void init()
    {
        //Create Bed 1 object and start the initialisation
        Bed newBed1 = new Bed("C:\\Users\\lenovo\\Desktop\\Sem 1\\MOD 003263 Software Engineering\\Assignment\\PatientData\\Bed1.csv");
        newBed1.start();
        getServletContext().setAttribute("newBed1", newBed1);
        
        //Create Bed 2 object and start the initialisation
        Bed newBed2 = new Bed("C:\\Users\\lenovo\\Desktop\\Sem 1\\MOD 003263 Software Engineering\\Assignment\\PatientData\\Bed2.csv");
        newBed2.start();
        getServletContext().setAttribute("newBed2", newBed2);
        
        //Create Bed 3 object and start the initialisation
        Bed newBed3 = new Bed("C:\\Users\\lenovo\\Desktop\\Sem 1\\MOD 003263 Software Engineering\\Assignment\\PatientData\\Bed3.csv");
        newBed3.start();
        getServletContext().setAttribute("newBed3", newBed3);
        
        //Create Bed 4 object and start the initialisation
        Bed newBed4 = new Bed("C:\\Users\\lenovo\\Desktop\\Sem 1\\MOD 003263 Software Engineering\\Assignment\\PatientData\\Bed4.csv");
        newBed4.start();
        getServletContext().setAttribute("newBed4", newBed4);
        
        //Create Bed 5 object and start the initialisation
        Bed newBed5 = new Bed("C:\\Users\\lenovo\\Desktop\\Sem 1\\MOD 003263 Software Engineering\\Assignment\\PatientData\\Bed5.csv");
        newBed5.start();
        getServletContext().setAttribute("newBed5", newBed5);
        
        //Create Bed 6 object and start the initialisation
        Bed newBed6 = new Bed("C:\\Users\\lenovo\\Desktop\\Sem 1\\MOD 003263 Software Engineering\\Assignment\\PatientData\\Bed6.csv");
        newBed6.start();
        getServletContext().setAttribute("newBed6", newBed6);
        
        //Create Bed 7 object and start the initialisation
        Bed newBed7 = new Bed("C:\\Users\\lenovo\\Desktop\\Sem 1\\MOD 003263 Software Engineering\\Assignment\\PatientData\\Bed7.csv");
        newBed7.start();
        getServletContext().setAttribute("newBed7", newBed7);
        
        //Create Bed 8 object and start the initialisation
        Bed newBed8 = new Bed("C:\\Users\\lenovo\\Desktop\\Sem 1\\MOD 003263 Software Engineering\\Assignment\\PatientData\\Bed8.csv");
        newBed8.start();
        getServletContext().setAttribute("newBed8", newBed8);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
    } 
}
