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
            // robot.delay(50);
        } catch (AWTException e) {
            e.printStackTrace();        
        }
    }
    
    public static void main(String[] args) {         
       try {    
           Robot robot = new Robot();
            // Creates the delay of 5 sec so that you can open notepad before
            // Robot start writting
            robot.delay(5000);
            int WAITTIME = 50;
           for (int j = 0; j < 300; ++j) {             
                
                printString("Brandon Born");
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                robot.delay(WAITTIME);
                printString("Kalamazoo, MI");
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                robot.delay(WAITTIME);
                printString("brandon.born@vanderbilt.edu");
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                robot.delay(WAITTIME);
                printString("32");
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                robot.delay(WAITTIME);
                printString("Personal favorite number");
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                robot.delay(WAITTIME);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                robot.delay(1000);
                
                // Submit again page
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                robot.delay(WAITTIME);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                robot.delay(WAITTIME);
            }
        } catch (AWTException e) {
            e.printStackTrace();
            
        }
    }

}
