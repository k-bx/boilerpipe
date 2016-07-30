package com.thoughtleadr.boilerpipe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import de.l3s.boilerpipe.extractors.ArticleExtractor;

class BoilerpipeCLI {
  public static void main(String[] args) throws Exception {
    
    String inputFilePath = args[0];
    String outputFilePath = args[1];
    
    String inputText = readFile(inputFilePath);
    
    String output = ArticleExtractor.INSTANCE.getText(inputText);
  
    writeFile(outputFilePath, output);
  }
  
  private static void writeFile(String file, String contents) throws IOException {
      BufferedWriter writer = null;
      try{
          FileOutputStream fos = new FileOutputStream(file);
          OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
    	  writer = new BufferedWriter(osw);
          writer.write(contents);
      }
      catch (IOException e){}
      finally{
    	  try{
    		  if (writer != null)
    			  writer.close( );
          }catch (IOException e){}
      }
  }
  
  private static String readFile( String file ) throws IOException {
        InputStreamReader isw =
            new InputStreamReader(new FileInputStream(file), "UTF-8");
	BufferedReader reader = new BufferedReader(isw);
	String line  = null;
	StringBuilder stringBuilder = new StringBuilder();
	String ls = System.getProperty("line.separator");
	while( ( line = reader.readLine() ) != null ) {
	    stringBuilder.append( line );
	    stringBuilder.append( ls );
	}
	return stringBuilder.toString();
  }
}

