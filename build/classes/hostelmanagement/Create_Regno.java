/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author user
 */
public class Create_Regno {
    public static String generate(){
       String[] alpha={"A","B","C","D","E","F","G","H","I","J","K","L","M","N",
            "O","P","Q","R","S","T","U","V","W","X","Y","Z"};
       Random ran= new Random();
       String num1=String.valueOf(ran.nextInt(9));
       String num2=String.valueOf(ran.nextInt(9));
       String num3=String.valueOf(ran.nextInt(9));
       String nums=num1+num2+num3;
       String al1=alpha[ran.nextInt(26)];
       String al2=alpha[ran.nextInt(26)];
       String all=al1+al2;
       String regno=all+"/"+nums;
       return regno;
    }
    public static void main(String[] args) {
        String f=generate();
        System.out.println(f);
    }
}
