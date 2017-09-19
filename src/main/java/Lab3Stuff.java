import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
/**
 * lksmflamfalsdmal.
 * @author user
 *
 */
public class Lab3Stuff {
  /**
   * Retrieve contents from a URL and return them as a string.
   *
   * @param url url to retrieve contents from
   * @return the contents from the url as a string, or an empty string on error
   */
        public static String urlToString(final String url) {
            /**
             * Retrieve contents from a URL and return them as a string.
             *
             * @param url url to retrieve contents from
             * @return the contents from the url as a string, or an empty string on error
             */
            Scanner urlScanner;
            try {
                // String url = "http://erdani.com/tdpl/hamlet.txt"
                urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
            } catch (IOException e) {
                return "";
            }
            String contents = urlScanner.useDelimiter("\\A").next();
            urlScanner.close();
            return contents;
       }
        /**
         * @param args oasjdoasjd.
         */
        public static void main(final String[] args) {
                  System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt"));
        }

}
