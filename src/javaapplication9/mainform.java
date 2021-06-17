/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication9;


import java.sql.Connection;
//import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.sql.ResultSet; 
import javax.swing.BorderFactory;
public class mainform extends javax.swing.JFrame {

  
    public mainform() {
        initComponents();
         this.setLocationRelativeTo(null);
         delete.setEnabled(false);
         //border
         
         this.studentID.setBorder(BorderFactory.createCompoundBorder(this.studentID.getBorder(),BorderFactory.createEmptyBorder(0,5,0,0)));
          this.fname.setBorder(BorderFactory.createCompoundBorder(this.fname.getBorder(),BorderFactory.createEmptyBorder(0,5,0,0)));
           this.lname.setBorder(BorderFactory.createCompoundBorder(this.lname.getBorder(),BorderFactory.createEmptyBorder(0,5,0,0)));
            this.address.setBorder(BorderFactory.createCompoundBorder(this.address.getBorder(),BorderFactory.createEmptyBorder(0,5,0,0)));
             this.program.setBorder(BorderFactory.createCompoundBorder(this.program.getBorder(),BorderFactory.createEmptyBorder(0,5,0,0)));
              this.maritalstatus.setBorder(BorderFactory.createCompoundBorder(this.maritalstatus.getBorder(),BorderFactory.createEmptyBorder(0,5,0,0)));
               this.country.setBorder(BorderFactory.createCompoundBorder(this.country.getBorder(),BorderFactory.createEmptyBorder(0,5,0,0)));
             
        update();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        studentID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        program = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        country = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        maritalstatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(215, 16, 46));

        add.setText("Add New Student Data");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        studentID.setBackground(new java.awt.Color(246, 201, 108));
        studentID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        studentID.setForeground(new java.awt.Color(0, 0, 0));
        studentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                studentIDKeyTyped(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student ID:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");

        fname.setBackground(new java.awt.Color(246, 201, 108));
        fname.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name");

        lname.setBackground(new java.awt.Color(246, 201, 108));
        lname.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        address.setBackground(new java.awt.Color(246, 201, 108));
        address.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Department");

        program.setBackground(new java.awt.Color(246, 201, 108));
        program.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Country");

        country.setBackground(new java.awt.Color(246, 201, 108));
        country.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jTable1.setBackground(new java.awt.Color(246, 201, 108));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Address", "Department", "Gender", "Country"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Student Profile");

        maritalstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(34, 34, 34)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jPanel1Layout.createSequentialGroup()
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(fname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(jPanel1Layout.createSequentialGroup()
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(29, 29, 29)
                            .add(address, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(29, 29, 29)
                        .add(studentID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(lname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(28, 28, 28)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(jPanel1Layout.createSequentialGroup()
                            .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(66, 66, 66))
                        .add(jPanel1Layout.createSequentialGroup()
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(60, 60, 60)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(60, 60, 60)))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(country, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(program, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .add(maritalstatus, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 167, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(add, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .add(delete, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(79, 79, 79))
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1)
                .addContainerGap())
            .add(jLabel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(17, 17, 17)
                .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(37, 37, 37)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(122, 213, Short.MAX_VALUE)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 373, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(19, 19, 19))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(studentID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(program, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(18, 18, 18)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(fname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(18, 18, 18)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                            .add(lname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(18, 18, 18)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                            .add(address, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                            .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(maritalstatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(18, 18, 18)
                                        .add(country, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(add, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(delete, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        public void update(){
        
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
              PreparedStatement pst=con.prepareStatement("select *from schooldatabase");
              
              ResultSet rs = pst.executeQuery();
              ResultSetMetaData stData = rs.getMetaData();
              int q =stData.getColumnCount();
              DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
              RecordTable.setRowCount(0);
            
              while(rs.next())
              {
                  Vector columnData= new Vector();
                  for ( int x=1; x<=q; x++)
                  {
                    
                     columnData.add(rs.getString("studentid"));
                      columnData.add(rs.getString("firstname"));
                      columnData.add(rs.getString("lastname"));
                      columnData.add(rs.getString("address"));
                      columnData.add(rs.getString("program"));
                       columnData.add(rs.getString("maritalstatus"));
                        columnData.add(rs.getString("country"));
                       
                  } 
                  RecordTable.addRow(columnData);
              }
       
        } 
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       
        // DELETE ITEMS
       DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
       int SelectRows = jTable1.getSelectedRow();
       try
       {
           int id = Integer.parseInt(RecordTable.getValueAt(SelectRows,0).toString());
          
           var deleteItem =JOptionPane.showConfirmDialog(null,"Confirm if you want to delete item ","Warning",JOptionPane.YES_NO_OPTION);
           if(deleteItem == JOptionPane.YES_OPTION)
           {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
                PreparedStatement pst=  con.prepareStatement("delete from schooldatabase where studentID=?");
                pst.setInt(1,id);
                pst.executeUpdate();
              //  JOptionPane.showMessageDiaolog(this,"record updated");
                update();
                 delete.setEnabled(false);
                studentID.setText("");
                fname.setText("");
                lname.setText("");
                address.setText("");
                program.setText("");
//                maritalstatus.setText("");
                country.setText("");
           }
       }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
     
        //insert database
        if (add.getText()== "Add New Student Data")
     {
                 if (studentID.getText().trim().isEmpty() || fname.getText().trim().isEmpty() || lname.getText().trim().isEmpty()|| address.getText().trim().isEmpty() || program.getText().trim().isEmpty() || country.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(this,"Fill Up All The Fields "); 

                        }
         
                else
                     {
                                     try{
                             Class.forName("com.mysql.cj.jdbc.Driver");
                             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");

                             var student_id =studentID.getText();                 

                             PreparedStatement pst=con.prepareStatement("select *from schooldatabase where studentid='"+ student_id  +"'");
                               ResultSet rs = pst.executeQuery();

                             if(rs.next()==true)
                             {
                                 JOptionPane.showMessageDialog(null,"ID already exist!");
                             }
                             else
                             {
                                  Class.forName("com.mysql.cj.jdbc.Driver");
           
                                     PreparedStatement pst2= con.prepareStatement("insert into schooldatabase(studentid,firstname,lastname,address,program,maritalstatus,country) value(?,?,?,?,?,?,?)");

                                     pst2.setString(1,studentID.getText());
                                     pst2.setString(2,fname.getText());
                                     pst2.setString(3,lname.getText());
                                     pst2.setString(4,address.getText());
                                     pst2.setString(5,program.getText());
                                   pst2.setString(6,maritalstatus.getSelectedItem().toString());
                                     pst2.setString(7,country.getText());

                                    pst2.executeUpdate();
                                    JOptionPane.showMessageDialog(this,"Record added"); 
                                    update();  
                                    studentID.setText("");
                                    fname.setText("");
                                    lname.setText("");
                                    address.setText("");
                                    program.setText("");
//                                    maritalstatus.setText("");
                                    country.setText("");
                                    studentID.requestFocus();
                                    add.setText("Add New Student Data");
                                    delete.setEnabled(false);

                             }                     
                        }
                           catch(Exception e)
                                {
                                    JOptionPane.showMessageDialog(null,e);
                                }         
                 }
     }
     ////update database
     else
     {
          DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel(); 
     int SelectedRows  = jTable1.getSelectedRow();        
     var id =(RecordTable.getValueAt(SelectedRows,0 ).toString());
     var stock =(RecordTable.getValueAt(SelectedRows,3 ).toString());
     
        try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
                 PreparedStatement pst= con.prepareStatement("update schooldatabase set firstname=?,lastname=?,address=?,program=?,maritalstatus=?,country=? where studentid ='"+ id +"' ");

                           pst.setString(1,fname.getText()); 
                           pst.setString(2,lname.getText());     
                           pst.setString(3,address.getText());     
                           pst.setString(4,program.getText());     
                   pst.setString(5,maritalstatus.getSelectedItem().toString());
                           pst.setString(6,country.getText());  
                         
                           pst.executeUpdate();
                           JOptionPane.showMessageDialog(this,"Updated data"); 
                           update();
                           add.setText("Add New Student Data");
                           // clear textfield
                            studentID.setText("");
                            fname.setText("");
                            lname.setText("");
                            address.setText("");
                            program.setText("");
//                            maritalstatus.setText("");
                            country.setText("");
                          studentID.requestFocus();
                        
            }
               catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,e);
                    }
     }         
            
    }//GEN-LAST:event_addActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        delete.setEnabled(false);
        studentID.setText("");
        fname.setText("");
        lname.setText("");
        address.setText("");
        program.setText("");
//        maritalstatus.setText("");
        country.setText("");
         add.setText("Add New Student Data");
       studentID.requestFocus();
       update();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       delete.setEnabled(true);
        add.setText("Update Student Data");
     DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel(); 
     int SelectedRows  = jTable1.getSelectedRow();
     
      studentID.setText(RecordTable.getValueAt(SelectedRows,0 ).toString());
     fname.setText(RecordTable.getValueAt(SelectedRows,1 ).toString());
     lname.setText(RecordTable.getValueAt(SelectedRows,2 ).toString());
      address.setText(RecordTable.getValueAt(SelectedRows,3 ).toString());
    program.setText(RecordTable.getValueAt(SelectedRows,4 ).toString());
     String sex =RecordTable.getValueAt(SelectedRows,5 ).toString();
     switch(sex){
     case"Male":
         maritalstatus.setSelectedIndex(0);
         break;
     case"Female":
         maritalstatus.setSelectedIndex(1);
         break;
     }
      country.setText(RecordTable.getValueAt(SelectedRows,6 ).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void studentIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentIDKeyTyped
       char c = evt.getKeyChar();
     char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_studentIDKeyTyped

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
            java.util.logging.Logger.getLogger(mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JTextField country;
    private javax.swing.JButton delete;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lname;
    private javax.swing.JComboBox<String> maritalstatus;
    private javax.swing.JTextField program;
    private javax.swing.JTextField studentID;
    // End of variables declaration//GEN-END:variables

}
