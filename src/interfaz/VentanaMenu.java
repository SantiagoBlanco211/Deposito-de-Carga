//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package interfaz;
import dominio.*;
import java.io.*;

public class VentanaMenu extends javax.swing.JFrame {
    public VentanaMenu(Sistema s) {
        initComponents();
        modelo = s;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonTerminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        registrar = new javax.swing.JMenu();
        registrarArticulo = new javax.swing.JMenuItem();
        registrarFuncionario = new javax.swing.JMenuItem();
        registrarDron = new javax.swing.JMenuItem();
        registrarVuelo = new javax.swing.JMenuItem();
        ingreso = new javax.swing.JMenu();
        carga = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        estadisticas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setUndecorated(true);
        setResizable(false);

        botonTerminar.setText("Terminar");
        botonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(646, Short.MAX_VALUE)
                .addComponent(botonTerminar)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addComponent(botonTerminar)
                .addContainerGap())
        );

        registrar.setText("Registrar");

        registrarArticulo.setText("Articulo");
        registrarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarArticuloActionPerformed(evt);
            }
        });
        registrar.add(registrarArticulo);

        registrarFuncionario.setText("Funcionario");
        registrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarFuncionarioActionPerformed(evt);
            }
        });
        registrar.add(registrarFuncionario);

        registrarDron.setText("Dron");
        registrarDron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDronActionPerformed(evt);
            }
        });
        registrar.add(registrarDron);

        registrarVuelo.setText("Vuelo de Dron");
        registrarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarVueloActionPerformed(evt);
            }
        });
        registrar.add(registrarVuelo);

        jMenuBar1.add(registrar);

        ingreso.setText("Ingreso / Egreso");

        carga.setText("Carga");
        carga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaActionPerformed(evt);
            }
        });
        ingreso.add(carga);

        jMenuBar1.add(ingreso);

        jMenu1.setText("Emision");

        estadisticas.setText("Emision de Estadisticas");
        estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadisticasActionPerformed(evt);
            }
        });
        jMenu1.add(estadisticas);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void registrarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarArticuloActionPerformed
        VentanaArticulos vArticulo = new VentanaArticulos(modelo);
        vArticulo.setVisible(true);
    }//GEN-LAST:event_registrarArticuloActionPerformed
    private void registrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarFuncionarioActionPerformed
        VentanaFuncionarios vFuncionario = new VentanaFuncionarios(modelo);
        vFuncionario.setVisible(true);
    }//GEN-LAST:event_registrarFuncionarioActionPerformed
    private void registrarDronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDronActionPerformed
        VentanaDrones vDron = new VentanaDrones(modelo);
        vDron.setVisible(true);
    }//GEN-LAST:event_registrarDronActionPerformed
    private void cargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaActionPerformed
        VentanaCarga vCarga = new VentanaCarga(modelo);
        vCarga.setVisible(true);
    }//GEN-LAST:event_cargaActionPerformed
    private void registrarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarVueloActionPerformed
        VentanaVuelo vVuelo = new VentanaVuelo(modelo);
        vVuelo.setVisible(true);
    }//GEN-LAST:event_registrarVueloActionPerformed
    private void botonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerminarActionPerformed
        try {
            FileOutputStream arch = new FileOutputStream("Datos");
            ObjectOutputStream grabar = new ObjectOutputStream(arch);
            grabar.writeObject(modelo);
            grabar.close();
            dispose();
        }
        catch(IOException e){
            System.out.println("No pude grabar "+e.getMessage()); // cuenta porque no puede guardar
        }
    }//GEN-LAST:event_botonTerminarActionPerformed
    private void estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadisticasActionPerformed
        VentanaEstadisticas vEstadisticas = new VentanaEstadisticas(modelo);
        vEstadisticas.setVisible(true);
    }//GEN-LAST:event_estadisticasActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonTerminar;
    private javax.swing.JMenuItem carga;
    private javax.swing.JMenuItem estadisticas;
    private javax.swing.JMenu ingreso;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panel;
    private javax.swing.JMenu registrar;
    private javax.swing.JMenuItem registrarArticulo;
    private javax.swing.JMenuItem registrarDron;
    private javax.swing.JMenuItem registrarFuncionario;
    private javax.swing.JMenuItem registrarVuelo;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
