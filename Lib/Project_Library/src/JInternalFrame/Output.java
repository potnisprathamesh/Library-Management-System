/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JInternalFrame;

import java.awt.Dimension;
import java.awt.ScrollPane;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pratham
 */
public class Output extends javax.swing.JInternalFrame {
DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form Output
     */
    public Output() {
        initComponents();
    }
    public Output (String g)
    {
        initComponents();
        jTable1 = new JTable();
         jTable1.setModel(model);
    }
    
    public void display(ResultSet rs) {
   
        model= new DefaultTableModel();
        
        try
        {
        ResultSetMetaData rsmd = rs.getMetaData();
        String[] col_name = new String[rsmd.getColumnCount()];
        for(int i=1; i<=col_name.length;i++)
        {
        col_name[i-1] =rsmd.getColumnLabel(i);
        System.out.println(col_name[i-1]);
        }
         model.setColumnIdentifiers(col_name);
    
        while (rs.next()) 
        { 
            String[] rowData = new String[rsmd.getColumnCount()];
            for (int i = 1; i <= rsmd.getColumnCount(); i++)
            {
                rowData[i - 1] = rs.getString(i); 
            }
           model.addRow(rowData);
           
          
            
        }
        System.out.println(rsmd.getColumnCount());
        
        jTable1.setModel(model);
        JFrame a=new JFrame();
        a.add(new JScrollPane(jTable1));
        a.setBounds(200,100,800,800);
        a.show();
      
        
        
        }
        catch(SQLException e){
        }
        
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setNormalBounds(new java.awt.Rectangle(10, 150, 300, 200));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
