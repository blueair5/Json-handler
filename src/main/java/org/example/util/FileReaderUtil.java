package org.example.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author : [seaflower]
 * @version : [v1.0]
 * @description : [读取一个文件的内容作为一个 String 类型变量]
 * @Time : [2023/11/20 22:31]
 */
public class FileReaderUtil {
    public static String readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder fileContents = new StringBuilder();
            char[] buffer = new char[8192];
            
            /*
             * 为了防止文件过大，我们可以逐块的读取文件的内容
             */
            int charsRead;
            while ((charsRead = reader.read(buffer, 0 ,buffer.length)) != -1) {
                fileContents.append(buffer, 0, charsRead);
            }
            
            return fileContents.toString(); 
        } catch (IOException e) {
            System.out.println("读取文件出错" + e);
        }
        
        return "";
    }
}
