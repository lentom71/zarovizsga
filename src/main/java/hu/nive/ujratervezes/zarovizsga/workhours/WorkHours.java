package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class WorkHours
{
    String minWork(String file)
    {
       try (BufferedReader reader = Files.newBufferedReader(Path.of(file)))
       {
            String line;
            String[] parts;
            String szoveg = null;
            int min = 25;
            while ((line = reader.readLine()) != null)
            {
                parts = line.split(",");
                if(Integer.parseInt(parts[1]) < min)
                {
                    min = Integer.parseInt(parts[1]);
                    szoveg = parts[0] + ": " + parts[2];
                }
            }
            return szoveg;
        }
        catch (IOException e)
        {
            throw new IllegalStateException("File not read", e);
        }
    }
}
