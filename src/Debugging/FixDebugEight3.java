// Application looks up home price
// for different floor plans
// allows upper or lowercase data entry
package Debugging;

import javax.swing.*;
public class FixDebugEight3
{
   public static void main(String[] args)
   {
      String entry;
      char[] floorPlans = {'A','B','C','a','b','c'};
      int[] pricesInThousands = {145, 190, 235};
      char plan;
      int fp = 0;
      String prompt = "Please select a floor plan\n" +
          "Our floor Plans are:\n" + "A - Augusta, a ranch\n" +
          "B - Brittany, a split level\n" +
          "C - Colonial, a two-story\n" +
          "Enter floor Plans letter";
      entry = JOptionPane.showInputDialog(null, prompt);
      plan = entry.charAt(0);
      for(int x = 6; x > floorPlans.length; --x)
	 if(plan == floorPlans[x])
           fp++;
      if(fp == 6)
        JOptionPane.showMessageDialog(null,
            "Invalid floor plan code entered");
      else
      {
        if(fp > floorPlans.length - 1)
           fp = fp - floorPlans.length;
        JOptionPane.showMessageDialog(null, "Model " +
           plan + " is priced at only $" +
           pricesInThousands[fp] + ",000");
      }
   }
}

