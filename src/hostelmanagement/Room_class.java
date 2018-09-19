/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagement;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Room_class {
 public ArrayList<String> occupants=new ArrayList();
 private String roomname="";
 public Room_class(String rname){
    this.roomname=rname;
 }
 public String getRoomName(){
 return this.roomname;
 
 }
 public void addOccupant(String stud){
    if(occupants.size()>=3){
    JOptionPane.showMessageDialog(null,"Selected room is full");
}
else{
    occupants.add(stud);
    //JOptionPane.showMessageDialog(null,stud+" added to room");
}
}
public String showOccupants(){
    String output="Occupants in "+this.getRoomName()+"\n";
if(this.occupants.isEmpty()){
    output="This room is empty";
}
else{
    for(int i=0;i<this.occupants.size();i++){
    output+="*"+occupants.get(i)+"\n";
    }
}
    return output;    
}
public void removeOccupant(String occu){
if(this.occupants.contains(occu)){
this.occupants.remove(occu);
}
else{
JOptionPane.showMessageDialog(null,"This student does not belong in this room");
}
}

public int getOccupantCount(){
return occupants.size();
}
public boolean isFull(){
if(this.occupants.size()>=3){
return true;
}
else{
return false;
}
}

    public static void main(String[] args) {
     Room_class rm1=new Room_class("Room1");
     rm1.addOccupant("Chinwe");
     rm1.addOccupant("Ada");
     rm1.addOccupant("talley");
     rm1.removeOccupant("talley");
     rm1.addOccupant("Obi");
     String names=rm1.showOccupants();
     JOptionPane.showMessageDialog(null, names);
     
    }
}
