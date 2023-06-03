/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author ignac
 */
public class LibrosList extends javax.swing.JFrame {

    LibrosList librosList;
    LibrosAdd librosAdd;
    
    EmpleadosAdd empleadosAdd;
    EmpleadosList empleadosList;
    
    ServiciosAdd serviciosAdd;
    ServiciosList serviciosList;
    
    SolicitudesList solicitudesList;
    SolicitudesAdd solicitudesAdd;
    
    DespachosList despachosList;
    
    public LibrosList() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtHeading = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        inputSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuWorkers = new javax.swing.JMenu();
        btnListWorkers = new javax.swing.JMenuItem();
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

        jTable1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Categoria", "Stock", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtHeading.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        txtHeading.setForeground(new java.awt.Color(0, 0, 153));
        txtHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHeading.setText("Libros");

        btnEdit.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btnEdit.setText("Editar");

        btnDelete.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btnDelete.setText("Eliminar");

        inputSearch.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btnSearch.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(txtHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txtHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        MenuWorkers.setText("Empleados");

        btnListWorkers.setText("Lista");
        btnListWorkers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListWorkersActionPerformed(evt);
            }
        });
        MenuWorkers.add(btnListWorkers);

        btnAddWorkers.setText("Agregar");
        btnAddWorkers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWorkersActionPerformed(evt);
            }
        });
        MenuWorkers.add(btnAddWorkers);

        jMenuBar1.add(MenuWorkers);

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

        jMenuBar1.add(MenuBooks);

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

        jMenuBar1.add(MenuServices);

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

        jMenuBar1.add(MenuRequest);

        MenuDispacth.setText("Despacho");

        btnListDispacht.setText("Lista");
        btnListDispacht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListDispachtActionPerformed(evt);
            }
        });
        MenuDispacth.add(btnListDispacht);

        jMenuBar1.add(MenuDispacth);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListWorkersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListWorkersActionPerformed
        empleadosList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListWorkersActionPerformed

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
            java.util.logging.Logger.getLogger(LibrosList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrosList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrosList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrosList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrosList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuBooks;
    private javax.swing.JMenu MenuDispacth;
    private javax.swing.JMenu MenuRequest;
    private javax.swing.JMenu MenuServices;
    private javax.swing.JMenu MenuWorkers;
    private javax.swing.JMenuItem btnAddBooks;
    private javax.swing.JMenuItem btnAddRequest;
    private javax.swing.JMenuItem btnAddServices;
    private javax.swing.JMenuItem btnAddWorkers;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JMenuItem btnListBooks;
    private javax.swing.JMenuItem btnListDispacht;
    private javax.swing.JMenuItem btnListRequest;
    private javax.swing.JMenuItem btnListServices;
    private javax.swing.JMenuItem btnListWorkers;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtHeading;
    // End of variables declaration//GEN-END:variables
}
