/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TOSHIBA
 */
public class Jframep3 extends javax.swing.JFrame {

       ButtonGroup btng;

    public Jframep3() {
        initComponents();
        btng = new ButtonGroup();
         btng.add(bf);
         btng.add(bm);
         cargartabla();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        textnombre = new javax.swing.JLabel();
        textnaci = new javax.swing.JLabel();
        textcedula = new javax.swing.JLabel();
        textcorreo = new javax.swing.JLabel();
        textphone = new javax.swing.JLabel();
        textpro = new javax.swing.JLabel();
        textcity = new javax.swing.JLabel();
        textgen = new javax.swing.JLabel();
        fcedula = new javax.swing.JTextField();
        fnaci = new javax.swing.JTextField();
        fnombre = new javax.swing.JTextField();
        fcorreo = new javax.swing.JTextField();
        fphone = new javax.swing.JTextField();
        fpro = new javax.swing.JTextField();
        fcity = new javax.swing.JTextField();
        bm = new javax.swing.JRadioButton();
        bf = new javax.swing.JRadioButton();
        textcor = new javax.swing.JLabel();
        fcor = new javax.swing.JTextField();
        textmembresia = new javax.swing.JLabel();
        fmembresia = new javax.swing.JTextField();
        textasesor = new javax.swing.JLabel();
        fasesor = new javax.swing.JTextField();
        textcreditos = new javax.swing.JLabel();
        fcreditos = new javax.swing.JTextField();
        textdescuento = new javax.swing.JLabel();
        fdescuento = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        bguardar = new javax.swing.JButton();
        beliminar = new javax.swing.JButton();
        blimp = new javax.swing.JButton();
        bmod = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)), "Registro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        textnombre.setText("Nombre:");

        textnaci.setText("Nacimiento:");

        textcedula.setText("Cedula:");

        textcorreo.setText("Correo:");

        textphone.setText("Teléfono:");

        textpro.setText("Provincia:");

        textcity.setText("Ciudad:");

        textgen.setText("Genero:");

        fcedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        fnaci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));
        fnaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnaciActionPerformed(evt);
            }
        });

        fnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));
        fnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnombreActionPerformed(evt);
            }
        });

        fcorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));

        fphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));

        fpro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));

        fcity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));

        bm.setText("Masculino");

        bf.setText("Femenino");

        textcor.setText("Corregimiento:");

        fcor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));
        fcor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcorActionPerformed(evt);
            }
        });

        textmembresia.setText("Membresia:");

        fmembresia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));

        textasesor.setText("Asesor:");

        fasesor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));

        textcreditos.setText("Creditos:");

        fcreditos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));

        textdescuento.setText("Descuento:");

        fdescuento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));
        fdescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdescuentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textcedula)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bm)
                                    .addComponent(bf))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textcity)
                                .addGap(42, 42, 42)
                                .addComponent(fcity))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textpro)
                                .addGap(31, 31, 31)
                                .addComponent(fpro))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textphone)
                                .addGap(34, 34, 34)
                                .addComponent(fphone))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textcorreo)
                                .addGap(44, 44, 44)
                                .addComponent(fcorreo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textnombre)
                                .addGap(36, 36, 36)
                                .addComponent(fnombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(fcedula))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(textnaci)
                                .addGap(18, 18, 18)
                                .addComponent(fnaci))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textmembresia)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(textgen))
                                    .addComponent(textcreditos)
                                    .addComponent(textcor)
                                    .addComponent(textdescuento)
                                    .addComponent(textasesor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fcor)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(fcreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(fmembresia)
                                            .addComponent(fasesor)
                                            .addComponent(fdescuento, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(4, 4, 4)))))
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcedula)
                    .addComponent(fcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textnaci)
                    .addComponent(fnaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textnombre)
                    .addComponent(fnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcorreo)
                    .addComponent(fcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textphone)
                    .addComponent(fphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textpro)
                    .addComponent(fpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcity)
                    .addComponent(fcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcor)
                    .addComponent(fcor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fmembresia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textmembresia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textdescuento)
                    .addComponent(fdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fasesor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textasesor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fcreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textcreditos))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bf))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(textgen)
                        .addGap(18, 18, 18))))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));

        bguardar.setBackground(new java.awt.Color(0, 102, 0));
        bguardar.setForeground(new java.awt.Color(255, 255, 255));
        bguardar.setText("Guardar");
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });

        beliminar.setBackground(new java.awt.Color(0, 102, 0));
        beliminar.setForeground(new java.awt.Color(255, 255, 255));
        beliminar.setText("Eliminar");
        beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarActionPerformed(evt);
            }
        });

        blimp.setBackground(new java.awt.Color(0, 102, 0));
        blimp.setForeground(new java.awt.Color(255, 255, 255));
        blimp.setText("Limpiar");
        blimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blimpActionPerformed(evt);
            }
        });

        bmod.setBackground(new java.awt.Color(0, 102, 0));
        bmod.setForeground(new java.awt.Color(255, 255, 255));
        bmod.setText("Modificar");
        bmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(bguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(beliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(blimp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(bmod, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blimp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bmod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Ciudad", "sexo", "Correo", "Telefono", "Nacimiento", "Provincia", "Corregimiento", "Membresia", "Descuento", "Asesor", "Creditos", "Promedio compras"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
            jTable1.getColumnModel().getColumn(10).setResizable(false);
            jTable1.getColumnModel().getColumn(11).setResizable(false);
            jTable1.getColumnModel().getColumn(12).setResizable(false);
            jTable1.getColumnModel().getColumn(13).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cliente VIP");

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Compras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cliente Ocasional");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cliente Frecuente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Productos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 102, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Conexión en archivo txt");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(183, 183, 183)
                .addComponent(jButton2)
                .addGap(35, 35, 35)
                .addComponent(jButton3)
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGap(43, 43, 43)
                .addComponent(jButton4)
                .addGap(43, 43, 43)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnaciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnaciActionPerformed

    private void fnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnombreActionPerformed

    private void fcorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fcorActionPerformed

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed

        String nombre = fnombre.getText();
        String cedula = fcedula.getText();
        String ciudad = fcity.getText();
        String correo = fcorreo.getText();
        String telefono = fphone.getText();
        String nacimiento = fnaci.getText();
        String provincia = fpro.getText();
        String corregimiento = fcor.getText();
        String membresia = fmembresia.getText();
        float descuento = Float.parseFloat(fdescuento.getText());
        String asesor = fasesor.getText();
        String creditos = fcreditos.getText();
        String sexo;
         if(bm.isSelected()==true){
            sexo ="M";
           }else if(bf.isSelected()==true){
             sexo="F";
             }else{
             sexo="M";
             }

        try{
            Connection con = Conexionn.getConnection();
             String sm = "SELECT round(AVG(precioestandar), 3) AS promedio_compras FROM Productos";
            PreparedStatement psPromedio = con.prepareStatement(sm);
            ResultSet rs = psPromedio.executeQuery();

            float promedioCompras = 0;
            if (rs.next()) {
                promedioCompras = rs.getFloat("promedio_compras");
            } else {
            }
            PreparedStatement ps = con.prepareStatement("Insert into ClienteVIP(cedula, nombre, ciudad, sexo, correo, telefono, nacimiento, provincia, corregimiento, membresia, descuento, asesor, creditos, promedio) values (?,?,?,?,?,?,?,?,?,?,?, ?, ?,?)");
            ps.setString(1, cedula);
            ps.setString(2, nombre);
            ps.setString(3, ciudad);
            ps.setString(4, sexo);
            ps.setString(5, correo);
            ps.setString(6, telefono);
            ps.setString(7, nacimiento);
            ps.setString(8, provincia);
            ps.setString(9, corregimiento);
            ps.setString(10, membresia);
            ps.setFloat(11, descuento);
            ps.setString(12, asesor);
            ps.setString(13, creditos);
            ps.setFloat(14, promedioCompras);

            ps.executeUpdate();
            
          
            JOptionPane.showMessageDialog(null, "Datos guardados");
            
            cargartabla();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
    
    }//GEN-LAST:event_bguardarActionPerformed

    private void beliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarActionPerformed

         String cedula = fcedula.getText();

        try{
            Connection con = Conexionn.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from clienteVIP where cedula = ?");
            ps.setString(1, cedula);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos eliminados");
            cargartabla();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_beliminarActionPerformed
public void limpiar(){
    fnombre.setText(null);
    fcedula.setText(null);
    fcity.setText(null);
    fcor.setText(null);
    fnaci.setText(null);
    fphone.setText(null);
    fpro.setText(null);
    fcorreo.setText(null);
    fmembresia.setText(null);
    fdescuento.setText(null);
    fasesor.setText(null);
    fcreditos.setText(null);

    }
    private void blimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blimpActionPerformed
        limpiar();
    }//GEN-LAST:event_blimpActionPerformed

    private void bmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodActionPerformed

         String nombre = fnombre.getText();
        String cedula = fcedula.getText();
        String ciudad = fcity.getText();
        String correo = fcorreo.getText();
        String telefono = fphone.getText();
        String nacimiento = fnaci.getText();
        String provincia = fpro.getText();
        String corregimiento = fcor.getText();
        String membresia = fmembresia.getText();
        float descuento = Float.parseFloat(fdescuento.getText());
        String asesor = fasesor.getText();
        String creditos = fcreditos.getText();
        String sexo;
          if(bm.isSelected()==true){
           sexo ="M";
             }else if(bf.isSelected()==true){
            sexo="F";
            }else{
            sexo="M";
            }

        try{
            Connection con = Conexionn.getConnection();
            PreparedStatement ps = con.prepareStatement("update ClienteVIP set nombre=?, ciudad=?, sexo=?, correo=?, telefono=?, nacimiento=?, provincia=?, corregimiento=?,membresia=?, descuento=?, asesor=?, creditos=? where cedula = ?");
            ps.setString(1, nombre);
            ps.setString(2, ciudad);
            ps.setString(3, sexo);
            ps.setString(4, correo);
            ps.setString(5, telefono);
            ps.setString(6, nacimiento);
            ps.setString(7, provincia);
            ps.setString(8, corregimiento);
            ps.setString(9, membresia);
            ps.setFloat(10, descuento);
            ps.setString(11, asesor);
            ps.setString(12, creditos);
            ps.setString(13, cedula);
            //ps.setFloat(12, p);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos modificados");
            cargartabla();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_bmodActionPerformed
public void cargartabla(){
        DefaultTableModel modelotabla= (DefaultTableModel) jTable1.getModel();
          modelotabla.setRowCount(0);
          PreparedStatement ps;
          ResultSet rs;
          ResultSetMetaData rsmd;
          int columnas;
          
          try{
               Connection con = Conexionn.getConnection();
               ps = con.prepareStatement("select cedula, nombre, ciudad, sexo, correo, telefono, nacimiento, provincia, corregimiento, membresia, descuento, asesor, creditos, promedio from clienteVIP");
               rs = ps.executeQuery();
               rsmd = rs.getMetaData();
               columnas = rsmd.getColumnCount();
               
               while(rs.next()){
                   Object [] fila = new Object[columnas];
                   for(int indice = 0; indice<columnas;indice++){
                       fila[indice] = rs.getObject(indice + 1);
                   }
                   modelotabla.addRow(fila);
               }
              
         }catch(SQLException e){
            
          JOptionPane.showMessageDialog(null, e.toString());

        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Jframecompras jfc = new Jframecompras();
        jfc.show(); 
        dispose();    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     Jframep2 jf2 = new Jframep2();
            jf2.show();
            dispose();    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     Jframeproductos jfp = new Jframeproductos();
       jfp.show();
       dispose();    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Jframep jf = new Jframep();
            jf.show();
            dispose();    }//GEN-LAST:event_jButton2ActionPerformed

    private void fdescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fdescuentoActionPerformed

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
try{
           int fila = jTable1.getSelectedRow();
          String cedula = jTable1.getValueAt(fila, 0).toString();
            Connection con = Conexionn.getConnection();
              PreparedStatement ps;
              ResultSet rs;
              ps = con.prepareStatement("select cedula, nombre, ciudad,sexo, correo, telefono, nacimiento, provincia, corregimiento, membresia, descuento, asesor, creditos from clienteVIP where cedula = ?");
              ps.setString(1, cedula);
              rs =ps.executeQuery();
              
              while(rs.next()){
                  fcedula.setText(rs.getString("cedula"));
                  fnombre.setText(rs.getString("nombre"));
                  fcity.setText(rs.getString("ciudad"));
                  fcorreo.setText(rs.getString("correo"));
                  fphone.setText(rs.getString("telefono"));
                  fnaci.setText(rs.getString("nacimiento"));
                  fpro.setText(rs.getString("provincia"));
                  fcor.setText(rs.getString("corregimiento"));
                  fmembresia.setText(rs.getString("membresia"));
                  fdescuento.setText(rs.getString("descuento"));
                  fasesor.setText(rs.getString("asesor"));
                  fcreditos.setText(rs.getString("creditos"));

                  if(rs.getString("sexo").equals("M")){
                  bm.setSelected(true);    
                  }else if(rs.getString("sexo").equals("F")){
                    bf.setSelected(true); 
                  }
              }
           }catch(SQLException e){
            
          JOptionPane.showMessageDialog(null, e.toString());
                   
                
    }             
     }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   archivotxt();
    }//GEN-LAST:event_jButton5ActionPerformed
public void archivotxt() {
   Properties props = new Properties();
        props.setProperty("db.url", "jdbc:sqlserver://localhost:1433;databaseName=java;encrypt=true;trustServerCertificate=true;");
        props.setProperty("db.user", "sa");
        props.setProperty("db.password", "123");


        try (FileWriter fileWriter = new FileWriter("config.txt")) {
            props.store(fileWriter, "Configuración de la base de datos");
            System.out.println("Configuración guardada en config.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
}








    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jframep3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframep3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframep3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframep3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframep3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beliminar;
    private javax.swing.JRadioButton bf;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton blimp;
    private javax.swing.JRadioButton bm;
    private javax.swing.JButton bmod;
    private javax.swing.JTextField fasesor;
    private javax.swing.JTextField fcedula;
    private javax.swing.JTextField fcity;
    private javax.swing.JTextField fcor;
    private javax.swing.JTextField fcorreo;
    private javax.swing.JTextField fcreditos;
    private javax.swing.JTextField fdescuento;
    private javax.swing.JTextField fmembresia;
    private javax.swing.JTextField fnaci;
    private javax.swing.JTextField fnombre;
    private javax.swing.JTextField fphone;
    private javax.swing.JTextField fpro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel textasesor;
    private javax.swing.JLabel textcedula;
    private javax.swing.JLabel textcity;
    private javax.swing.JLabel textcor;
    private javax.swing.JLabel textcorreo;
    private javax.swing.JLabel textcreditos;
    private javax.swing.JLabel textdescuento;
    private javax.swing.JLabel textgen;
    private javax.swing.JLabel textmembresia;
    private javax.swing.JLabel textnaci;
    private javax.swing.JLabel textnombre;
    private javax.swing.JLabel textphone;
    private javax.swing.JLabel textpro;
    // End of variables declaration//GEN-END:variables
}
