public class test{

   public static void main(String[] args){
      try{
        Runtime.getRuntime().exec( "cscript E:\\Test\\myVBS.vbs" );


      }catch(Exception e)
      {
         System.out.println(e);
      }
     
   }
}