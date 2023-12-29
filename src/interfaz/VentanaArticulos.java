//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package interfaz;
import dominio.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class VentanaArticulos extends javax.swing.JFrame implements Observer{
    public VentanaArticulos(Sistema s) {
        initComponents();
        modelo = s;
        agregarEnTabla();
        modelo.addObserver(this); // para actualizar
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        panelArticulo = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();
        nombreArticulo = new javax.swing.JTextField();
        descripcionArticulo = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Articulo");
        setResizable(false);

        nombre.setText("Nombre :");

        descripcion.setText("Descripcion :");

        nombreArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreArticuloActionPerformed(evt);
            }
        });

        descripcionArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionArticuloActionPerformed(evt);
            }
        });

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descricpion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaArticulos);

        javax.swing.GroupLayout panelArticuloLayout = new javax.swing.GroupLayout(panelArticulo);
        panelArticulo.setLayout(panelArticuloLayout);
        panelArticuloLayout.setHorizontalGroup(
            panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArticuloLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAgregar)
                    .addGroup(panelArticuloLayout.createSequentialGroup()
                        .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcion))
                        .addGap(18, 18, 18)
                        .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreArticulo)
                            .addComponent(descripcionArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelArticuloLayout.setVerticalGroup(
            panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArticuloLayout.createSequentialGroup()
                .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelArticuloLayout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelArticuloLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre)
                            .addComponent(nombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descripcion)
                            .addComponent(descripcionArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAgregar)))
                .addGap(18, 18, 18))
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
            .addComponent(panelArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void nombreArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreArticuloActionPerformed
        
    }//GEN-LAST:event_nombreArticuloActionPerformed
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        Articulo a = new Articulo(nombreArticulo.getText(),descripcionArticulo.getText());
        if(!modelo.getArticulos().contains(a)){ // se fija que el nombre sea unico
            modelo.agregarArticulo(a);
            agregarEnTabla();
            nombreArticulo.setText("");
            descripcionArticulo.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null,"No se agrego Articulo","Nombre repetido",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed
    private void descripcionArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionArticuloActionPerformed
        
    }//GEN-LAST:event_descripcionArticuloActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JLabel descripcion;
    private javax.swing.JTextField descripcionArticulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreArticulo;
    private javax.swing.JPanel panelArticulo;
    private javax.swing.JTable tablaArticulos;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    public void agregarEnTabla(){
        ArrayList<Articulo> listaArticulos = modelo.getArticulos();
        ((DefaultTableModel)tablaArticulos.getModel()).setRowCount(0);
        for (Articulo a : listaArticulos) {
            Object [] articulos = {a.getNombre(), a.getDescripcion()};
            ((DefaultTableModel)tablaArticulos.getModel()).addRow(articulos);
        }
    }
    @Override
    public void update(Observable o, Object arg) {
        agregarEnTabla();
    }
}

