
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author NIRAV
 */
public class NewJFrameMain extends javax.swing.JFrame {
      ImageIcon profilePicture;
    /**
     * Creates new form NewJFrameMain
     */
    public NewJFrameMain() {
        initComponents();
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
        jPanelMain = new javax.swing.JPanel();
        jLabelHeading = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelGender = new javax.swing.JLabel();
        jRadioBtnFemale = new javax.swing.JRadioButton();
        jRadioBtnMale = new javax.swing.JRadioButton();
        jRadioBtnNottoSay = new javax.swing.JRadioButton();
        jLabelAge = new javax.swing.JLabel();
        jLabelPhoneNo = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jTextFieldPhoneNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonSubmit = new javax.swing.JButton();
        imgjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMain.setBackground(new java.awt.Color(204, 204, 255));

        jLabelHeading.setBackground(new java.awt.Color(0, 0, 0));
        jLabelHeading.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelHeading.setText("USER PROFILE");

        jLabelFirstName.setText("First Name");

        jLabelLastName.setText("Last Name");

        jTextFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastNameActionPerformed(evt);
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

        jLabelAge.setText("Age");

        jLabelPhoneNo.setText("Phone No.");

        jTextFieldAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAgeActionPerformed(evt);
            }
        });

        jTextFieldPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneNoActionPerformed(evt);
            }
        });

        jLabel1.setText("Email");

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLastName)
                    .addComponent(jLabelFirstName)
                    .addComponent(jLabelGender)
                    .addComponent(jLabelAge)
                    .addComponent(jLabelPhoneNo)
                    .addComponent(jLabel1))
                .addGap(88, 88, 88)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jLabelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 104, Short.MAX_VALUE)
                        .addGap(283, 283, 283))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldLastName)
                                .addComponent(jTextFieldAge, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldPhoneNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(jRadioBtnNottoSay, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioBtnMale, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioBtnFemale, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addComponent(jButtonSubmit)
                                .addGap(192, 192, 192)
                                .addComponent(imgjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabelHeading)
                .addGap(35, 35, 35)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(jRadioBtnFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioBtnMale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioBtnNottoSay)
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAge)
                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelPhoneNo))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(imgjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButtonSubmit)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBtnFemaleActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        try{
       
          String firstName=this.jTextFieldFirstName.getText();
          String lastName=this.jTextFieldLastName.getText();
            String gender=this.buttonGroupGender.getSelection().getActionCommand();
            String age=this.jTextFieldAge.getText();     
            String phoneNumber=this.jTextFieldPhoneNo.getText();
                 String email=this.jTextFieldEmail.getText();
                 
                  // Check if any field is empty
        if (firstName.isEmpty() || lastName.isEmpty() || gender.isEmpty() ||
            age.isEmpty() || phoneNumber.isEmpty() || email.isEmpty()) {
            String errorMessage = "All fields must be filled out.";
            JOptionPane.showMessageDialog(this, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Validate age (must be an integer)
            try {
                int ageInt = Integer.parseInt(age);
                if (ageInt < 0) {
                    throw new NumberFormatException("Age cannot be negative.");
                }
            } catch (NumberFormatException ne) {
                String errorMessage = "Please enter a valid age.";
                JOptionPane.showMessageDialog(this, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if age is invalid
            }

            // Validate phone number (must be 10 digits)
            if (!phoneNumber.matches("\\d{10}")) {
                String errorMessage = "Please enter a valid 10-digit phone number.";
                JOptionPane.showMessageDialog(this, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if phone number is invalid
            }
            
            
             String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            if (!email.matches(emailRegex)) {
                String errorMessage = "Please enter a valid email address.";
                JOptionPane.showMessageDialog(this, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if email is invalid
            }
            // Display success message with the collected data
            String displayMessage = firstName + " " + lastName + " is " + age + " years old, and the phone number is " + phoneNumber + 
                                    ". The email address is " + email + " and is " + gender + ".";
            JOptionPane.showMessageDialog(this, displayMessage);
         
        
        
       
            System.out.println(this.jTextFieldFirstName.getText());
            System.out.println(this.jTextFieldLastName.getText());
             System.out.println(this.buttonGroupGender.getSelection().getActionCommand());
              System.out.println(this.jTextFieldAge.getText());
               System.out.println(this.jTextFieldPhoneNo.getText());
                System.out.println(this.jTextFieldEmail.getText());
                //JOptionPane.showMessageDialog(this,displayMessage );
                
        }}
       catch(NullPointerException ne){
            String errorMessage="All field should be filled";
            JOptionPane.showMessageDialog(this,errorMessage );
       }
        catch(Exception e){
            System.out.println("Exception has occured");
            System.out.println(e);
        }
       
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jTextFieldPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNoActionPerformed
        // TODO add your handling code here:
       if(this.jTextFieldPhoneNo.getText().length()>10){
             System.out.println("phone number should be of 10 digits");
        }
           
    }//GEN-LAST:event_jTextFieldPhoneNoActionPerformed

    private void jTextFieldAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAgeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldAgeActionPerformed

    private void jTextFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastNameActionPerformed
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
            java.util.logging.Logger.getLogger(NewJFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JLabel imgjLabel;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelHeading;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelPhoneNo;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JRadioButton jRadioBtnFemale;
    private javax.swing.JRadioButton jRadioBtnMale;
    private javax.swing.JRadioButton jRadioBtnNottoSay;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPhoneNo;
    // End of variables declaration//GEN-END:variables
}
