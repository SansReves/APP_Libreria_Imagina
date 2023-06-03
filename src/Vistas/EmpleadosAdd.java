/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Clases.Empleado;
import DAO.EmpleadoDAO;

public class EmpleadosAdd extends javax.swing.JFrame {

    LibrosList librosList;
    LibrosAdd librosAdd;
    
    EmpleadosAdd empleadosAdd;
    EmpleadosList empleadosList;
    
    ServiciosAdd serviciosAdd;
    ServiciosList serviciosList;
    
    SolicitudesList solicitudesList;
    SolicitudesAdd solicitudesAdd;
    
    DespachosList despachosList;
    
    public EmpleadosAdd() {
        initComponents();
        empleadosAdd = new EmpleadosAdd();
        empleadosList = new EmpleadosList();
        
        librosList = new LibrosList();
        librosAdd = new LibrosAdd();
        
        serviciosAdd = new ServiciosAdd();
        serviciosList = new ServiciosList();
        
        solicitudesList = new SolicitudesList();
        solicitudesAdd = new SolicitudesAdd();
        
        despachosList = new DespachosList();
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtHeading = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        txtCharge = new javax.swing.JLabel();
        cbCharge = new javax.swing.JComboBox<>();
        txtRut = new javax.swing.JLabel();
        inputRut = new javax.swing.JTextField();
        txtEmail = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtLastName = new javax.swing.JLabel();
        inputLastName = new javax.swing.JTextField();
        btnClean = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        MenuWorkers1 = new javax.swing.JMenu();
        btnListWorkers1 = new javax.swing.JMenuItem();
        btnAddWorkers = new javax.swing.JMenuItem();
        MenuBooks = new javax.swing.JMenu();
        btnListBooks = new javax.swing.JMenuItem();
        btnAddBooks = new javax.swing.JMenuItem();
        MenuServices = new javax.swing.JMenu();
        btnListServices = new javax.swing.JMenuItem();
        btnAddServices = new javax.swing.JMenuItem();
        MenuRequest = new javax.swing.JMenu();
        btnListRequest = new javax.swing.JMenuItem();
        btnAddRequest = new javax.swing.JMenuItem();
        MenuDispacth = new javax.swing.JMenu();
        btnListDispacht = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 252, 217));

        txtHeading.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        txtHeading.setForeground(new java.awt.Color(0, 0, 153));
        txtHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHeading.setText("Empleados");

        txtName.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtName.setText("Nombre:");

        inputName.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        txtCharge.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtCharge.setText("Cargo:");

        cbCharge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChargeActionPerformed(evt);
            }
        });

        txtRut.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtRut.setText("Rut:");

        inputRut.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtEmail.setText("Correo:");

        inputEmail.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtLastName.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtLastName.setText("Apellido Paterno:");

        inputLastName.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N

        btnClean.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btnClean.setText("Limpiar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(88, 88, 88)
                                .addComponent(btnClean))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(inputName)
                                .addComponent(inputLastName)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputRut)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(txtHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txtName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(txtRut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCharge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClean))
                .addGap(57, 57, 57))
        );

        MenuWorkers1.setText("Empleados");

        btnListWorkers1.setText("Lista");
        btnListWorkers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListWorkers1ActionPerformed(evt);
            }
        });
        MenuWorkers1.add(btnListWorkers1);

        btnAddWorkers.setText("Agregar");
        btnAddWorkers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWorkersActionPerformed(evt);
            }
        });
        MenuWorkers1.add(btnAddWorkers);

        jMenuBar2.add(MenuWorkers1);

        MenuBooks.setText("Libros");

        btnListBooks.setText("Lista");
        btnListBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListBooksActionPerformed(evt);
            }
        });
        MenuBooks.add(btnListBooks);

        btnAddBooks.setText("Agregar");
        btnAddBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBooksActionPerformed(evt);
            }
        });
        MenuBooks.add(btnAddBooks);

        jMenuBar2.add(MenuBooks);

        MenuServices.setText("Servicios");

        btnListServices.setText("Lista");
        btnListServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListServicesActionPerformed(evt);
            }
        });
        MenuServices.add(btnListServices);

        btnAddServices.setText("Agregar");
        btnAddServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddServicesActionPerformed(evt);
            }
        });
        MenuServices.add(btnAddServices);

        jMenuBar2.add(MenuServices);

        MenuRequest.setText("Solicitudes");

        btnListRequest.setText("Lista");
        btnListRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListRequestActionPerformed(evt);
            }
        });
        MenuRequest.add(btnListRequest);

        btnAddRequest.setText("Agregar");
        btnAddRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRequestActionPerformed(evt);
            }
        });
        MenuRequest.add(btnAddRequest);

        jMenuBar2.add(MenuRequest);

        MenuDispacth.setText("Despacho");

        btnListDispacht.setText("Lista");
        btnListDispacht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListDispachtActionPerformed(evt);
            }
        });
        MenuDispacth.add(btnListDispacht);

        jMenuBar2.add(MenuDispacth);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void cbChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChargeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        // para campo combo box usar: String cargo = cbCategory.getSelectedItem().ToString();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnListWorkers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListWorkers1ActionPerformed
        empleadosList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListWorkers1ActionPerformed

    private void btnAddWorkersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWorkersActionPerformed
        empleadosAdd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddWorkersActionPerformed

    private void btnListBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListBooksActionPerformed
        librosList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListBooksActionPerformed

    private void btnAddBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBooksActionPerformed
        librosAdd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddBooksActionPerformed

    private void btnListServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListServicesActionPerformed
        serviciosList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListServicesActionPerformed

    private void btnAddServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddServicesActionPerformed
        serviciosAdd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddServicesActionPerformed

    private void btnListRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListRequestActionPerformed
        serviciosList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListRequestActionPerformed

    private void btnAddRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRequestActionPerformed
        solicitudesAdd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddRequestActionPerformed

    private void btnListDispachtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListDispachtActionPerformed
        solicitudesList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListDispachtActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnCleanActionPerformed
    
    private void Limpiar(){
        inputName.setText("");
        inputEmail.setText("");
        inputLastName.setText("");
        inputRut.setText("");
   }
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
            java.util.logging.Logger.getLogger(EmpleadosAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadosAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadosAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadosAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadosAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuBooks;
    private javax.swing.JMenu MenuDispacth;
    private javax.swing.JMenu MenuRequest;
    private javax.swing.JMenu MenuServices;
    private javax.swing.JMenu MenuWorkers1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JMenuItem btnAddBooks;
    private javax.swing.JMenuItem btnAddRequest;
    private javax.swing.JMenuItem btnAddServices;
    private javax.swing.JMenuItem btnAddWorkers;
    private javax.swing.JButton btnClean;
    private javax.swing.JMenuItem btnListBooks;
    private javax.swing.JMenuItem btnListDispacht;
    private javax.swing.JMenuItem btnListRequest;
    private javax.swing.JMenuItem btnListServices;
    private javax.swing.JMenuItem btnListWorkers1;
    private javax.swing.JComboBox<String> cbCharge;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputLastName;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputRut;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCharge;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtHeading;
    private javax.swing.JLabel txtLastName;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtRut;
    // End of variables declaration//GEN-END:variables
}
