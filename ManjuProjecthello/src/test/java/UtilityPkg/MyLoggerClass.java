package UtilityPkg;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyLoggerClass {
	
	private static Logger lg = Logger.getLogger(UtilityPkg.MyLoggerClass.class);

	public MyLoggerClass()
	{
		PropertyConfigurator.configure("log4j.properties");	
	}
	
	public void loginfo(String str)
	{
		lg.info(str);
	}
	
	public void logtrace(String str)
	{
		lg.trace(str);
	}
	
	public void logdebug(String str)
	{
		lg.debug(str);
	}
	
	public void logfatal(String str)
	{
		lg.fatal(str);
	}
	
}
