package edoo_s8_Pilas_Arreglos;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author LUCANO
 */
public class Frm_Pila_Arreglos extends javax.swing.JFrame {

    
    DefaultListModel modelo = new DefaultListModel();
    Pila p = new Pila();
    
    public Frm_Pila_Arreglos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDatos = new javax.swing.JTextField();
        btnPush = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnIsEmpty = new javax.swing.JButton();
        btnPeek = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstModel = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar dato:"));

        btnPush.setText("Ingresar");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });

        btnPop.setText("Eliminar último elemento ingresado");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });

        btnClear.setText("Limpiar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnIsEmpty.setText("¿La Lista está vacía?");
        btnIsEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIsEmptyActionPerformed(evt);
            }
        });

        btnPeek.setText("Mostrar elemento de la cima");
        btnPeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeekActionPerformed(evt);
            }
        });

        lstModel.setModel(modelo);
        jScrollPane1.setViewportView(lstModel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(txtDatos))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIsEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPeek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPush, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPush, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIsEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        String dato = txtDatos.getText().trim();
        if (!dato.isEmpty()) {
            if (p.push(dato)) { 
                p.mostrar(modelo);
                txtDatos.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "La pila está llena, no se puede agregar más elementos.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un dato.");
        }
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        p.clear();
        p.mostrar(modelo);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        if(!p.isEmpty()){
            p.pop();
            p.mostrar(modelo);
        }
        else
            JOptionPane.showMessageDialog(null, "La pila está vacía"); 
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnPeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeekActionPerformed
        if(!p.isEmpty())
            JOptionPane.showMessageDialog(null, "Último elemento: "+p.top());
        else
            JOptionPane.showMessageDialog(null, "La pila está vacía");
    }//GEN-LAST:event_btnPeekActionPerformed

    private void btnIsEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIsEmptyActionPerformed
        if(!p.isEmpty())
            JOptionPane.showMessageDialog(null, "La pila NO está vacía");
        else
            JOptionPane.showMessageDialog(null, "La pila está vacía");
    }//GEN-LAST:event_btnIsEmptyActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnIsEmpty;
    private javax.swing.JButton btnPeek;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstModel;
    private javax.swing.JTextField txtDatos;
    // End of variables declaration//GEN-END:variables
}
