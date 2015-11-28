package coreservlets;

import java.io.*;
import java.util.*;

public class Bed extends Thread
{
//    private int pulseRate = 0;
    private List<Integer> pulseRate = new ArrayList<>();
    private List<Integer> breathingRate = new ArrayList<>();
    private List<Integer> blood_pressure_systolic = new ArrayList<>();
    private List<Integer> blood_pressure_diastolic = new ArrayList<>();
    private List<Double> temperature = new ArrayList<>();
    private String patientDataLocation = "";
    
    public Bed(String fileLocation)
    {
        this.patientDataLocation = fileLocation;
    }
    
    public List<Integer> getPulseRate()
    {
        return pulseRate;
    }

    public List<Integer> getBreathingRate()
    {
        return breathingRate;
    }

    public List<Integer> getBlood_pressure_systolic()
    {
        return blood_pressure_systolic;
    }

    public List<Integer> getBlood_pressure_diastolic()
    {
        return blood_pressure_diastolic;
    }

    public List<Double> getTemperature()
    {
        return temperature;
    }
    
    @Override
    public void run()
    {
        // read from the csv
        // update pulse and the other values
        try
        {
            sleep(1000);
            BufferedReader br = new BufferedReader(new FileReader(new File(this.patientDataLocation)));
            String line;
            boolean firstLine = true; 
            
            for(int count=1; count<=5; count++)
            {
                while ((line = br.readLine()) != null) 
                {
                    //Ignore the first row of the csv
                    if (firstLine) 
                    {
                       firstLine = false;
                       continue;
                    }
                    String[] cols = line.split(","); 
                    this.pulseRate.add(Integer.parseInt(cols[0]));
                    this.breathingRate.add(Integer.parseInt(cols[1]));
                    this.blood_pressure_systolic.add(Integer.parseInt(cols[2]));
                    this.blood_pressure_diastolic.add(Integer.parseInt(cols[3]));
                    this.temperature.add(Double.parseDouble(cols[4]));
                }
            }
        }
        catch(Exception e)
        {
        }
    }
}
