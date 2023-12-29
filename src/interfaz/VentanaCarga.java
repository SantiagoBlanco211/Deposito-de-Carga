//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package interfaz;
import dominio.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class VentanaCarga extends javax.swing.JFrame implements Observer{
    public VentanaCarga(Sistema s) {
        initComponents();
        modelo = s;
        panelCarga.setVisible(false);
        panelEgresar.setVisible(false);
        panelEspacios.setLayout(new GridLayout(12,10));
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                JButton nuevo = new JButton(" ");
                nuevo.setMargin(new Insets(-5, -5, -5, -5));
                nuevo.setBackground(Color.gray);
                nuevo.setForeground(Color.WHITE);
                nuevo.setText(""+(i+1)+":"+(j+1));
                nuevo.addActionListener(new EspacioListener());
                panelEspacios.add(nuevo);
            }     
        }
        modelo.addObserver(this);
    }
    private class EspacioListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(botonAnt!=null){
                botonAnt.setBackground(Color.gray);
            }
            //este código se ejecutará al presionar el botón, obtengo cuál botón
            JButton boton = ((JButton) e.getSource());
            boton.setBackground(Color.red);
            botonAnt = boton;
            //código a completar según el botón presionado
            String[] textoBoton = boton.getText().split(":"); //guarda fila en pos 0 y columna en pos 1
            fila=Integer.parseInt(textoBoton[0])-1;
            columna=Integer.parseInt(textoBoton[1])-1;          
            int elegirArea = 0;
            if(contador==1){
                elegirArea=1;
            }
            if(contador==2){
                elegirArea=2;
            }
            if(contador==3){
                elegirArea=3;
            }
            if(contador==4){
                elegirArea=4;
            }
            Carga[][] area = modelo.getCargas().get(elegirArea);
            if(area[fila][columna]==null){
                panelEgresar.setVisible(false);
                panelCarga.setVisible(true);
                //muestra las listas
                listaFuncionarios.setListData(modelo.getFuncionarios().toArray());
                listaArticulos.setListData(modelo.getArticulos().toArray());
            }
            else{
                panelCarga.setVisible(false);
                panelEgresar.setVisible(true);
                Carga[][] unaCarga = modelo.getCargas().get(contador);
                //muestra datos carga
                ingresarCodigo.setText(unaCarga[fila][columna].getCodigo());
                ingresarCantidad.setText(unaCarga[fila][columna].getUnidades()+"");
                ingresarFuncionario.setText(unaCarga[fila][columna].getFuncionario().toString());
                ingresarArticulo.setText(unaCarga[fila][columna].getArticulo().toString());
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        botonAdelante = new javax.swing.JButton();
        panelEspacios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelArea = new javax.swing.JLabel();
        panelCarga = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaFuncionarios = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaArticulos = new javax.swing.JList();
        jLabel17 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        panelEgresar = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        ingresarCodigo = new javax.swing.JLabel();
        ingresarCantidad = new javax.swing.JLabel();
        ingresarArticulo = new javax.swing.JLabel();
        ingresarFuncionario = new javax.swing.JLabel();
        botonEgresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAtras.setText("<<");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 367, -1, -1));

        botonAdelante.setText(">>");
        botonAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdelanteActionPerformed(evt);
            }
        });
        jPanel1.add(botonAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        panelEspacios.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.add(panelEspacios, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 27, 392, 334));

        jLabel1.setText("      1           2           3            4           5           6           7           8          9          10");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 5, 392, -1));

        jLabel2.setText("1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 33, 20, -1));

        jLabel3.setText("2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 61, 19, -1));

        jLabel4.setText("3");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 89, 20, 24));

        jLabel5.setText("4");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 14, -1));

        jLabel6.setText("5");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 147, 21, -1));

        jLabel7.setText("6");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 169, 14, -1));

        jLabel8.setText("7");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 197, 20, -1));

        jLabel9.setText("8");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 225, 19, -1));

        jLabel10.setText("9");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 253, 20, 24));

        jLabel11.setText("10");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 283, 14, -1));

        jLabel12.setText("11");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 311, 21, -1));

        jLabel13.setText("12");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 339, 14, -1));

        labelArea.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelArea.setText("AREA A");
        jPanel1.add(labelArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 5, 77, 29));

        panelCarga.setBackground(new java.awt.Color(51, 255, 51));

        jLabel14.setText("Ingreso");

        jLabel15.setText("Funcionarios");

        jLabel16.setText("Articulos");

        jScrollPane1.setViewportView(listaFuncionarios);

        jScrollPane2.setViewportView(listaArticulos);

        jLabel17.setText("Cantidad");

        jLabel18.setText("Codigo");

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCargaLayout = new javax.swing.GroupLayout(panelCarga);
        panelCarga.setLayout(panelCargaLayout);
        panelCargaLayout.setHorizontalGroup(
            panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCargaLayout.createSequentialGroup()
                .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCargaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14))
                    .addGroup(panelCargaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(cantidad))
                        .addGap(31, 31, 31)
                        .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jLabel18)
                            .addComponent(codigo))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCargaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonAgregar)
                .addGap(19, 19, 19))
        );
        panelCargaLayout.setVerticalGroup(
            panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonAgregar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(panelCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 61, -1, -1));

        panelEgresar.setBackground(new java.awt.Color(0, 153, 255));

        jLabel19.setText("Egreso:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Codigo");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Articulo");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Cantidad");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Funcionario");

        ingresarCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ingresarCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ingresarArticulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ingresarFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        botonEgresar.setText("Egresar");
        botonEgresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEgresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEgresarLayout = new javax.swing.GroupLayout(panelEgresar);
        panelEgresar.setLayout(panelEgresarLayout);
        panelEgresarLayout.setHorizontalGroup(
            panelEgresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEgresarLayout.createSequentialGroup()
                .addGroup(panelEgresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEgresarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19))
                    .addGroup(panelEgresarLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelEgresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEgresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelEgresarLayout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addGap(1, 1, 1)))
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addGap(24, 24, 24)
                        .addGroup(panelEgresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingresarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelEgresarLayout.createSequentialGroup()
                                .addGroup(panelEgresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ingresarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingresarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ingresarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEgresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonEgresar)
                .addContainerGap())
        );
        panelEgresarLayout.setVerticalGroup(
            panelEgresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEgresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(40, 40, 40)
                .addGroup(panelEgresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingresarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(28, 28, 28)
                .addGroup(panelEgresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEgresarLayout.createSequentialGroup()
                        .addGroup(panelEgresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEgresarLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(38, 38, 38)
                                .addGroup(panelEgresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22)
                                    .addComponent(ingresarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ingresarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel23))
                    .addComponent(ingresarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEgresar)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel1.add(panelEgresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 61, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        if(contador>=1){
            contador = contador -1;
            if(contador == 0){
                labelArea.setText("AREA A");
                panelCarga.setVisible(false);
                panelEgresar.setVisible(false);
            }
            if(contador == 1){
                labelArea.setText("AREA B");
                panelCarga.setVisible(false);
                panelEgresar.setVisible(false);
            }
            if(contador == 2){
                labelArea.setText("AREA C");
                panelCarga.setVisible(false);
                panelEgresar.setVisible(false);
            }
            if(contador == 3){
                labelArea.setText("AREA D");
                panelCarga.setVisible(false);
                panelEgresar.setVisible(false);
            }
            if(contador == 4){
                labelArea.setText("AREA E");
                panelCarga.setVisible(false);
                panelEgresar.setVisible(false);
            }
            if(botonAnt!=null){
                botonAnt.setBackground(Color.gray);
            }
        }
    }//GEN-LAST:event_botonAtrasActionPerformed
    private void botonAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdelanteActionPerformed
        if(contador<=3){
            contador = contador +1;
            if(contador == 0){
                labelArea.setText("AREA A");
                panelCarga.setVisible(false);
                panelEgresar.setVisible(false);
            }
            if(contador == 1){
                labelArea.setText("AREA B");
                panelCarga.setVisible(false);
                panelEgresar.setVisible(false);
            }
            if(contador == 2){
                labelArea.setText("AREA C");
                panelCarga.setVisible(false);
                panelEgresar.setVisible(false);
            }
            if(contador == 3){
                labelArea.setText("AREA D");
                panelCarga.setVisible(false);
                panelEgresar.setVisible(false);
            }
            if(contador == 4){
                labelArea.setText("AREA E");
                panelCarga.setVisible(false);
                panelEgresar.setVisible(false);
            }
            if(botonAnt!=null){
                botonAnt.setBackground(Color.gray);
            }
        }
    }//GEN-LAST:event_botonAdelanteActionPerformed
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if(modelo.numeroValido(cantidad.getText())&& modelo.numeroValido(codigo.getText())){
            if(!listaFuncionarios.isSelectionEmpty() && !listaArticulos.isSelectionEmpty()){
                Carga[][] unaCarga = modelo.getCargas().get(contador);
                int cant = Integer.parseInt(cantidad.getText());
                Carga c = new Carga((Funcionario)listaFuncionarios.getSelectedValue(),(Articulo)listaArticulos.getSelectedValue(),cant,codigo.getText());
                if(modelo.codigoUnico(codigo.getText())){ 
                    unaCarga[fila][columna]= c;
                    panelCarga.setVisible(false);
                    panelEgresar.setVisible(true);
                    unaCarga = modelo.getCargas().get(contador);
                    ingresarCodigo.setText(unaCarga[fila][columna].getCodigo());
                    ingresarCantidad.setText(unaCarga[fila][columna].getUnidades()+"");
                    ingresarFuncionario.setText(unaCarga[fila][columna].getFuncionario().toString());
                    ingresarArticulo.setText(unaCarga[fila][columna].getArticulo().toString());
                }
                else{
                    JOptionPane.showMessageDialog(null,"No se agrego Carga","Codigo existente",JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"No se agrego Carga","Falta seleccionar objeto en lista",JOptionPane.ERROR_MESSAGE);
            }       
        }
        else{
            JOptionPane.showMessageDialog(null,"No se agrego Carga","Numero no valido",JOptionPane.ERROR_MESSAGE);
        }     
    }//GEN-LAST:event_botonAgregarActionPerformed
    private void botonEgresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEgresarActionPerformed
        Carga[][] unaCarga = modelo.getCargas().get(contador);
        unaCarga[fila][columna]= null;
        panelEgresar.setVisible(false);
        panelCarga.setVisible(true);      
    }//GEN-LAST:event_botonEgresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdelante;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonEgresar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel ingresarArticulo;
    private javax.swing.JLabel ingresarCantidad;
    private javax.swing.JLabel ingresarCodigo;
    private javax.swing.JLabel ingresarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelArea;
    private javax.swing.JList listaArticulos;
    private javax.swing.JList listaFuncionarios;
    private javax.swing.JPanel panelCarga;
    private javax.swing.JPanel panelEgresar;
    private javax.swing.JPanel panelEspacios;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private JButton botonAnt;
    private int contador=0;
    private int fila=0;
    private int columna=0;
    @Override
    public void update(Observable o, Object arg) {
        listaFuncionarios.setListData(modelo.getFuncionarios().toArray());
        listaArticulos.setListData(modelo.getArticulos().toArray());
    }
}
