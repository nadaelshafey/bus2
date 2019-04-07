/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nada
 */
public class Bus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new FileReader(new File("file.txt")));
List<Integer>list = new ArrayList<>();
String line;
while((line = br.readLine())!= null){
// split the line you read after the     
String [] r = line.split(",");
    
// iterate through these values

for(int i = 0; i < r.length; i++){
 int val = Integer.parseInt(r[i]);
list.add(val);
}
}br.close();
// number of elments 
System.out.println(list.size());
    
}}
