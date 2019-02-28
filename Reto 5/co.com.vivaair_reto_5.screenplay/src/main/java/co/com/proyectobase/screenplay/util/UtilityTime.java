package co.com.proyectobase.screenplay.util;

import java.util.concurrent.Callable;

public class UtilityTime {
                public static Callable<Boolean> successfulCondition() {
         return new Callable<Boolean>() {
                public Boolean call() throws Exception {
                       Boolean allMessagesProcessed = true;
                       return allMessagesProcessed;
                }
         };
   }
}