//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package interfaz;
import dominio.*;
import java.awt.Color;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.*;

public class VentanaVuelo extends javax.swing.JFrame implements Observer{
    DefaultTableModel modeloTabla;
    public VentanaVuelo(Sistema s) {
        cambiarIdiomaFileChooser(); 
        initComponents();
        modelo = s;
        modelo.addObserver(this);
        diferencias.setVisible(false);
        coincidencias.setVisible(false);
        labelArea.setVisible(false);
        labelFila.setVisible(false);
        lineasLeidas.setVisible(false);
        modeloTabla = (DefaultTableModel) tabla.getModel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fc = new javax.swing.JFileChooser();
        coincidencias = new javax.swing.JLabel();
        diferencias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        labelArea = new javax.swing.JLabel();
        labelFila = new javax.swing.JLabel();
        lineasLeidas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Vuelo");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcActionPerformed(evt);
            }
        });
        getContentPane().add(fc, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 0, 420, 260));

        coincidencias.setText("Total Coincidencias:");
        getContentPane().add(coincidencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        diferencias.setText("Total Diferencias:");
        getContentPane().add(diferencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "De", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 670, 60));

        labelArea.setText("Area: ");
        getContentPane().add(labelArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        labelFila.setText("Fila:");
        getContentPane().add(labelFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        lineasLeidas.setText("Lineas Leidas:");
        getContentPane().add(lineasLeidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void fcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcActionPerformed
        String command = evt.getActionCommand();
        if(command.equals(JFileChooser.APPROVE_SELECTION)){
            File archSeleccionado = fc.getSelectedFile(); 
            if(archSeleccionado!=null){
                leerVuelo(archSeleccionado);  
            }
            else if(command.equals(JFileChooser.CANCEL_SELECTION)){
                JOptionPane.showMessageDialog(this, "No se selecciono archivo","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_fcActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coincidencias;
    private javax.swing.JLabel diferencias;
    private javax.swing.JFileChooser fc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel labelFila;
    private javax.swing.JLabel lineasLeidas;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    public void cambiarIdiomaFileChooser(){
        UIManager.put("FileChooser.openButtonText","Abrir");
        UIManager.put("FileChooser.cancelButtonText","Cancelar");
        UIManager.put("FileChooser.openDialogTitleText", "Abrir archivo");
        UIManager.put("FileChooser.lookInLabelText", "Mirar en");
        UIManager.put("FileChooser.fileNameLabelText", "Archivo");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Tipo");
        UIManager.put("FileChooser.openButtonToolTipText", "Abrir archivo seleccionado");
        UIManager.put("FileChooser.fileNameHeaderText","FileName");
        UIManager.put("FileChooser.upFolderToolTipText", "Subi run nivel");
        UIManager.put("FileChooser.homeFolderToolTipText","Escritorio");
        UIManager.put("FileChooser.newFolderToolTipText","Crear nueva carpeta");
        UIManager.put("FileChooser.listViewButtonToolTipText","List");
        UIManager.put("FileChooser.filterLabelText", "Arhivos tipo");
    }
    public void leerVuelo(File archivo){
        int contadorLineas = 0;
        int contadorCoincidencias = 0;
        int contadorDiferencias = 0;
        
        ArchivoLectura a = new ArchivoLectura(archivo.getAbsolutePath());
        ((DefaultTableModel)tabla.getModel()).setRowCount(0);
        a.hayMasLineas();
        String nombreDron = a.linea();
        Dron dron = modelo.buscarDron(nombreDron);
        a.hayMasLineas();
        String areaFila = a.linea();
        String[] areas = areaFila.split("#");
        String area = areas[0];
        int numeroArea = buscarNumeroArea(area);
        Carga[][] lugarCarga = modelo.getCargas().get(numeroArea);
        String fila = areas[1];
        String[] infoTexto = new String[11];
        String[] infoManual = new String[11];
        infoTexto[0]="Archivo";
        infoManual[0]="Manual";
        pintarTablaColumna(Color.gray,0);
        while(a.hayMasLineas()){
            if(lugarCarga[Integer.parseInt(fila)-1][contadorLineas]==null){
                if(a.linea().equals("0")){
                    contadorCoincidencias = contadorCoincidencias+1;
                    infoTexto[contadorLineas+1]=a.linea();//
                    infoManual[contadorLineas+1]="0";
                    pintarTablaColumna(Color.green,contadorLineas+1);
                }
                else{
                    contadorDiferencias = contadorDiferencias+1;
                    infoTexto[contadorLineas+1]=a.linea();//
                    infoManual[contadorLineas+1]="0";
                    pintarTablaColumna(Color.red,contadorLineas+1);
                }
            }
            else{
                if(a.linea().equals(lugarCarga[Integer.parseInt(fila)-1][contadorLineas].getCodigo())){
                    contadorCoincidencias = contadorCoincidencias+1;
                    infoTexto[contadorLineas+1]=a.linea();//
                    infoManual[contadorLineas+1]=lugarCarga[Integer.parseInt(fila)-1][contadorLineas].getCodigo();
                    pintarTablaColumna(Color.green,contadorLineas+1);
                }
                else{
                    contadorDiferencias = contadorDiferencias+1;
                    infoTexto[contadorLineas+1]=a.linea();//
                    infoManual[contadorLineas+1]=lugarCarga[Integer.parseInt(fila)-1][contadorLineas].getCodigo();
                    pintarTablaColumna(Color.red,contadorLineas+1);
                }
            }
            contadorLineas = contadorLineas+1;
        }
        a.cerrar();
        if(contadorLineas<10){ // si no es exitoso
            Vuelo v = new Vuelo(a.getNombre(),area,"NO",Integer.parseInt(fila),contadorLineas,0,0); //falta ver nombre archivo
            modelo.notificarVuelo(dron, v);//Para que se actualice enseguida
            JOptionPane.showMessageDialog(null,"Error","Vuelo no Exitoso",JOptionPane.ERROR_MESSAGE);
            diferencias.setVisible(false);
            coincidencias.setVisible(false);
            labelArea.setVisible(false);
            labelFila.setVisible(false);
            lineasLeidas.setVisible(true);
            tabla.setVisible(false);
            lineasLeidas.setText("Lineas leidas: "+contadorLineas);
        }
        else{ // si es exitoso
            lineasLeidas.setVisible(false);
            Vuelo v = new Vuelo(a.getNombre(),area,"SI",Integer.parseInt(fila),contadorLineas,contadorCoincidencias,contadorDiferencias);
            modelo.notificarVuelo(dron, v);//para que se actualice enseguida
            diferencias.setText("Total Diferencias: "+contadorDiferencias);
            diferencias.setVisible(true);
            coincidencias.setText("Total Coincidencias: "+contadorCoincidencias);
            coincidencias.setVisible(true);
            labelArea.setText("Area: "+area);
            labelArea.setVisible(true);
            labelFila.setText("Fila: "+fila);
            labelFila.setVisible(true);
            tabla.setVisible(true);
            cargarTabla(infoTexto,infoManual);
        }   
    }
    public int buscarNumeroArea(String unArea){
        int contador = -1;
        if(unArea.equalsIgnoreCase("a")){
            contador = 0;
        }
        if(unArea.equalsIgnoreCase("b")){
            contador = 1;
        }
        if(unArea.equalsIgnoreCase("c")){
            contador = 2;
        }
        if(unArea.equalsIgnoreCase("d")){
            contador = 3;
        }
        if(unArea.equalsIgnoreCase("e")){
            contador = 4;
        }
        
        return contador;
    }
    public void cargarTabla(String[] infoTexto, String[] infoManual){
        modeloTabla.addRow(infoTexto);
        modeloTabla.addRow(infoManual);
    }
    public void pintarTablaColumna(Color colorColumna,int columna){
        DefaultTableCellRenderer color = new DefaultTableCellRenderer();
        color.setBackground(colorColumna);
        tabla.getColumnModel().getColumn(columna).setCellRenderer(color);
    }
    @Override
    public void update(Observable o, Object arg) {
        
    }
}
