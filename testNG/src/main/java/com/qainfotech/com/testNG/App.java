package com.qainfotech.com.testNG;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;

public class App 
{
	public ArrayList<String> check(ArrayList<String> array){
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<array.size();i++) {
			int j;
			for(j=1;j<array.get(i).length();j++) {
				if(array.get(i).charAt(j)==array.get(i).charAt(j-1)) {
					arr.add(array.get(i));
					break;
				}
			}
		}
		return arr;
		
	}
	
    public static void main( String[] args )
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("progress");
        list.add("Ankur");
        list.add("errors");
        ArrayList<String> output=new ArrayList<String>();
        App obj=new App();
        		output=obj.check(list);
        System.out.println(output);
    }
}