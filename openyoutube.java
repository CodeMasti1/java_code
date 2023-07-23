import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenYouTube {
    public static void main(String[] args) {
        String youtubeURL = "https://www.youtube.com";
        
        try {
            // Check if Desktop is supported on the current platform
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                
                // Check if the web browser is supported
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    // Open the YouTube URL in the default web browser
                    desktop.browse(new URI(youtubeURL));
                } else {
                    System.out.println("Web browser is not supported.");
                }
            } else {
                System.out.println("Desktop is not supported.");
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
 
