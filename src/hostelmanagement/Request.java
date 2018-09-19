/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagement;

/**
 *
 * @author user
 */
public class Request {
    String id;
    boolean status=false;
    String hostel_picked;
    String room_picked;
    
    public Request(String id,String host,String room){
        this.id=id;
        this.status=false;
        this.hostel_picked=host;
        this.room_picked=room;
    }
    public static void main(String[] args) {
        
    }
}
