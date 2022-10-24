package it.fi.meucci;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App1 {
    

    public static void main( String[] args )
    {

       try{
        ObjectMapper objectMapper = new ObjectMapper();
        Classe c = objectMapper.readValue(new File("serialize.json"), Classe.class);
        System.out.println(c.getAula());
       }catch(Exception e){}
        
    }
}
