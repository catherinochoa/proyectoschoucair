package co.com.retounotips.screenplay.util;

import java.util.concurrent.Callable;

public class TiempoUtilidad {

	public static Callable<Boolean> successfulCondition() {
        return new Callable<Boolean>() {
              
        	public Boolean call() throws Exception {
                      Boolean allMessagesProcessed = true;
                      return allMessagesProcessed;
             }
        };
	}
}
