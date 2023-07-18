import java.io.IOException;

public class OpenYouTube{

  public static void main(String args[]){
   
   String url="https://www.youtube.com/";

   try{

        //works on Linux Operating System


        ProcessBuilder ProcessBuilder= new ProcessBuilder("xdg-open",url);
        Process Process=ProcessBuilder.start();
        Process.waitFor();

   } 
   catch(IOException | InterruptedException e){
    e.printStackTrace();
   }

  }
}
