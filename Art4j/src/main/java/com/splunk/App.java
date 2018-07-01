package com.splunk;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import com.splunk.logging.SplunkCimLogEvent;


	
public class App {
	static final Logger logger = LogManager.getLogger("splunk.logger");
	
	public static void main(String[] args){


	 logger.info("Hello World");
	 
	 logger.fatal(new SplunkCimLogEvent("Event name", "event-id") {{
	     // You can add an arbitrary key=value pair with addField.
	     addField("name", "value");

	     // If you are logging exceptions, use addThrowable, which
	     // does nice formatting. If ex is an exception you have caught
	     // you would log it with
	     // addThrowableWithStacktrace(ex);

	     // SplunkCimLogEvent provides lots of convenience methods for
	     // fields defined by Splunk's Common Information Model. See
	     // the SplunkCimLogEvent JavaDoc for a complete list.
	     setAuthAction("deny");
	 }});
	}
}
