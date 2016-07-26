package Presentacion;

import Entidades.Item;
import Entidades.Venta;
import Gestores.GestorItem;
import Gestores.GestorVenta;
import Modelos.ModeloTbItems;
import Modelos.ModeloTbVenta;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentasPanel extends javax.swing.JFrame {
private int x ,y, total = 0;
GestorItem gIte = new GestorItem();
private List<Item> itemsVenta = new ArrayList<Item>();
    public VentasPanel() {
        initComponents();
        this.setLocationRelativeTo(null);
        actTbVenta();
    }
    
    private void actTbVenta(){
        ModeloTbVenta modeloVenta = new ModeloTbVenta(itemsVenta);
        tablaVenta.setModel(modeloVenta);
    }
    
    private void actTbItems(){
        List<Item> items = null;
        try {
            items = gIte.Listar();
            ModeloTbItems modeloItem = new ModeloTbItems(items);
            tablaItems.setModel(modeloItem);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar conectarse", ". : Mensaje del Sistema : ", JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tVendedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfComprador = new javax.swing.JTextField();
        Comprar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        AddItem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tCantidad = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaItems = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        tTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(":: VENTA ::");
        jLabel1.setOpaque(true);
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel2.setText("Vendedor:");

        tVendedor.setEditable(false);

        jLabel3.setText("Comprador:");

        Comprar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        Comprar.setText("Confirmar Venta");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ICONO - CERRAR.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaVentaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaVentaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVenta);

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel4.setText("Venta:");

        AddItem.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        AddItem.setText("Agregar a la venta");
        AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad:");

        tCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tCantidad.setText("1");
        tCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCantidadActionPerformed(evt);
            }
        });

        tablaItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaItems);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("TOTAL:");

        tTotal.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        tTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tTotal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Comprar)
                                .addGap(45, 45, 45)
                                .addComponent(Salir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfComprador))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddItem))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCantidadActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void tablaVentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaVentaKeyReleased
        total = 0;
        for (int i = 0; i < itemsVenta.size(); i++) {
            total = total + itemsVenta.get(i).getPrecio();
            tTotal.setText(Integer.toString(total));
        }
    }//GEN-LAST:event_tablaVentaKeyReleased

    private void AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemActionPerformed
        int fila = tablaItems.getSelectedRow();        
        Item seleccion;
        if (fila >= 0) {
            int cant = Integer.parseInt(tCantidad.getText().toString());
            int precu = Integer.parseInt(tablaItems.getValueAt(fila, 3).toString());
            int prect = precu*cant;
            seleccion = new Item(Integer.parseInt(tablaItems.getValueAt(fila, 0).toString()),tablaItems.getValueAt(fila, 1).toString(),
                    cant,prect);
            itemsVenta.add(seleccion);
            actTbVenta();
            total += prect;
            tTotal.setText(Integer.toString(total));
        }
        else {
            JOptionPane.showMessageDialog(null, "Seleccione un Item", ". : Mensaje del Sistema : ", JOptionPane.WARNING_MESSAGE);
        }        
    }//GEN-LAST:event_AddItemActionPerformed

    private void tablaVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaVentaKeyPressed
        total = 0;
        for (int i = 0; i < itemsVenta.size(); i++) {
            total = total + itemsVenta.get(i).getPrecio();
        }
    }//GEN-LAST:event_tablaVentaKeyPressed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        GestorVenta gVen = new GestorVenta();  
        int p = 0;
        for (int i = 0; i < itemsVenta.size(); i++) {
            try {
                int cv = itemsVenta.get(i).getCantidad();
                gVen.Registrar(new Venta(null,tVendedor.getText(),tfComprador.getText(),itemsVenta.get(i),
                        itemsVenta.get(i).getCantidad(),itemsVenta.get(i).getPrecio()));
                gIte.Restar(itemsVenta.get(i).getID(), cv);
                p++;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se pudo realizar la venta", ". : Mensaje del Sistema : ", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (p>0) {
            JOptionPane.showMessageDialog(null, "Venta realizada con éxito", ". : Mensaje del Sistema : ", JOptionPane.INFORMATION_MESSAGE);
            tfComprador.setText(null);
            itemsVenta.clear();
            tTotal.setText("0");
            actTbItems();
            actTbVenta();
        }
    }//GEN-LAST:event_ComprarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddItem;
    private javax.swing.JButton Comprar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField tCantidad;
    private javax.swing.JLabel tTotal;
    public javax.swing.JTextField tVendedor;
    public javax.swing.JTable tablaItems;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField tfComprador;
    // End of variables declaration//GEN-END:variables
}
