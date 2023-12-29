//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package interfaz;
import dominio.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class VentanaFuncionarios extends javax.swing.JFrame implements Observer {
    public VentanaFuncionarios(Sistema s) {
        initComponents();
        modelo = s;
        agregarEnTabla();
        modelo.addObserver(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelArticulo = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        nombreFuncionario = new javax.swing.JTextField();
        edadFuncionario = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFuncionarios = new javax.swing.JTable();
        numero = new javax.swing.JLabel();
        numeroFuncionario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionario");
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        nombre.setText("Nombre :");

        edad.setText("Edad :");

        nombreFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFuncionarioActionPerformed(evt);
            }
        });

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        tablaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Numero"
            }
        ));
        jScrollPane1.setViewportView(tablaFuncionarios);

        numero.setText("Numero :");

        numeroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelArticuloLayout = new javax.swing.GroupLayout(panelArticulo);
        panelArticulo.setLayout(panelArticuloLayout);
        panelArticuloLayout.setHorizontalGroup(
            panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArticuloLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAgregar)
                    .addGroup(panelArticuloLayout.createSequentialGroup()
                        .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edad)
                            .addComponent(numero))
                        .addGap(18, 18, 18)
                        .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreFuncionario)
                            .addComponent(edadFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(numeroFuncionario))))
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
                            .addComponent(nombre)
                            .addComponent(nombreFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edadFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numero)
                            .addComponent(numeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(botonAgregar))
                    .addGroup(panelArticuloLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void nombreFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFuncionarioActionPerformed
    }//GEN-LAST:event_nombreFuncionarioActionPerformed
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if(modelo.numeroValido(edadFuncionario.getText()) && modelo.numeroValido(numeroFuncionario.getText())){
            int nroFuncionario = Integer. parseInt(numeroFuncionario.getText());
            int nroEdad = Integer. parseInt(edadFuncionario.getText());
            Funcionario f = new Funcionario(nombreFuncionario.getText(),nroEdad,nroFuncionario);
            if(!modelo.getFuncionarios().contains(f)){
                modelo.agregarFuncionario(f);
                agregarEnTabla();
                edadFuncionario.setText("");
                numeroFuncionario.setText("");
                nombreFuncionario.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null,"No se agrego Funcionario","Numero Repetido",JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"No se agrego Funcionario","Hay numero invalido",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed
    private void numeroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroFuncionarioActionPerformed
    }//GEN-LAST:event_numeroFuncionarioActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JLabel edad;
    private javax.swing.JTextField edadFuncionario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreFuncionario;
    private javax.swing.JLabel numero;
    private javax.swing.JTextField numeroFuncionario;
    private javax.swing.JPanel panelArticulo;
    private javax.swing.JTable tablaFuncionarios;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    public void agregarEnTabla(){
        ArrayList<Funcionario> listaFuncionarios = modelo.getFuncionarios();
        ((DefaultTableModel)tablaFuncionarios.getModel()).setRowCount(0);
        for (Funcionario f : listaFuncionarios) {
            Object [] funcionarios = {f.getNombre(),f.getEdad(),f.getNumero()};
            ((DefaultTableModel)tablaFuncionarios.getModel()).addRow(funcionarios);
        }
    }
    @Override
    public void update(Observable o, Object arg) {
        agregarEnTabla();
    }
}
