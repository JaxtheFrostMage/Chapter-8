// Application prompts user showing valid shipping codes
// accepts a shipping code
// and determines if it is valid
package Debugging;
import javax.swing.*;
public class FixDebugEight1
{
   public static void main(String args[])
   {
      String userCode;
      String entry, message;
      boolean found = false;
      String[] okayCodes = {"A","C","T","H"};
      StringBuffer prompt = new 
            StringBuffer("Enter shipping code for this delivery\nValid codes are: ");
      for(int x = 0; x < okayCodes.length; ++x)
      {
          prompt.append(okayCodes[x]);
          if(x != (okayCodes.length + 1))
             prompt.append(", ");     
      }
      entry = JOptionPane.showInputDialog(null,
         prompt); 
      userCode = entry;
      for(int i = 0; i < okayCodes.length; ++i)
      {
         if(userCode.equalsIgnoreCase(okayCodes[i]))
         {
            found = true;
         }
      }
      if(found)
         message = "Good code";
      else
         message = "Sorry code not found";
      JOptionPane.showMessageDialog(null, message);
   }
}