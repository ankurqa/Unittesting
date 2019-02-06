package com.qainfotech.com.testNG;
/**
 * Unit test for simple App.
 */
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AppTest 
   
{
    @Test
    public void TestExample() {
	App a1 = new App();
    ArrayList<String> datalist=new ArrayList<String>();
    datalist.add("Progress");
    datalist.add("Ankur");
    datalist.add("errors");
    ArrayList<String> result=new ArrayList<String>();
    result.add("progress");
    result.add("errors");
    
    Assert.assertEquals(result,a1.check(datalist),"Failed");
}}
