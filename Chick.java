class Chick implements Animal 
{     
     private String myType;     
     private String mySound1;
     private String mySound2;      
     public Chick(String type, String sound1, String sound2)     {         
         myType = type;         
         mySound1 = sound1;
         mySound2 = sound2;     
     }     
  
           
     public String getSound(){if (Math.random() > 0.5)
         return mySound1; 
         else 
         return mySound2;
    }     
     public String getType(){return myType;} 
}