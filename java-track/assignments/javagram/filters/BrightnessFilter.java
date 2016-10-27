package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class BrightnessFilter implements Filter{
	
	public Picture process(Picture original) {
		
		Picture processed = new Picture(original.width(), original.height());
        
	    //get each pixel one by one
	    for (int i = 0; i < original.width(); i++) {
	      for (int j = 0; j < original.height(); j++) {
	    	  
	    	  Color c = original.get(i, j);
	          
	          //get color components from each pixel
	          int r = c.getRed();
	          int g = c.getGreen();
	          int b = c.getBlue();
	          
	          int brightr = r + 50;
	          int brightg = g + 50;
	          int brightb = b + 50;
	          if (brightb > 255)
	          {
	        	  brightb = 255;
	          }
	          if (brightg > 255)
	          {
	        	  brightg = 255;
	          }
	          if (brightr > 255)
	          {
	        	  brightr = 255;
	          }
	          
	          
	          processed.set(i, j, new Color(brightr, brightg, brightb));
	    	  
	      }
	    }
		
		return processed;
	}

}
