/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JInternalFrame;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Pratham
 */
public class Loans extends javax.swing.JInternalFrame {
public static PreparedStatement Stmt = null;
public static PreparedStatement Stmt1 = null;
    /**
     * Creates new form Loans
     */
    public Loans() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbookid = new javax.swing.JLabel();
        lcardno = new javax.swing.JLabel();
        lbranchid = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        lcheckout = new javax.swing.JButton();
        lreset = new javax.swing.JButton();
        lbookid2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        lcardno2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        lbranchid2 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        lreset2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(200, 250));
        setNormalBounds(new java.awt.Rectangle(0, 0, 200, 200));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Check Out");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Check In");

        lbookid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbookid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbookid.setText("Book ID: *");

        lcardno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lcardno.setText("Card No: *");

        lbranchid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbranchid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbranchid.setText("Branch ID: *");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        lcheckout.setText("Check Out");
        lcheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcheckoutActionPerformed(evt);
            }
        });

        lreset.setText("Reset");
        lreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lresetActionPerformed(evt);
            }
        });

        lbookid2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbookid2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbookid2.setText("Book ID:");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        lcardno2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lcardno2.setText("Card No:");

        lbranchid2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbranchid2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbranchid2.setText("Name of Borrower :");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        lreset2.setText("Reset");
        lreset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lreset2ActionPerformed(evt);
            }
        });

        Table1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table1);

        jButton1.setText("Check In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel3.setText("* denotes Required Field");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(157, 157, 157)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbranchid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbookid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lcardno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField2)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbranchid2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lcardno2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbookid2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField6)
                    .addComponent(jTextField5)
                    .addComponent(jTextField4))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lreset, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lcheckout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lreset2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbookid2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                .addComponent(lbookid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(lbranchid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbranchid2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lcardno2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lcardno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lreset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lreset2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 187, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed
public static String bk_id,br_id,cd_no,b_name;
int count = 0;
//Check-Out
    private void lcheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcheckoutActionPerformed
        try
        {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/library","root","Pratham@88");
         bk_id = jTextField2.getText();
         br_id = jTextField1.getText();
         cd_no = jTextField3.getText();
          if(bk_id.equals("") || br_id.equals("") || cd_no.equals(""))
         {
             JFrame frame = new JFrame();
             JOptionPane.showMessageDialog(frame,"Enter All The Value");
         }  
          else if(bk_id!="" && br_id !="" && cd_no !="")
         {
         Stmt= con.prepareStatement("Select count(bo.card_no) from borrowers bo where bo.card_no ='"+cd_no+"'");
         ResultSet rs = Stmt.executeQuery();
         rs.next();    
        Stmt= con.prepareStatement("Select (bc.No_Of_Copies-(Count(bl.book_id))) As Available_Copies from book_loans bl, book_copies bc where bl.book_id= '"+bk_id+"' AND bl.book_id=bc.book_id AND bl.branch_id=bc.branch_id AND bl.branch_id='"+br_id+"'");
         ResultSet rs1 = Stmt.executeQuery();
        rs1.next();
         Stmt= con.prepareStatement("Select count(card_no) from book_loans where card_no ='"+cd_no+"'AND date_in <=> null");
         ResultSet rs2 = Stmt.executeQuery();
         rs2.next();
         Stmt= con.prepareStatement("Select count(b.book_id) from book b where book_id ='"+bk_id+"'");
         ResultSet rs3 = Stmt.executeQuery();
         rs3.next();
         Stmt= con.prepareStatement("Select count(branch_id) from library_branch where branch_id ='"+br_id+"'");
         ResultSet rs4 = Stmt.executeQuery();
         rs4.next();
         Stmt= con.prepareStatement("Select count(card_no) from book_loans where branch_id ='"+br_id+"' AND book_id = '"+bk_id+"' AND card_no = "+cd_no+" AND date_in is null");
         ResultSet rs5 = Stmt.executeQuery();
         rs5.next();
         System.out.println(rs1.getInt("Available_Copies"));
         if (rs3.getInt("count(b.book_id)")== 0)
                        {
                            JFrame frame = new JFrame();
                            JOptionPane.showMessageDialog(frame,"Invalid Book ID");
                        } 
           else if (rs4.getInt("count(branch_id)")== 0)
                        {
                            JFrame frame = new JFrame();
                            JOptionPane.showMessageDialog(frame,"Invalid Branch_id");
                        }
           else if   (rs.getInt("count(bo.card_no)")== 0)
                        {
                            JFrame frame = new JFrame();
                            JOptionPane.showMessageDialog(frame,"Card Number Not Found");
                        } 
                    
           else if (rs2.getInt("count(card_no)")== 3)
                        {
                            JFrame frame = new JFrame();
                            JOptionPane.showMessageDialog(frame,"Already has 3 Books");
                        } 
           else if (rs1.getInt("Available_Copies")== 0)
                        {
                            JFrame frame = new JFrame();
                            JOptionPane.showMessageDialog(frame,"Book Copy Not Available");
                        } 
           else if (rs5.getInt("Count(card_no)")==1)
                        {
                            JFrame frame = new JFrame();
                            JOptionPane.showMessageDialog(frame,"Same Book Already Issued to This Borrower");
                        } 
          
           else 
           {
               System.out.println("sdfsjn");
               Stmt = con.prepareStatement("Insert into book_loans (book_id,branch_id,card_no,Date_out,Date_due,Date_in) values ('"+bk_id+"','"+br_id+"','"+cd_no+"',curdate(),date_add(curdate(),Interval 14 day),NULL)");
               Stmt.executeUpdate();
         }
         }
         
         

        }
        
         catch(Exception e){
        e.printStackTrace();
        }
    }//GEN-LAST:event_lcheckoutActionPerformed

    private void lresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lresetActionPerformed
         
         jTextField2.setText("");
         jTextField1.setText("");
         jTextField3.setText("");
    }//GEN-LAST:event_lresetActionPerformed

    private void lreset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lreset2ActionPerformed
         jTextField4.setText("");
         jTextField6.setText("");
         jTextField5.setText("");
    }//GEN-LAST:event_lreset2ActionPerformed
//Check-In
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try
        {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/library","root","Pratham@88");
         bk_id= jTextField4.getText();
         b_name= jTextField6.getText();
         cd_no = jTextField5.getText();
         System.out.println(bk_id);
         System.out.println(b_name);
         System.out.println(cd_no);
         
         if(bk_id.equals("") && b_name.equals("") && cd_no.equals(""))
         {
             JFrame frame = new JFrame();
             JOptionPane.showMessageDialog(frame,"Enter At Least One Value");
         }
         else 
         {
          Stmt= con.prepareStatement("Select bl.book_id,bl.branch_id,bl.card_no,bl.date_out,bl.date_due,bl.date_in,bo.fname,bo.lname from book_loans bl, borrowers bo where bl.book_id like '%"+bk_id+"%' AND bl.card_no like '%"+cd_no+"%' AND (bo.fname like '%"+b_name+"%' OR bo.lname like '%"+b_name+"%')AND bl.card_no=bo.card_no  AND bl.date_in is null Group by bl.branch_id,bl.card_no,bl.book_id order by loan_id");
          System.out.println("Wow");
          ResultSet rs = Stmt.executeQuery();
       /* op o=new op("njk");
          o.display(rs);*/
          ResultSetMetaData rsmd=rs.getMetaData();
          int columns = rsmd.getColumnCount();
           DefaultTableModel model = new DefaultTableModel();
           Vector columnname= new Vector();
           Vector datarows = new Vector ();
                               
                               for(int i=1;i<=columns;i++){
                                           columnname.addElement(rsmd.getColumnName(i));                           
                                  }
                               model.setColumnIdentifiers(columnname);
                               
                               while(rs.next()){
                                      datarows = new Vector();
                                      for(int j=1; j<= columns;j++){
                                             datarows.addElement(rs.getString(j));
                                         }        
                                      model.addRow(datarows);
                                      Table1.setModel(model);          
          
          
                
         }
         }
        }
          catch(Exception e)
              
       {
        e.printStackTrace();
        }
    }//GEN-LAST:event_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
            
           
                        int[] tablerows = Table1.getSelectedRows();
                        int rowslength=tablerows.length;
                        if(rowslength ==0)  
                        {
                           
                            JFrame frame =new JFrame();
                            JOptionPane.showMessageDialog(frame,"Select atleast one entry");  
                         }
                        
                        else
                        {
                            
                        Object bk;
                        Object br;
                        Object cd;
                        
                        
                        
              try{
                  
                  // Create a connection to the local MySQL server, with the "library" database selected.
                        Connection con;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Pratham@88");
                      
                        
                                        
                        for(int i=0;i<rowslength;i++){
                            
                         bk=Table1.getValueAt(tablerows[i], 0);
                         br=Table1.getValueAt(tablerows[i],1);
                         cd=Table1.getValueAt(tablerows[i],2);
                         Stmt = con.prepareStatement ("Update book_loans Set Date_in = curdate() where book_id = '"+bk+"' AND branch_id='"+br+"' AND card_no='"+cd+"' ");
                         Stmt.executeUpdate();
               /*          Stmt = con.prepareStatement ("Select (bc.No_Of_Copies-(Count(bl.book_id))) As Available_Copies from book bk, book_authors ba, book_copies bc, book_loans bl where bk.book_id like '%"+bk+"%' AND bk.book_id=ba.book_id AND bk.book_id=bc.book_id AND bk.book_id=bl.book_id AND bl.branch_id = "+br+" AND bc.branch_id=bl.branch_id AND bl.date_in <=> null Group By bc.branch_id, bk.book_id");
                         Stmt.executeUpdate();*/
                        
    }//GEN-LAST:event_jButton1ActionPerformed
  }
              catch(Exception e)
              {
                  
                e.printStackTrace();
        
              }
         }
    }                  
              
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lbookid;
    private javax.swing.JLabel lbookid2;
    private javax.swing.JLabel lbranchid;
    private javax.swing.JLabel lbranchid2;
    private javax.swing.JLabel lcardno;
    private javax.swing.JLabel lcardno2;
    private javax.swing.JButton lcheckout;
    private javax.swing.JButton lreset;
    private javax.swing.JButton lreset2;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
