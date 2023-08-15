import java.io.*;
import java.util.*;
public class File_t {
   public static void main(String args[]) {
      String Path = "C:Cloud.txt";
      
      File file = new File(Path);
      
      long lastModified = file.lastModified();
      Date date = new Date(lastModified);
      System.out.println("This file was last modified at: ");
      System.out.println(date);
   }
}