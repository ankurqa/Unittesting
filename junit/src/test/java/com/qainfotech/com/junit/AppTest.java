package com.qainfotech.com.junit;

import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest 
    
{
	@Test
   public void Testexample() {

   App a1 = new App();
    ArrayList<String> datalist=new ArrayList<String>();
    datalist.add("progress");
    datalist.add("Ankur");
    datalist.add("errors");
    ArrayList<String> output=new ArrayList<String>();
    output.add("progress");
    output.add("errors");
    
    assertEquals("Failed",output,a1.check(datalist));
    
    
}
	
	

}