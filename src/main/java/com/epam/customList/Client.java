package com.epam.customList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Client {
	
	
	private static Logger Logger = LogManager.getLogger(Client.class);
    public static void main(String[] args) 
    {
        CustomList<Integer> customList = new CustomList<>();
 
        //Add elements
        customList.add(10);
        customList.add(20);
        customList.add(30);
        customList.add(40);
        customList.add(50);
        customList.add(60);
        customList.add(70);
        customList.add(80);
        customList.add(90);
        customList.add(100);
        customList.add(110);
        customList.add(120);
        customList.add(130);
        Logger.warn("List after adding some data");
        Logger.info(customList);
         
        //Remove elements from index
        customList.remove(2);
        customList.remove(5);
        customList.remove(10);
        Logger.warn("List after removing some items from index 2,5,10");
        Logger.info(customList);
         
        //Get element with index
        Logger.warn("Element at index 0");
        Logger.info( customList.get(0) );
        Logger.warn("Element at index 9");
        Logger.info( customList.get(9) );
 
        //List Size
        Logger.warn("Size of the Custom List");
        Logger.info(customList.size());
    }
}

