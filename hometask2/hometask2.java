package hometask2;

import java.io.FileReader;
import java.io.IOException;

public class hometask2 {
    
    public static void main (String[] args) throws Exception {
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader("info.txt")) {
            int c;
        
            while (c = reader.read) != -1) {
                builder.append((char) c);
            }           
        } catch (IOException ex) {
            System.out.pritnln(ex.getMessage());
        }
            System.out.println(SQL(builder));
 }

    private static String SQL(StringBuilder builder1) {
        String str = new String(builder1);
        if (str.trim()).length() !=0) {
            str = str.replace(":", "=");
            str = str.replace("\", ");
            String[] strList = str.split(", ");
            str = "select * from students where " +strList[0] + "," + strList[1] + "," + strList[2] + "," + strList[3];
        
        } else 
            str = "Файла нет";
        return.str;
        

        }
    }