/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citas;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sayad
 */
public class Controlador extends javax.swing.JFrame {
    int SizeD = 0;
    int SizeP = 0;
    int SizeC = 0;
    
    Doctor[] Doctores = new Doctor[500];
    Paciente[] Pacientes = new Paciente[5000];
    Cita[] Citas = new Cita[5000];
    
    /**
     * Creates new form AddDoctor
     */
    public Controlador() {
        initComponents();
    }
    
    public Controlador(String User){
        initComponents();
        Bienvenido.setText("Bienvenido: " + User);
    }
    
    public Controlador(int SizeD, Doctor[] Doctores, int SizeP, Paciente[] Pacientes, int SizeC, Cita[] Citas){
        initComponents();
        this.Doctores = Doctores;
        this.Pacientes = Pacientes;
        this.Citas = Citas;
        this.SizeD = SizeD;
        this.SizeP = SizeP;
        this.SizeC = SizeC;
        

        for(int i = 0; i<SizeD; i++){
            DoctoresList.addItem(String.valueOf(Doctores[i].GetId())+ ". " + Doctores[i].GetName());
        }
        
        for(int i = 0; i<SizeP; i++){
            PacientesList.addItem(String.valueOf(Pacientes[i].GetId())+ ". " + Pacientes[i].GetName());
        }
        
        for(int i = 0; i<SizeC; i++){
            CitasList.addItem(String.valueOf(Citas[i].getId())+ ". " + Citas[i].getMotivo());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bienvenido = new javax.swing.JLabel();
        Crear = new javax.swing.JButton();
        AddDoctor = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddPacient = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Consultar = new javax.swing.JButton();
        Motivo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Fecha = new org.jdesktop.swingx.JXDatePicker();
        PacientesList = new javax.swing.JComboBox<>();
        DoctoresList = new javax.swing.JComboBox<>();
        CitasList = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bienvenido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Bienvenido.setText("Bienvenido: Usuario!");

        Crear.setText("Crear Cita");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        AddDoctor.setText("+");
        AddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDoctorActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label1.setText("Consultar Citas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Crear cita");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Paciente: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Doctor: ");

        AddPacient.setText("+");
        AddPacient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPacientActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Fecha: ");

        Consultar.setText("Consultar Cita");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        Motivo.setText("Pierna Rota");
        Motivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotivoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Motivo de la cita");

        CitasList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitasListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bienvenido)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CitasList, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Consultar))
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PacientesList, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(AddPacient)
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(DoctoresList, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AddDoctor))))
                                    .addComponent(Motivo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)
                            .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Bienvenido)
                .addGap(18, 18, 18)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consultar)
                    .addComponent(CitasList, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddDoctor)
                    .addComponent(PacientesList, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DoctoresList, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddPacient))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Motivo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        // TODO add your handling code here:
        System.out.println(PacientesList.getItemCount());
        
        Cita NewCita = new Cita(SizeC+1, Fecha.getDate(), Motivo.getText(), PacientesList.getSelectedIndex(), DoctoresList.getSelectedIndex());
        
        Citas[SizeC] = NewCita;
        SizeC+=1;
        
        Controlador Control = new Controlador(SizeD, this.Doctores, SizeP, this.Pacientes, this.SizeC, this.Citas);
        Control.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CrearActionPerformed

    private void MotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MotivoActionPerformed

    private void CitasListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitasListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CitasListActionPerformed

    private void AddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDoctorActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AddDoctor Doctor = new AddDoctor(SizeD, Doctores, SizeP, Pacientes, SizeC, Citas);
        Doctor.setVisible(true);
  
    }//GEN-LAST:event_AddDoctorActionPerformed

    private void AddPacientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPacientActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AddPacient Pacient = new AddPacient(SizeD, Doctores, SizeP, Pacientes, SizeC, Citas);
        Pacient.setVisible(true);
  
    }//GEN-LAST:event_AddPacientActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        // TODO add your handling code here:
        int Actual = CitasList.getSelectedIndex();
        int idP = Citas[Actual].getPaciente();
        int idD = Citas[Actual].getDoctor();
        this.PacientesList.setSelectedIndex(idP);
        this.DoctoresList.setSelectedIndex(idD);
        Fecha.setDate(Citas[Actual].getFecha());
        Motivo.setText(Citas[Actual].getMotivo());
 
    }//GEN-LAST:event_ConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(Controlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controlador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDoctor;
    private javax.swing.JButton AddPacient;
    private javax.swing.JLabel Bienvenido;
    private javax.swing.JComboBox<String> CitasList;
    private javax.swing.JButton Consultar;
    private javax.swing.JButton Crear;
    private javax.swing.JComboBox<String> DoctoresList;
    private org.jdesktop.swingx.JXDatePicker Fecha;
    private javax.swing.JTextField Motivo;
    private javax.swing.JComboBox<String> PacientesList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
