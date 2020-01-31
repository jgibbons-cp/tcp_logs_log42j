package TCP_Logs.TCP_Logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class.getName());
	
    public static void main( String[] args )
    {
        System.out.println( "Hello Datadog is the message will send to Datadog!" );
        LOGGER.info("Hello Datadog! from log4j2!");
    }
}
