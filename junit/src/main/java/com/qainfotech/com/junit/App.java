package com.qainfotech.com.junit;

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
        ArrayList<String> datalist=new ArrayList<String>();
        datalist.add("progress");
        datalist.add("Ankur");
        datalist.add("errors");
        ArrayList<String> output=new ArrayList<String>();
        App obj=new App();
        		output=obj.check(datalist);
        System.out.println(output);
    }
}