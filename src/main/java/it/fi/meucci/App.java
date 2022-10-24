package it.fi.meucci;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class App 
{
    public static void main( String[] args )
    {
        

        Date myDate1 = new Date(2004, 7, 29);
        Alunno a1 = new Alunno("Riccardo", "Fantacci", myDate1);
        Date myDate2 = new Date(2004, 12, 31);
        Alunno a2 = new Alunno("Flavio", "Ndoja", myDate2);
        Date myDate3 = new Date(2004, 8, 31);
        Alunno a3 = new Alunno("Niccolò", "Sartorio", myDate3);
        Date myDate4 = new Date(2004, 3, 29);
        Alunno a4 = new Alunno("Guido", "Lanzi", myDate4);

        ArrayList<Alunno> alunni = new ArrayList<>();
        alunni.add(a1);
        alunni.add(a2);
        alunni.add(a3);
        alunni.add(a4);

        Classe c1 = new Classe(5, "CIA", "04-TC", alunni);

        try{
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(new File("serialize.xml"),c1);
        }catch(Exception e){}
        
        
        }
    }

