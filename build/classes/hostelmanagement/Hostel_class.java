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
public class Hostel_class {
    ArrayList<Room_class> hostel=new ArrayList();
    String hostel_name="";
    
    public Hostel_class(String hname){
        this.hostel_name=hname;
        Room_class room1=new Room_class("room1");
        hostel.add(room1);
        Room_class room2=new Room_class("room2");
        hostel.add(room2);
        Room_class room3=new Room_class("room3");
        hostel.add(room3);
        Room_class room4=new Room_class("room4");
        hostel.add(room4);
        Room_class room5=new Room_class("room5");
        hostel.add(room5);
        Room_class room6=new Room_class("room6");
        hostel.add(room6);
        Room_class room7=new Room_class("room7");
        hostel.add(room7);
        Room_class room8=new Room_class("room8");
        hostel.add(room8);
        Room_class room9=new Room_class("room9");
        hostel.add(room9);
        Room_class room10=new Room_class("room10");
        hostel.add(room10);
    }
    public void addRoom(String rname){
       if(hostel.size()>=11){
           JOptionPane.showMessageDialog(null,"No other rooms can be added to this hostel");
       }
       Room_class room11=new Room_class(rname);
       hostel.add(room11);
           JOptionPane.showMessageDialog(null,"Room Added");
    }
    public int numberOfRooms(){
        return hostel.size();
    }
    public String showRooms(){
        String rooms_="";
        for(int i=0;i<this.hostel.size();i++){
            rooms_+=this.hostel.get(i).getRoomName()+"\n";
        }
        return rooms_;
    }
    public String showOccupants(){
    String output=this.hostel_name+"\t Students \n";
    if(this.hostel.isEmpty()){
        output="This hostel is empty";
    }    
    else{
    for(int i=0;i<hostel.size();i++){
        output+=this.hostel.get(i).getRoomName()+"\n"+this.hostel.get(i).showOccupants()+"\n";
    }
    }
    return output;
    }
    public String showOccupants(int roomnumber){
        Room_class room=hostel.get(roomnumber);
        String occupants=room.showOccupants();
        return occupants;
    }
    public void addStudent(int roomnumber,String stude){
    Room_class rc=this.hostel.get(roomnumber);
    if(rc.isFull()){
    JOptionPane.showMessageDialog(null,"This room is full");
    }
    else{
    rc.addOccupant(stude);
    }       
    }
    public void removeStudent(int roomnumber,String stude){
    Room_class rc=this.hostel.get(roomnumber);
    rc.removeOccupant(stude);
    }
    
    public int getOccupantCount(){
    int total=0;
    for(int i=0;i<this.hostel.size();i++){
    total+=this.hostel.get(i).getOccupantCount();
    }
    return total;
    }
    public static void main(String[] args) {
    Hostel_class hos=new Hostel_class("Block 1");
    
    hos.addStudent(0,"samuel");
    hos.addStudent(2,"Ada");
    hos.addStudent(3,"Charles");
    hos.addStudent(0,"Max");
    hos.addStudent(5,"Bimpe");
    hos.addStudent(2,"Talley");
    hos.addStudent(3,"Chinwe");
    hos.removeStudent(0,"samuel");
    int s=hos.numberOfRooms();
    int all=hos.getOccupantCount();
        System.out.println(all);
        System.out.println(s);
    }
}
