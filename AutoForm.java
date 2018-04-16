import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

public class AutoForm
{
    public static void printString(String input) {
        String text = input;
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
        
        try { 
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);            
        } catch (AWTException e) {
            e.printStackTrace();        
        }
    }
    
    public static void main(String[] args) {         
       try {    
           Robot robot = new Robot();
           // Creates the delay of 5 sec
           // Robot start writing
           robot.delay(5000);
           int WAITTIME = 50;
           for (int j = 0; j < 3; ++j) {  
                // 9 tabs to advance through the choices
                for (int k = 0; k < 9; ++k) {
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    robot.delay(WAITTIME);    
                }
                
                // Hit enter to go to submit vote
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                robot.delay(1000);
                
                // Use alt + left arrow to go back
                robot.keyPress(KeyEvent.VK_ALT);
                robot.keyPress(KeyEvent.VK_LEFT);                
                robot.keyRelease(KeyEvent.VK_LEFT);
                robot.keyRelease(KeyEvent.VK_ALT);
                robot.delay(1000);
            }
        } catch (AWTException e) {
            e.printStackTrace();            
        }
    }

}
