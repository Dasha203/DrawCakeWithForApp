public class DrawCakeWithForApp {

    public static void main(String[] args) {

       final int SMOKE  = 1; 
       final int FIRE   = 2; 
       final int CANDLE = 3; 
       final int CREAM  = 4; 
       final int BASE   = 5; 


       for(int level=1; level<5 ;level++) {
           switch(level) {
               case SMOKE:System.out.print(" "); 
               case FIRE: System.out.print(" "); 
               case CANDLE: System.out.print(" ");
               case CREAM:System.out.print(" ");
               case BASE:System.out.println(" ");
              
  
               
               System.out.print(" ");
               for( int elements = 1; elements<=5; elements++) {
         		  System.out.print(". ");
         	}System.out.println();
               
                
               System.out.print(" ");
               for( int elements = 1; elements<=5; elements++) {
         		  System.out.print(". ");
         	}System.out.println();
         	   
           
            
               
               System.out.print(" ");
               for( int elements = 1; elements<=5; elements++) {
         		  System.out.print("^ ");
         	}System.out.println();
               
               System.out.print(" ");
               for( int elements = 1; elements<=5; elements++) {
         		  System.out.print("| ");
         	}System.out.println();
               
                     for( int elements = 1; elements<=11; elements++) {
                        		  System.out.print("~");
                        	} 
                     System.out.println();
                     
                     
                     
                     for(int lines=1; lines<=3; lines++) {
                    	
                     for(int elements=1; elements<=11; elements++) {
                        	System.out.print("#");
                        	}
                     System.out.println();
                     }
                        	
                        		
                        
                     
                        System.out.println();
                    }
               break;
           }
       }

        
    }



