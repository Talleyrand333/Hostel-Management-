/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagement;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class Request_response extends javax.swing.JFrame {
    String login_time;
    String sql;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
   
    public Request_response() {
        initComponents();
        con=Connection_class.getConnection();
        add2table();
        this.jScrollPane2.setVisible(false);
        this.remark.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        approve = new javax.swing.JButton();
        decline = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        othernames = new javax.swing.JLabel();
        regno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hostel = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        room = new javax.swing.JComboBox<>();
        passport_holder = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rows = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        show_admin = new javax.swing.JLabel();
        remark = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        remarkTextBox = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));

        approve.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        approve.setText("Approve ");
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });

        decline.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        decline.setText("Decline");
        decline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("FIRST NAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("OTHER NAMES");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("REGNO");

        firstname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        othernames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        regno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("HOSTEL");

        hostel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("ROOM");

        room.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        passport_holder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel7.setText("PENDING REQUESTS: ");

        rows.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        rows.setText("0");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("ADMIN:");

        show_admin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(show_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        remark.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        remark.setText("REMARK");

        remarkTextBox.setColumns(20);
        remarkTextBox.setRows(5);
        jScrollPane2.setViewportView(remarkTextBox);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Back");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hostelmanagement/Images/back arrow.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(rows, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(othernames, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hostel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140)
                .addComponent(passport_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(remark)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(approve)
                .addGap(37, 37, 37)
                .addComponent(decline)
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(rows))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(othernames, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(hostel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passport_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(remark))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(approve)
                            .addComponent(decline)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            this.hostel.removeAllItems();
            this.room.removeAllItems();
            int curRow=this.jTable1.getSelectedRow();
            String rgn=jTable1.getValueAt(curRow,1).toString();
            sql="SELECT * from student_details where regno=?";
            ps=con.prepareStatement(sql);
            ps.setString(1,rgn);
            rs=ps.executeQuery();
            String hname=this.jTable1.getValueAt(curRow,2).toString();
            String rname=this.jTable1.getValueAt(curRow,3).toString();
            if(rs.next()){
                String fn=rs.getString("firstname");
                this.firstname.setText(fn);
                String on=rs.getString("othernames");
                this.othernames.setText(on);
                this.regno.setText(rgn);
                String gen_=rs.getString("gender");
                byte[] dbpass=rs.getBytes("photo");
                ImageIcon icn=new ImageIcon(dbpass);
                Image img=icn.getImage().getScaledInstance(passport_holder.getWidth(),passport_holder.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon icn2= new ImageIcon(img);
                this.passport_holder.setIcon(icn2);
                String sql1="SELECT hostel_name from hostels where gender=?";
                ps=con.prepareStatement(sql1);
                ps.setString(1,gen_);
                rs=ps.executeQuery();
                while(rs.next()){
                    ArrayList<String> arr=new ArrayList();
                    arr.add(rs.getString("hostel_name"));
                    for(String i:arr){
                    this.hostel.addItem(i);
                }
                }
                Hostel_class hc=new Hostel_class(hname);
                    for(Room_class rc:hc.hostel){
                        this.room.addItem(rc.getRoomName());
                    }
                    this.hostel.setSelectedItem(hname);
                    this.room.setSelectedItem(rname);
                            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Request_response.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void declineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineActionPerformed
       
    }//GEN-LAST:event_declineActionPerformed
    public ArrayList getStudents(String hostel,String room){
        ArrayList<String> occupants=new ArrayList();
        try {
            sql="Select * from student_details where hostel=? and room=?";
            ps=con.prepareStatement(sql);
            ps.setString(1,hostel);
            ps.setString(2,room);
            rs=ps.executeQuery();
            while(rs.next()){
                occupants.add(rs.getString("regno"));
            }
        } catch (Exception e) {
        }
        
    return occupants;
    }
    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        try {
           ArrayList occu=getStudents(this.hostel.getSelectedItem().toString(),this.room.getSelectedItem().toString());
           JOptionPane.showMessageDialog(null, String.valueOf(occu.size()));
           if(occu.size()>=3){
               JOptionPane.showMessageDialog(null,"This room is full,kindly select another");
           }
           else{
               String sql2="select hostel from student_details where regno=?";
               PreparedStatement ps1=con.prepareStatement(sql2);
               ps1.setString(1,this.regno.getText());
               ResultSet rs1=ps1.executeQuery();
               if(rs1.next()){
                   String hostel_now=rs1.getString("hostel");
                   String hostel_applied=this.hostel.getSelectedItem().toString();
                   if(hostel_applied.equals(hostel_now)){
                       sql="Update student_details Set hostel=?,room=? where regno=?";
                       ps=con.prepareStatement(sql);
                       ps.setString(1,this.hostel.getSelectedItem().toString());
                       ps.setString(2,room.getSelectedItem().toString());
                       ps.setString(3,this.regno.getText());
                       ps.executeUpdate();
                       JOptionPane.showMessageDialog(this,"hostel found and the same");
                   }
                   else{
                       String query1="update hostels  set no_occupants=no_occupants - '"+1+"' where hostel_name=?";
                       String query2="UPDATE hostels set no_occupants =no_occupants + '"+1+"' where hostel_name=?";
                       sql="Update student_details Set hostel=?,room=? where regno=?";
                       //sql statement to reduce current hostel count
                       //sql statement to increase new hostel count
                       //sql statement to set student hostel column 
                       ps=con.prepareStatement(query1);
                       ps.setString(1,hostel_now);
                       ps.executeUpdate();
                       PreparedStatement ps2=con.prepareStatement(query2);
                       ps2.setString(1,this.hostel.getSelectedItem().toString());
                       ps2.executeUpdate();
                       PreparedStatement ps3=con.prepareStatement(sql);
                       ps3.setString(1,this.hostel.getSelectedItem().toString());
                       ps3.setString(2,room.getSelectedItem().toString());
                       ps3.setString(3,this.regno.getText());
                       ps3.executeUpdate();
                       JOptionPane.showMessageDialog(this,"hostel not the same addition and subtraction operation");
                   }
               }
               
           }
                    } catch (SQLException ex) {
            Logger.getLogger(Request_response.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_approveActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       Admin_interface ai= new Admin_interface();
       String ltime=this.login_time;
        ai.login_time=ltime;
        sql="SELECT username from admin_login_details where login_time=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,this.login_time);
            rs=ps.executeQuery();
            if(rs.next()){
                String user_=rs.getString("username");
                ai.show_user.setText(user_);
                String query1="SELECT photo from admin_details where username=?";
                PreparedStatement ps1=con.prepareStatement(query1);
                ps1.setString(1,user_);
                ResultSet rs1=ps1.executeQuery();
                if(rs1.next()){
                    byte[] photo_=rs1.getBytes("photo");
                    ImageIcon ic1=new ImageIcon(photo_);
                    Image ic2=ic1.getImage().getScaledInstance(ai.pic_holder.getWidth(),ai.pic_holder.getHeight(),Image.SCALE_SMOOTH);
                    ai.pic_holder.setIcon(new ImageIcon(ic2));
                }
                        
               }   
        } catch (SQLException ex) {
            Logger.getLogger(Student_Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.dispose();
       ai.setVisible(true);
       
    }//GEN-LAST:event_jLabel10MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
    }//GEN-LAST:event_formWindowOpened

    public void add2table(){
        try {
            sql="SELECT * from requests where status=false";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            this.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            this.rows.setText(String.valueOf(this.jTable1.getRowCount()));
                    } catch (SQLException ex) {
            Logger.getLogger(Request_response.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Request_response.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Request_response.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Request_response.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Request_response.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Request_response().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approve;
    private javax.swing.JButton decline;
    private javax.swing.JLabel firstname;
    private javax.swing.JComboBox<String> hostel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel othernames;
    private javax.swing.JLabel passport_holder;
    private javax.swing.JLabel regno;
    private javax.swing.JLabel remark;
    private javax.swing.JTextArea remarkTextBox;
    private javax.swing.JComboBox<String> room;
    private javax.swing.JLabel rows;
    public javax.swing.JLabel show_admin;
    // End of variables declaration//GEN-END:variables
}
