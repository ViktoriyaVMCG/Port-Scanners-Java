//To run the following program
//Use cmd and type the pathway to the this file
//Then in cmd write javac SimpleJavaPortScan.java
//After that type java SimpleJavaPortScan 127.0.0.1
//Then wait. It is going to take some time to check and find 
//Open ports 
//Version 1
//Port Scanner

import java.net.*;

public class SimpleJavaPortScan{
   public static void main(String[] args){
      for(int port = 1; port <= 65535; port ++){
         try{
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("localhost", port), 1000);
            socket.close();
            System.out.println("Port " + port + " is open");
            } catch (Exception ex) {
         }
      }
   }
}

//Version 2
//Port Scanner

import java.net.*;

class SimpleJavaPortScan{
   public static void main(String[] args){
      Socket s;
      for(int i=1; i<65536; i++){
         try{
            s=new Socket(args[0], i);
            System.out.println("Port Open:"+i);
            }catch(Exception e){
            
            }
           }
          } 
         } 