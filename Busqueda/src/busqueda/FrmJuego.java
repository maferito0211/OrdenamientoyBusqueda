package busqueda;

//Busqeuda lineal va comprobando los valores de la lista de uno en uno, por ejemplo:

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FrmJuego extends javax.swing.JFrame {

    //declarada aquí para que sea globar, si no no funciona
    DefaultListModel modelo = new DefaultListModel();
    int iteracion,elementos,salir,medio,elementosb,contar,valori,valorf,valorm,valorM,numeroi,con,posicionm;
    int vec[]=new int [100];
    String mitad,lista;
    public FrmJuego() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        btnBusquedaLineal = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstNumeros = new javax.swing.JList();
        txtBusquedaBinaria = new javax.swing.JTextField();
        btnBusquedaBinaria = new javax.swing.JButton();
        btnSeleccion = new javax.swing.JButton();
        btnInsercion = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBusquedaLineal.setText("Búsqueda lineal");
        btnBusquedaLineal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaLinealActionPerformed(evt);
            }
        });

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        lstNumeros.setForeground(new java.awt.Color(0, 0, 255));
        jScrollPane2.setViewportView(lstNumeros);

        txtBusquedaBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaBinariaActionPerformed(evt);
            }
        });

        btnBusquedaBinaria.setText("Búsqueda binaria");
        btnBusquedaBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaBinariaActionPerformed(evt);
            }
        });

        btnSeleccion.setText("Ordenamiento por selección");
        btnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionActionPerformed(evt);
            }
        });

        btnInsercion.setText("Ordenamiento por inserción");
        btnInsercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsercionActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar lista");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBusquedaBinaria, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(txtBusqueda)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBorrar)
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnBusquedaBinaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBusquedaLineal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeleccion, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addComponent(btnInsercion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar))
                        .addGap(32, 32, 32)
                        .addComponent(btnAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusquedaLineal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusquedaBinaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusquedaBinaria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSeleccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsercion)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        modelo.addElement(txtNumero.getText());
        lstNumeros.setModel(modelo);
        elementos++;
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void btnBusquedaLinealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaLinealActionPerformed
        //si tuvieramos 1000 elementos y el valor buscado estuiera en el ultimo, pues se demora.
        //BIG O
        //Es el esfuerzo que se requiere para completar la búsqueda.
        //el algotirmo de busqueda lineal tiene una O(n)--tiempo de ejecución lineal.
        iteracion=0;
        salir=0;
        while(iteracion<elementos && salir==0)
        {
            lstNumeros.setSelectedIndex(iteracion);
            if(lstNumeros.getSelectedValue().toString().equals(txtBusqueda.getText()))
            {
                JOptionPane.showMessageDialog(null,"Número de iteraciones: "+iteracion);
                salir=1;
            }
            iteracion++;
        }
    }//GEN-LAST:event_btnBusquedaLinealActionPerformed

    private void txtBusquedaBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaBinariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaBinariaActionPerformed

    private void btnBusquedaBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaBinariaActionPerformed
        //Requiere que el vector esté ordenado ya lo vamos a dar ordenado porque aun no vemos eso jaja
        //Parte al vector en 2, si el valor buscado es menor que el valor de la mitad del vector, se busca en la primera mitad, o el la segunda mitad sino
        //y ahi vuelve a partir en 2 y asi hasta que llegue al valor buscado.
        iteracion=0;
        salir=0;
        elementosb=elementos;
        valori=0;
        valorf=elementos;
        posicionm=elementosb/2;
        lstNumeros.setSelectedIndex((int)(elementosb/2));
        mitad=lstNumeros.getSelectedValue().toString();
        while(!mitad.equals(txtBusquedaBinaria.getText()))
        {
            medio=Integer.parseInt(mitad);
            if(medio>Integer.parseInt(txtBusquedaBinaria.getText()))
            {
                valorf=posicionm;
                elementosb=0;
                for(int x=valori;x<posicionm;x++)
                {
                    elementosb++;
                }
                lstNumeros.setSelectedIndex((int)(elementosb/2)+valori);
                mitad=lstNumeros.getSelectedValue().toString();
                posicionm=(elementosb/2)+valori;
            }
            else
            {
                elementosb=0;
                for(int x=valori;x<posicionm;x++)
                {
                    elementosb++;
                }
                valori+=elementosb;
                elementosb=0;
                for(int x=posicionm;x<valorf;x++)
                {
                    elementosb++;
                }
                contar=valorf-elementosb;
                lstNumeros.setSelectedIndex(((int)(elementosb/2))+contar);
                mitad=lstNumeros.getSelectedValue().toString();
                posicionm=(elementosb/2)+contar;
            }
            iteracion++;
        }
        JOptionPane.showMessageDialog(null,"Número de iteraciones: "+iteracion);
    }//GEN-LAST:event_btnBusquedaBinariaActionPerformed

    private void btnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionActionPerformed
        iteracion=0;
        numeroi=0;
        salir=0;
        for(int x=0;x<elementos;x++)
        {
            lstNumeros.setSelectedIndex(x);
            vec[x]=Integer.valueOf(lstNumeros.getSelectedValue().toString());
        }
        valorm=vec[elementos-1];
        contar=elementos-1;
        while(salir==0)
        {
            con=0;
            for(int x=numeroi;x<elementos-1;x++)
            {
                if(vec[x]<vec[x+1])
                {
                    if(valorm>vec[x])
                    {
                        valorm=vec[x];
                        contar=x;
                    }
                }
                else
                {
                    con++;
                }
            }
            valorM=vec[numeroi];
            vec[numeroi]=valorm;
            vec[contar]=valorM;
            if(con==0)
            {
                salir=1;
            }
            else
            {
                valorm=vec[elementos-1];
                contar=elementos-1;
            }
            iteracion++;
            numeroi++;
        }
        lista="";
        for(int x=0;x<elementos;x++)
        {
           lista=lista+String.valueOf(vec[x])+"\n";
        }
        JOptionPane.showMessageDialog(null,"Número de iteraciones: "+iteracion+"\n Lista ordenada: \n"+lista);
    }//GEN-LAST:event_btnSeleccionActionPerformed

    private void btnInsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsercionActionPerformed
        con=0;
        iteracion=0;
        for(int x=0;x<elementos;x++)
        {
            lstNumeros.setSelectedIndex(x);
            vec[x]=Integer.valueOf(lstNumeros.getSelectedValue().toString());
        }
        for(int x=0;x<elementos-1;x++)
        {
            con=0;
            if(vec[x]>vec[x+1])
            {
                valorm=vec[x+1];
                contar=x+1;
                vec[x+1]=vec[x];
                vec[x]=valorm;
                for(int i=x;i>0;i--)
                {
                    if(vec[i]<vec[i-1])
                    {
                        valorM=vec[i-1];
                        vec[i-1]=vec[i];
                        vec[i]=valorM;
                    }
                }
            }
            iteracion++;
        }
        lista="";
        for(int x=0;x<elementos;x++)
        {
           lista=lista+String.valueOf(vec[x])+"\n";
        }
        JOptionPane.showMessageDialog(null,"Número de iteraciones: "+iteracion+"\n Lista ordenada: \n"+lista);
    }//GEN-LAST:event_btnInsercionActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        modelo.clear();
        lstNumeros.setModel(modelo);
        elementos=0;
    }//GEN-LAST:event_btnBorrarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBusquedaBinaria;
    private javax.swing.JButton btnBusquedaLineal;
    private javax.swing.JButton btnInsercion;
    private javax.swing.JButton btnSeleccion;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstNumeros;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtBusquedaBinaria;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
