import java.io.*;
class Test90
{
  private static void copyfile(String srFile, String dtFile){
  try{
  File f1 = new File("out.txt");
  File f2 = new File("out1.txt");
  InputStream in = new FileInputStream(f1);
  
  //For Append the file.
//  OutputStream out = new FileOutputStream(f2,true);

  //For Overwrite the file.
  OutputStream out = new FileOutputStream(f2);

  byte[] buf = new byte[1024];
  int len;
  while ((len = in.read(buf)) > 0){
  out.write(buf, 0, len);
  }
  in.close();
  out.close();
  System.out.println("File copied.");
  }
  catch(FileNotFoundException ex){
  System.out.println(ex.getMessage() + " in the specified directory.");
  System.exit(0);
  }
  catch(IOException e){
  System.out.println(e.getMessage());  
  }
  }
  public static void main(String[] args){
  switch(args.length){
  case 0: 
	  System.out.println("File has not mentioned.");
    System.exit(0);
  case 1: System.out.println("Destination file has not mentioned.");
  System.exit(0);
  case 2: copyfile(args[0],args[1]);
  System.exit(0);
  default : System.out.println("Multiple files are not allow.");
  System.exit(0);
  }
  }
}
