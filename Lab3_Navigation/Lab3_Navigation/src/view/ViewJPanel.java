/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Patient;

/**
 *
 * @author NIRAV
 */
public class ViewJPanel extends javax.swing.JPanel {
    ImageIcon profilePicture;
    Patient p1;
    

    /**
     * Creates new form FormJPanel
     */
    public ViewJPanel() {
        initComponents();
        disableALL();
    }
    public ViewJPanel(Patient p1){
        this.p1=p1;
        initComponents();
        populateData();
        disableALL();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanelMain = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelGender = new javax.swing.JLabel();
        jRadioBtnFemale = new javax.swing.JRadioButton();
        jRadioBtnMale = new javax.swing.JRadioButton();
        jRadioBtnNottoSay = new javax.swing.JRadioButton();
        ImagejLabel = new javax.swing.JLabel();
        ImgjLabel = new javax.swing.JLabel();
        PatientTypejComboBox = new javax.swing.JComboBox<>();
        PatientTypejLabel = new javax.swing.JLabel();
        jButtonSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelAge = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jLabelMessage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMessage = new javax.swing.JTextArea();
        jLabelHeading = new javax.swing.JLabel();

        jPanelMain.setBackground(new java.awt.Color(255, 204, 204));

        jLabelName.setText("Name");

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jLabelGender.setText("Gender");

        buttonGroupGender.add(jRadioBtnFemale);
        jRadioBtnFemale.setText("Female");
        jRadioBtnFemale.setActionCommand("FEMALE");
        jRadioBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnFemaleActionPerformed(evt);
            }
        });

        buttonGroupGender.add(jRadioBtnMale);
        jRadioBtnMale.setText("Male");
        jRadioBtnMale.setActionCommand("MALE");

        buttonGroupGender.add(jRadioBtnNottoSay);
        jRadioBtnNottoSay.setText("Preferred not to say");
        jRadioBtnNottoSay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnNottoSayActionPerformed(evt);
            }
        });

        ImagejLabel.setText("Select Image");

        PatientTypejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appointment", "Walk-in" }));
        PatientTypejComboBox.setSelectedIndex(-1);
        PatientTypejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientTypejComboBoxActionPerformed(evt);
            }
        });

        PatientTypejLabel.setText("Patient Type");

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jLabel1.setText("Email");

        jLabelAge.setText("Age");

        jLabelMessage.setText("Message");

        jTextAreaMessage.setColumns(20);
        jTextAreaMessage.setRows(5);
        jScrollPane2.setViewportView(jTextAreaMessage);

        jLabelHeading.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelHeading.setText("Patient Registration Form ");

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelName)
                            .addComponent(jLabelGender))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PatientTypejLabel)
                            .addComponent(ImagejLabel)
                            .addComponent(jLabel1)
                            .addComponent(jLabelAge)
                            .addComponent(jLabelMessage))
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PatientTypejComboBox, 0, 139, Short.MAX_VALUE)
                                        .addComponent(jTextFieldEmail))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioBtnFemale)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioBtnMale)
                                        .addComponent(jRadioBtnNottoSay))
                                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(ImgjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 204, Short.MAX_VALUE))))
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jButtonSubmit)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHeading)
                .addGap(159, 159, 159))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(jLabelHeading)
                .addGap(8, 8, 8)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(jRadioBtnFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jRadioBtnMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioBtnNottoSay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PatientTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PatientTypejLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagejLabel)
                    .addComponent(ImgjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAge)
                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMessage)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButtonSubmit))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBtnFemaleActionPerformed

    private void jRadioBtnNottoSayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnNottoSayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBtnNottoSayActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void PatientTypejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientTypejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientTypejComboBoxActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        try{

            String Name=this.jTextFieldName.getText();

            String gender=this.buttonGroupGender.getSelection().getActionCommand();
            String patientType =  this.PatientTypejComboBox.getSelectedItem().toString();
            String email =this.jTextFieldEmail.getText();
            String age=this.jTextFieldAge.getText();
            String message=this.jTextAreaMessage.getText();
            String displayMessage;

            if(Name.equals("") || patientType.equals("")|| email.equals("") || age.equals("") || message.equals("")){
                displayMessage = "you forgot to enter name or patientTYPE  or email or age or message";
            }
            else{
                displayMessage = Name + " "+ gender + " " + patientType +""+ email +" "+ age+ " "+ message;
            }
            // Check if any field is empty

            System.out.println(this.jTextFieldName.getText());

            System.out.println(this.buttonGroupGender.getSelection().getActionCommand());

            JOptionPane.showMessageDialog(this,displayMessage,"Success",HEIGHT,this.profilePicture );
            Patient p1 = new Patient();
            p1.setName(Name);
            p1.setGender(gender);
            p1.setEmail(email);
            p1.setAge(age);
            p1.setPatientType(patientType);
            p1.setProfilePicture(profilePicture);

//            ViewJPanel newViewJPanel = new ViewJPanel(p1);
//            this.bottomjPanel.add(newViewJPanel);
//            CardLayout layout= (CardLayout)this.bottomjPanel.getLayout();
//            layout.next(bottomjPanel);
        }
        catch(NullPointerException ne){
            String errorMessage="All field should be filled";
            JOptionPane.showMessageDialog(this,errorMessage );
        }
        catch(Exception e){
            System.out.println("Exception has occured");
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed
     private void populateData(){
         this.jTextFieldName.setText(p1.getName());
         this.jTextFieldEmail.setText(p1.getEmail());
         this.jTextFieldAge.setText(p1.getAge());
         this.jTextAreaMessage.setText(p1.getMessage());
         String gender = p1.getGender();
         
         if(gender.equals("MALE")){
         this.buttonGroupGender.setSelected( this.jRadioBtnMale.getModel(),true);    
           }else if(gender.equals("FEMALE")){
         this.buttonGroupGender.setSelected( this.jRadioBtnFemale.getModel(),true);    
           }
          else
           {
           this.buttonGroupGender.setSelected( this.jRadioBtnNottoSay.getModel(),true);
     
           }
         this.PatientTypejComboBox.setSelectedItem(p1.getPatientType());
         this.ImgjLabel.setIcon(p1.getProfilePicture());
       
         
         
         
     }
     
     public void disableALL(){
           this.jTextFieldName.setEnabled(false);
         
         this.jRadioBtnFemale.setEnabled(false);
         this.jRadioBtnMale.setEnabled(false);
         this.jRadioBtnNottoSay.setEnabled(false);
         this.PatientTypejComboBox.setEnabled(false);
         this.jButtonSubmit.setVisible(false);
         this.jTextFieldEmail.setEnabled(false);
         this.jTextFieldAge.setEnabled(false);
         this.jTextAreaMessage.setEnabled(false);
         
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagejLabel;
    private javax.swing.JLabel ImgjLabel;
    private javax.swing.JComboBox<String> PatientTypejComboBox;
    private javax.swing.JLabel PatientTypejLabel;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelHeading;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JRadioButton jRadioBtnFemale;
    private javax.swing.JRadioButton jRadioBtnMale;
    private javax.swing.JRadioButton jRadioBtnNottoSay;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaMessage;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    
}
