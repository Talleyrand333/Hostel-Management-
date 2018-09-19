/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagement;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Management {
    ArrayList<Hostel_class> school_hostel=new ArrayList();
    
    public void addHostel(String hname){
        school_hostel.add(new Hostel_class(hname));
    }
    public int getHostelCount(){
        return school_hostel.size();
    }
    public void removeHostel(Hostel_class host){
        school_hostel.remove(host);
    }
    
    public void showOccupants(Hostel_class host){
    host.showOccupants();
    }
    
    public void showOccupants(Hostel_class host,Room_class room){
    
    }
    public ArrayList<Hostel_class> showHostels(){
    return this.school_hostel;
    }
    public ArrayList<Room_class> showRooms(Hostel_class host){
    return host.hostel;
    }
    public static void main(String[] args) {
        Management mana= new Management();
        mana.addHostel("Rose");
        
    }
}
