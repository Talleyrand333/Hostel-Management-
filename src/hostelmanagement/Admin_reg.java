/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagement;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author user
 */
public class Admin_reg extends javax.swing.JFrame {
    String sql;
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    public static boolean isChanged=false;
    public static File f;
    
    public Admin_reg() {
        initComponents();
        holder.setIcon(setDefaultPicture());
        con=Connection_class.getConnection();
        add2table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        holder = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        othernames = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        c_password = new javax.swing.JPasswordField();
        status = new javax.swing.JComboBox<>();
        show_password = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rows = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel1.setText("First Name");

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel2.setText("Other Names");

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel4.setText("Phone ");

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel6.setText("Confirm Password");

        holder.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));

        jLabel8.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel8.setText("Status");

        jButton1.setFont(new java.awt.Font("Trajan Pro", 1, 11)); // NOI18N
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Trajan Pro", 1, 11)); // NOI18N
        jButton2.setText("Capture");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        show_password.setText("show");
        show_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_passwordMouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Trajan Pro", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 51));
        jButton3.setText("Register");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Trajan Pro", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel10.setText("GENDER");

        gender.add(female);
        female.setText("female");

        gender.add(male);
        male.setText("male");

        jLabel12.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel12.setText("Username");

        jLabel13.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel13.setText("registered users:");

        rows.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(othernames, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81)
                .addComponent(holder, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_password, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(female)
                                .addGap(3, 3, 3)
                                .addComponent(male))
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(show_password)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(4, 4, 4)
                .addComponent(jButton2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(122, 122, 122)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(101, 101, 101)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jButton3)
                .addGap(71, 71, 71)
                .addComponent(jButton4)
                .addGap(21, 21, 21)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rows, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(othernames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(holder, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(female)
                            .addComponent(male))
                        .addGap(7, 7, 7)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(c_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(show_password))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8))
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rows, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hostelmanagement/EXIT.PNG"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("-");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\Photoshop\\NMTI CREST_cut.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(26, 26, 26)
                .addComponent(jLabel7))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void insert2db() throws IOException{
        Icon ic=holder.getIcon();
        ImageIcon icn=(ImageIcon)ic;
        Image img2=icn.getImage();
        BufferedImage bfi=image2buf(img2);
        f=new File("newp.jpg");
        ImageIO.write(bfi,"JPG",f);
        FileInputStream fin= new FileInputStream(f);
        try {
            sql="INSERT INTO admin_details(firstname,othernames,email,phone,gender,password,status,username,photo)"+
                    "values(?,?,?,?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            String fname=this.firstname.getText();
            ps.setString(1,fname);
            String other_=this.othernames.getText();
            ps.setString(2,other_);
            String em=this.email.getText();
            ps.setString(3,em);
            ps.setString(4,this.phone.getText());
            String sel;
            if(this.male.isSelected()){
            sel="m";
            }
            else {
            sel="f";
            }
            ps.setString(5,sel);
            String pw=String.valueOf(this.password.getPassword());
            ps.setString(6,pw);
            ps.setString(7,this.status.getSelectedItem().toString());
            ps.setString(8,this.username.getText());
            ps.setBinaryStream(9,fin,fin.available());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Details inserted Successfully");
            f.delete();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }
    public static BufferedImage image2buf(Image img ){
        if(img instanceof BufferedImage){
        return (BufferedImage)img;
        }
        else{
        BufferedImage bi=new BufferedImage(img.getWidth(null),img.getHeight(null),BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d=bi.createGraphics();
        g2d.drawImage(img,0,0,null);
        g2d.dispose();
        return bi;
        } 
    }   
    

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String pw=String.valueOf(this.password.getPassword());
        String cpw=String.valueOf(this.c_password.getPassword());
        String em=email.getText();
        String regex_="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";
        String num=this.phone.getText();
        if (this.firstname.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Enter your first name","Attention",JOptionPane.WARNING_MESSAGE);
            this.firstname.setBackground(Color.cyan);
            this.firstname.requestFocusInWindow();
            return;
        }
        else if (this.othernames.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Enter your last name","Attention",JOptionPane.WARNING_MESSAGE);
            this.othernames.setBackground(Color.cyan);
            this.othernames.requestFocusInWindow();
            return;
        }
        else if (this.email.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Enter your email","Attention",JOptionPane.WARNING_MESSAGE);
            this.email.setBackground(Color.cyan);
            this.email.requestFocusInWindow();
            return;
        }
        else if (!em.matches(regex_)){
            JOptionPane.showMessageDialog(this,"Enter a valid email address","Attention",JOptionPane.WARNING_MESSAGE);
            this.email.setBackground(Color.cyan);
            this.email.requestFocusInWindow();
            return;
        }

        else if (this.phone.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Enter a valid Phone Number","Attention",JOptionPane.WARNING_MESSAGE);
            this.phone.setBackground(Color.cyan);
            this.phone.requestFocusInWindow();
            return;
        }
        else if (StringUtils.isNumeric(num)==false|num.length()!=11){
            JOptionPane.showMessageDialog(this,"Please use a valid Number","Attention",JOptionPane.WARNING_MESSAGE);
            this.phone.setBackground(Color.cyan);
            this.phone.requestFocusInWindow();
        }
        else if(this.gender.getSelection()==null){
            JOptionPane.showMessageDialog(this,"Select your gender","Attention",JOptionPane.WARNING_MESSAGE);
        }
        else if (pw.equals("")){
          JOptionPane.showMessageDialog(this,"Your password cannot be blank","Attention",JOptionPane.WARNING_MESSAGE);
          this.password.setBackground(Color.cyan);
          this.password.requestFocusInWindow();
      }
      else if(pw.length()<6){
          JOptionPane.showMessageDialog(this,"Password is too short","Attention",JOptionPane.WARNING_MESSAGE);
          this.password.setBackground(Color.cyan);
          this.c_password.setText("");
          this.password.requestFocusInWindow();
      }
      else if(this.status.getSelectedIndex()==0) {
          JOptionPane.showMessageDialog(null,"Please select a valid status");
      }
      else if(isChanged==false){
      JOptionPane.showMessageDialog(this,"Enter a valid photo","ATTENTION",JOptionPane.WARNING_MESSAGE);
      }
      else if(!pw.equals(cpw)){
          JOptionPane.showMessageDialog(this,"Your passwords do not match","Attention",JOptionPane.WARNING_MESSAGE);
          this.c_password.setText("");
          this.password.setBackground(Color.cyan);
          this.password.requestFocusInWindow();
      }
      else if(this.username.getText().equals("")){
          JOptionPane.showMessageDialog(null,"Enter a valid username","Attention",JOptionPane.WARNING_MESSAGE);
          this.username.setBackground(Color.cyan);
          this.username.requestFocusInWindow();
      }
      else{
            try {
                insert2db();
                add2table();
            } catch (IOException ex) {
                Logger.getLogger(Admin_reg.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
    }//GEN-LAST:event_jButton3ActionPerformed
    public  ImageIcon setDefaultPicture(){
    String location="C:\\java tests\\java src files\\NewDbProject2\\src\\newdbproject2\\images2.png";
    ImageIcon ii=new ImageIcon(location);
    Image i2=ii.getImage();
    Image i3=i2.getScaledInstance(holder.getWidth(),holder.getHeight(),Image.SCALE_SMOOTH);
    ImageIcon i4= new ImageIcon(i3);
    return i4;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFileChooser showdialog= new JFileChooser();
       showdialog.showOpenDialog(null);
       File f=showdialog.getSelectedFile();
       String filepath=f.getAbsolutePath();
       ImageIcon ic1=new ImageIcon(filepath);
       Image ic2=ic1.getImage();
       Image ic3=ic2.getScaledInstance(this.holder.getWidth(),this.holder.getHeight(),Image.SCALE_SMOOTH);
       ImageIcon ic4=new ImageIcon(ic3);
       this.holder.setIcon(ic4);
       isChanged=true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Home_page hp1=new Home_page();
        hp1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
      this.setState(JFrame.ICONIFIED); 
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        HomePage2 hp1= new HomePage2();
        this.dispose();
        hp1.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Webcam_cap wcp=new Webcam_cap();
       wcp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.status.removeAllItems();
        this.status.addItem("Select");
        this.status.addItem("Admin");
        this.status.addItem("Staff");
    }//GEN-LAST:event_formWindowOpened
    public void add2table(){
        try {
            sql="SELECT firstname,othernames,email,phone,gender,status,username,photo FROM admin_details";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            this.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            int rc=this.jTable1.getRowCount();
            this.rows.setText(String.valueOf(rc));
        } catch (SQLException ex) {
            Logger.getLogger(Admin_reg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.firstname.setText("");
        this.othernames.setText("");
        this.email.setText("");
        this.phone.setText("");
        this.gender.clearSelection();
        this.password.setText("");
        this.c_password.setText("");
        this.status.setSelectedIndex(0);
        this.username.setText("");
        holder.setIcon(setDefaultPicture());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void show_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_passwordMouseClicked
     if(this.show_password.isSelected()==true){
          this.password.setEchoChar((char)0);
      }
     else{
          this.password.setEchoChar('*');
        } 

    }//GEN-LAST:event_show_passwordMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int row =this.jTable1.getSelectedRow();
            String first_=this.jTable1.getValueAt(row,0).toString();
            this.firstname.setText(first_);
            String other_=this.jTable1.getValueAt(row,1).toString();
            this.othernames.setText(other_);
            String em=this.jTable1.getValueAt(row,2).toString();
            this.email.setText(em);
            String phone_=this.jTable1.getValueAt(row,3).toString();
            this.phone.setText(phone_);
            String gen=this.jTable1.getValueAt(row,4).toString();
            if(gen.equals("m")){
                this.male.setSelected(true);
                
            }
            else{
                this.female.setSelected(true);
            }
            String stat=this.jTable1.getValueAt(row,5).toString();
            this.status.setSelectedItem(stat);
            String user_=this.jTable1.getValueAt(row,6).toString();
            this.username.setText(user_);
            sql="SELECT photo,password from admin_details where username=?";
            ps=con.prepareStatement(sql);
            ps.setString(1,user_);
            rs=ps.executeQuery();
            if(rs.next()){
            byte[] dbpass=rs.getBytes("photo");
            String pw=rs.getString("password");
            this.password.setText(pw);
            this.c_password.setText(pw);
            ImageIcon iicn=new ImageIcon(dbpass);
            Image img=iicn.getImage().getScaledInstance(holder.getWidth(),holder.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon iicn2=new ImageIcon(img);
            holder.setIcon(iicn2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin_reg.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Admin_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField c_password;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstname;
    private javax.swing.ButtonGroup gender;
    public static javax.swing.JLabel holder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField othernames;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel rows;
    private javax.swing.JCheckBox show_password;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
