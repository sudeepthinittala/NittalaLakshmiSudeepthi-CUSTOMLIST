package com.epam.collections.customlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Customlist<Integer> list = new Customlist<>();
    	list.add(22);
        list.add(33);
        list.add(44);
        list.add(45);
        LOGGER.debug("List is : "+list);
        LOGGER.info("Removed Second Element:");
        list.remove(2);
        LOGGER.info("List is:"+list);
        LOGGER.debug("First ELement is: "+list.get(0) );
        LOGGER.debug("Second Element is: "+list.get(1) );
        LOGGER.debug("Size of the list is: "+list.size());
        Customlist<String>list2=new Customlist<>();
        list2.add("icecream");
        list2.add("chocolate");
        list2.add("sweets");
        list2.add("drinks");
        LOGGER.info("List2 is :"+list2);
        LOGGER.debug("First Element is: "+list.get(0));
        LOGGER.debug("Second Element is: "+list2.size());
        LOGGER.info("Removed Third Element: ");
        list2.remove(3);
        LOGGER.debug("List is:"+list2);
    }
}
