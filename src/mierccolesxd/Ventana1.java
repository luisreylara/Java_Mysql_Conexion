
package mierccolesxd;

import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Ventana1 extends javax.swing.JFrame {

   
    public Ventana1() throws SQLException  {
        initComponents();
        mostrardatos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfid = new javax.swing.JTextField();
        tfedad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnagregar = new javax.swing.JButton();

        tfid.setEditable(false);
        tfid.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N

        tfedad.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel2.setText("Edad:");

        btnactualizar.setBackground(new java.awt.Color(153, 153, 255));
        btnactualizar.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(255, 153, 51));
        btnsalir.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnborrar.setBackground(new java.awt.Color(204, 102, 255));
        btnborrar.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        btnborrar.setText("Borrar");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btnmostrar.setBackground(new java.awt.Color(0, 204, 204));
        btnmostrar.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        btnmostrar.setText("Mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        jLabel3.setText("Id:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Bradley Hand ITC", 0, 18)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel1.setText("rfid");

        btnagregar.setBackground(new java.awt.Color(204, 255, 0));
        btnagregar.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(335, 335, 335)
                .addComponent(btnagregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                java.sql.Statement stmt;
                java.sql.ResultSet rs;
    
    public void mostrardatos () {

                Conexion con = new Conexion();
                con.conectar();
               
                 
                try {
                    stmt = con.cx.createStatement();         
                  String sql="select * from usuarios";
                  
                    System.out.println(sql);
                    rs = stmt.executeQuery(sql);
                    DefaultTableModel modelo = new DefaultTableModel();
                    modelo.addColumn("USUARIO");
                    modelo.addColumn("CONTRASE??A");
                    
                    String filas [] = new String[2];

                     while(rs.next()==true){                
                       filas [0]=rs.getString("usuario");
                       filas [1]=rs.getString("pwd");
                     

                       modelo.addRow(filas);
                    }    
                     jTable1.setModel(modelo);
                     
                     con.desconectar();
                } catch (SQLException ex) {
                    Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
                }
     
    }
    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
          Conexion con = new Conexion();
          con.conectar();
          java.sql.Statement stmt;
          java.sql.ResultSet rs;
             
          try {
            
            stmt = con.cx.createStatement();
           
            String query="";
            query="insert into bitacora (rfid) values (";
         //   query = query+"'"+tfnombre.getText().toString()+"'";
            
            query = query+")";
           
            System.out.println(query);

            stmt.executeUpdate(query);
            mostrardatos();
          
        } catch (SQLException ex) {
              System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        // TODO add your handling code here:
        dispose();
        Ventana2 miventanados =new Ventana2();
        miventanados.setVisible(true);
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        
        Connection con;
             java.sql.ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://129.213.117.192:3306/admin_default","admin_default","121212");

            java.sql.Statement stmt;
            stmt = con.createStatement();
           
           
            String query="";
       //     query="UPDATE contactos set nombre='" +tfnombre.getText().toString() +"',edad='" +tfedad.getText().toString() + "' WHERE id=" +tfid.getText().toString();
           
            System.out.println(query);

            stmt.executeUpdate(query);
           //  JOptionPane.showMessageDialog(null, "se ejecuto insert, revise!!!");

         //JOptionPane.showMessageDialog(null, "se agrego un nuevo contacto");
          mostrardatos();
          
        } catch (SQLException ex) {
            Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        // TODO add your handling code here:
        mostrardatos();
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row=jTable1.getSelectedRow();
        tfid.setText(jTable1.getValueAt(row, 0).toString());
     //   tfnombre.setText(jTable1.getValueAt(row, 1).toString());
        tfedad.setText(jTable1.getValueAt(row, 2).toString()); 
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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Ventana1().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Ventana1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfedad;
    private javax.swing.JTextField tfid;
    // End of variables declaration//GEN-END:variables
}
