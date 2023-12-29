//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package interfaz;
import dominio.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class VentanaDrones extends javax.swing.JFrame implements Observer {
    public VentanaDrones(Sistema s) {
        initComponents();
        modelo = s;
        agregarEnTabla();
        modelo.addObserver(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelArticulo = new javax.swing.JPanel();
        identificacion = new javax.swing.JLabel();
        modeloEtiqueta = new javax.swing.JLabel();
        identificacionDron = new javax.swing.JTextField();
        modeloDron = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDrones = new javax.swing.JTable();
        tipoDeCamara = new javax.swing.JLabel();
        tipoDeCamaraDron = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dron");
        setResizable(false);

        identificacion.setText("Identificacion :");

        modeloEtiqueta.setText("Modelo :");

        identificacionDron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacionDronActionPerformed(evt);
            }
        });

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        tablaDrones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Modelo", "Tipo de Camara"
            }
        ));
        jScrollPane1.setViewportView(tablaDrones);

        tipoDeCamara.setText("Tipo de camara :");

        tipoDeCamaraDron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDeCamaraDronActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelArticuloLayout = new javax.swing.GroupLayout(panelArticulo);
        panelArticulo.setLayout(panelArticuloLayout);
        panelArticuloLayout.setHorizontalGroup(
            panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArticuloLayout.createSequentialGroup()
                .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelArticuloLayout.createSequentialGroup()
                        .addGap(30, 216, Short.MAX_VALUE)
                        .addComponent(botonAgregar))
                    .addGroup(panelArticuloLayout.createSequentialGroup()
                        .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelArticuloLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelArticuloLayout.createSequentialGroup()
                                        .addComponent(identificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(panelArticuloLayout.createSequentialGroup()
                                        .addComponent(tipoDeCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArticuloLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modeloEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoDeCamaraDron)
                            .addComponent(modeloDron, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(identificacionDron))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelArticuloLayout.setVerticalGroup(
            panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArticuloLayout.createSequentialGroup()
                .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelArticuloLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(identificacion)
                            .addComponent(identificacionDron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modeloDron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modeloEtiqueta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipoDeCamara)
                            .addComponent(tipoDeCamaraDron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(botonAgregar))
                    .addGroup(panelArticuloLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void identificacionDronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacionDronActionPerformed
    }//GEN-LAST:event_identificacionDronActionPerformed
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if(modelo.numeroValido(tipoDeCamaraDron.getText())){
            int nroCamara = Integer. parseInt(tipoDeCamaraDron.getText());
            if(modelo.camaraValida(nroCamara)){
                Dron d = new Dron(identificacionDron.getText(),modeloDron.getText(),nroCamara);
                if(!modelo.getDrones().contains(d)){
                    modelo.agregarDron(d);
                    agregarEnTabla();
                    tipoDeCamaraDron.setText("");
                    identificacionDron.setText("");
                    modeloDron.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null,"No se agrego Dron","Identificacion Repetida",JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"No se agrego Dron","Tipo de Camara en un rango de (1-6)",JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"No se agrego Dron","Hay numero invalido",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed
    private void tipoDeCamaraDronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDeCamaraDronActionPerformed
    }//GEN-LAST:event_tipoDeCamaraDronActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JLabel identificacion;
    private javax.swing.JTextField identificacionDron;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modeloDron;
    private javax.swing.JLabel modeloEtiqueta;
    private javax.swing.JPanel panelArticulo;
    private javax.swing.JTable tablaDrones;
    private javax.swing.JLabel tipoDeCamara;
    private javax.swing.JTextField tipoDeCamaraDron;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    public void agregarEnTabla(){
        ArrayList<Dron> listaDrones = modelo.getDrones();
        ((DefaultTableModel)tablaDrones.getModel()).setRowCount(0);
        for (Dron d : listaDrones) {
            Object [] drones = {d.getIdentificacion(),d.getModelo(),d.getCamara()};
            ((DefaultTableModel)tablaDrones.getModel()).addRow(drones);
        }
    }
    @Override
    public void update(Observable o, Object arg) {
        agregarEnTabla();
    }
}
