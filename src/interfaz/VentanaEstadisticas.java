//Santiago Blanco(282654) y Federico de Alava(288858) - M2B
package interfaz;
import dominio.*;
import java.util.*;
import java.io.*;

public class VentanaEstadisticas extends javax.swing.JFrame implements Observer{
    public VentanaEstadisticas(Sistema s) {
        initComponents();
        modelo = s;
        cargarLista();
        modelo.addObserver(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSinVuelos = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaConVuelos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaDetalles = new javax.swing.JList();
        labelDetalles = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setViewportView(listaSinVuelos);

        listaConVuelos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaConVuelosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaConVuelos);

        jLabel1.setText("Sin Vuelos");

        jLabel2.setText("Con Vuelos");

        jScrollPane3.setViewportView(listaDetalles);

        labelDetalles.setText("Detalles");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDetalles)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(13, 13, 13)
                .addComponent(labelDetalles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listaConVuelosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaConVuelosValueChanged
        String nombreDron = String.valueOf(listaConVuelos.getSelectedValue());
        dronActual = modelo.buscarDron(nombreDron);
        if(dronActual!=null){
            cargarListaConVuelos(dronActual);
        }
    }//GEN-LAST:event_listaConVuelosValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelDetalles;
    private javax.swing.JList listaConVuelos;
    private javax.swing.JList listaDetalles;
    private javax.swing.JList listaSinVuelos;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private Dron dronActual;
    public void cargarLista(){
        ArrayList<Dron> sinVuelos = new ArrayList<Dron>();
        ArrayList<Dron> conVuelos = new ArrayList<Dron>();
        for (int i = 0; i < modelo.getDrones().size(); i++) {
            if(modelo.getDrones().get(i).getVuelos().isEmpty()){
                sinVuelos.add(modelo.getDrones().get(i));
            }
            else{
                conVuelos.add(modelo.getDrones().get(i));
            }   
        }
        listaSinVuelos.setListData(sinVuelos.toArray());
        listaConVuelos.setListData(conVuelos.toArray());
    }
    public void cargarListaConVuelos(Dron d){
        ArrayList<String> losVuelos = new ArrayList<String>();
        for (int i = 0; i < d.getVuelos().size() ; i++) {
            if(d.getVuelos().get(i).getExistoso().equals("SI")){
                losVuelos.add(d.getVuelos().get(i).toStringExitoso());
            }
            else{
                losVuelos.add(d.getVuelos().get(i).toStringNoExitoso());
            }
        }
        listaDetalles.setListData(losVuelos.toArray());
    }
    @Override
    public void update(Observable o, Object arg) {
        cargarLista();
        if(dronActual!=null){
            cargarListaConVuelos(dronActual);
        }
    }
}
