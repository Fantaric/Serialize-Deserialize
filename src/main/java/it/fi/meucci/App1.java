package it.fi.meucci;

import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App1 {
    
    public static void main( String[] args )
    {

       try{
        XmlMapper xmlMapper = new XmlMapper();
        Classe c2 = xmlMapper.readValue(new File("serialize.xml"), Classe.class);
        System.out.println(c2.getAula());
       }catch(Exception e){}
        
    }
}
