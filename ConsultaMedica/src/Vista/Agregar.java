package Vista;

import Controlador.Registro;

import Modelo.Paciente;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Agregar extends javax.swing.JFrame {

    public Agregar() {
        initComponents();
        this.setTitle("Agregar Paciente");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSlider1 = new javax.swing.JSlider();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Rut = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Masculino = new javax.swing.JRadioButton();
        Femenino = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        Edad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        Ciudad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        isapreSi = new javax.swing.JRadioButton();
        isapreNo = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        Donante = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Rut:");

        jLabel2.setText("Nombre:");

        Rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RutActionPerformed(evt);
            }
        });
        Rut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RutKeyTyped(evt);
            }
        });

        jLabel3.setText("Genero:");

        buttonGroup1.add(Masculino);
        Masculino.setText("Masculino");
        Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasculinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(Femenino);
        Femenino.setText("Femenino");
        Femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemeninoActionPerformed(evt);
            }
        });

        jLabel4.setText("Edad:");

        jLabel5.setText("Dirección:");

        Ciudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciudad", "Viña del Mar", "Santiago", "Rancagua", "Quilpué", "Valparaíso", "Villa Alemana", "Con Con", "Iquique", "Coquimbo", "Puerto Montt", "Chiloé", " " }));
        Ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadActionPerformed(evt);
            }
        });

        jLabel6.setText("Ciudad:");

        jLabel7.setText("Isapre:");

        buttonGroup2.add(isapreSi);
        isapreSi.setText("Si");

        buttonGroup2.add(isapreNo);
        isapreNo.setText("No");

        jLabel8.setText("Donante:");

        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isapreSi)
                                .addGap(18, 18, 18)
                                .addComponent(isapreNo))
                            .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Donante)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Rut, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Masculino, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Femenino))
                                    .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Direccion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Masculino, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Femenino)
                    .addComponent(jButton3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(isapreSi)
                    .addComponent(isapreNo))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Donante))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RutActionPerformed

    private void FemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemeninoActionPerformed

    private void CiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CiudadActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Rut.setText("");
        Nombre.setText("");

        if (Masculino.isSelected()) {
            Masculino.setSelected(false);
        }

        if (Femenino.isSelected()) {
            Femenino.setSelected(false);

        }

        buttonGroup1.clearSelection();
        buttonGroup1.setSelected(null, false);
        buttonGroup1.setSelected(Masculino.getModel(), false);
        buttonGroup1.setSelected(Femenino.getModel(), false);

        if (isapreSi.isSelected()) {
            isapreSi.setSelected(false);
        }

        if (isapreNo.isSelected()) {
            isapreNo.setSelected(false);
        }
        buttonGroup2.clearSelection();
        buttonGroup2.setSelected(null, false);
        buttonGroup2.setSelected(isapreSi.getModel(), false);
        buttonGroup2.setSelected(isapreNo.getModel(), false);
        Direccion.setText("");

        Donante.setText("");
        Edad.setText("");
        Ciudad.setSelectedIndex(0);
        if (Donante.isSelected()) {
            Donante.setSelected(false);

    }//GEN-LAST:event_jButton2ActionPerformed
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Paciente p = new Paciente();
        Registro r = new Registro();
        if (Rut.getText().isEmpty() || Nombre.getText().isEmpty()
                || (!Masculino.isSelected() && !Femenino.isSelected())
                || Edad.getText().isEmpty() || Direccion.getText().isEmpty()
                || (!isapreSi.isSelected() && !isapreNo.isSelected())
                || Ciudad.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "RELLENE TODOS LOS CAMPOS.");
        } else {
//           
            if (r.existeRut(Rut.getText()) == 0) {

                p.setRut(Rut.getText());
                p.setNombre(Nombre.getText());
                if (Femenino.isSelected()) {
                    p.setGenero("Femenino");
                } else if (Masculino.isSelected()) {
                    p.setGenero("Masculino");
                }
                p.setEdad(Integer.parseInt(Edad.getText()));
                if (Donante.isSelected()) {
                    p.setDonante("Si");
                } else {
                    p.setDonante("No");
                }
                p.setDireccion(Direccion.getText());
                p.setCiudad(Ciudad.getSelectedItem().toString());
                if (isapreSi.isSelected()) {
                    p.setIsapre("Si");
                } else if (isapreNo.isSelected()) {
                    p.setIsapre("No");
                }
                r.Registrar(p.getRut(), p.getNombre(), p.getGenero(), p.getEdad(), p.getDireccion(), p.getCiudad(), p.getIsapre(), p.getDonante());
                JOptionPane.showMessageDialog(null, "GUARDADO");
            } else {
                JOptionPane.showMessageDialog(null, "EL RUT YA EXISTE.");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MasculinoActionPerformed

    private void RutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RutKeyTyped
    char c = evt.getKeyChar();

    
    if (!Character.isDigit(c) && c != 'k' && c != 'K' && c != '.' && c != '-' && c != KeyEvent.VK_BACK_SPACE) {
        evt.consume(); 
    }

   
   


    }//GEN-LAST:event_RutKeyTyped




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ciudad;
    private javax.swing.JTextField Direccion;
    private javax.swing.JCheckBox Donante;
    private javax.swing.JTextField Edad;
    private javax.swing.JRadioButton Femenino;
    private javax.swing.JRadioButton Masculino;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Rut;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton isapreNo;
    private javax.swing.JRadioButton isapreSi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
