import java.utill.scanner;
   public class p8
      {
         public static void main(string []args)
           {
  
             System.out.println("Enter A string");
             Scanner Sc=new Scanner(System.in);
             string str=sc.nextLine();
             char []chars=str.toCharArray();
             
              int count=0;
             for(char c:chars)
              {
                  switch(c)
                   {
                           case 'a':  
                            case 'e':  
                             case 'i':  
                              case 'o':  
                             case 'u': 
               count++;
               break;

                    }       


              }
            

  System.out.println("number of vo wles in= "+count);  


}



     }