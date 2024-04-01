/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Teka
 */

import studentmanagement.StudentManagement;
import studentmanagement.Student;
public class UpdateFrame extends javax.swing.JFrame {
    StudentManagement studentmanagement;
    private Student students;
    /**
     * Creates new form UpdateFrame
     */
    public UpdateFrame(int sid) {
        studentmanagement = new StudentManagement();
        studentmanagement.loadFromFile();
        students = studentmanagement.getStudentById(sid);
        
        System.out.println(students);
        
        initComponents();
        
        if(students != null)
        {
            sidText.setText(String.valueOf(students.getSid()));
            FNameText.setText(students.getFirstName());
            LNameText.setText(students.getLastName());
            MajorText.setText(students.getMajor());
            GpaText.setText(String.valueOf(students.getGpa()));
        }
        else
        {
            System.out.println("this.students is null");
        }
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GpaLable = new javax.swing.JLabel();
        FNameText = new javax.swing.JTextField();
        LNameText = new javax.swing.JTextField();
        HeaderLable = new javax.swing.JLabel();
        MajorText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        GpaText = new javax.swing.JTextField();
        SubmidButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        FNameLable = new javax.swing.JLabel();
        SidLable = new javax.swing.JLabel();
        LNameLable = new javax.swing.JLabel();
        MajorLable = new javax.swing.JLabel();
        sidText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        GpaLable.setText("Gpa");

        FNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameTextActionPerformed(evt);
            }
        });

        LNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameTextActionPerformed(evt);
            }
        });

        HeaderLable.setText("Update Student by SID");

        MajorText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MajorTextActionPerformed(evt);
            }
        });

        GpaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GpaTextActionPerformed(evt);
            }
        });

        SubmidButton.setText("Submit");
        SubmidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmidButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        FNameLable.setText("First Name");

        SidLable.setText("Sid");

        LNameLable.setText("Last Name");

        MajorLable.setText("Major");

        sidText.setEditable(false);
        sidText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(HeaderLable))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LNameLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FNameLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MajorLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GpaLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SidLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(MajorText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LNameText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidText)
                    .addComponent(FNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(GpaText)))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(CancelButton)
                .addGap(151, 151, 151)
                .addComponent(SubmidButton))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(HeaderLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SidLable, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FNameLable)
                    .addComponent(FNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LNameLable)
                    .addComponent(LNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MajorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MajorLable))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GpaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GpaLable))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(SubmidButton))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameTextActionPerformed

    private void LNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNameTextActionPerformed

    private void MajorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MajorTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MajorTextActionPerformed

    private void GpaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GpaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GpaTextActionPerformed

    private void SubmidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmidButtonActionPerformed

       students.setFirstName(FNameText.getText());
       students.setLastName(LNameText.getText());
       students.setMajor(MajorText.getText());
       students.setGpa(Float.parseFloat(GpaText.getText()));
       studentmanagement.updateStudent(students);
       studentmanagement.saveToFile();
        new MainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SubmidButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        new MainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void sidTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel FNameLable;
    private javax.swing.JTextField FNameText;
    private javax.swing.JLabel GpaLable;
    private javax.swing.JTextField GpaText;
    private javax.swing.JLabel HeaderLable;
    private javax.swing.JLabel LNameLable;
    private javax.swing.JTextField LNameText;
    private javax.swing.JLabel MajorLable;
    private javax.swing.JTextField MajorText;
    private javax.swing.JLabel SidLable;
    private javax.swing.JButton SubmidButton;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField sidText;
    // End of variables declaration//GEN-END:variables
}
