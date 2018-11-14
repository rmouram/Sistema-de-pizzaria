/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import codes.ManipulacaoArquivos;
import codes.NegativeValueException;
import codes.Pizza;
import codes.Pizzaria;
import codes.SoNumeros;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author romulo
 */
public class TelaAdmAlterar extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaAdmCadastrar
     */
    public TelaAdmAlterar() {
        initComponents();
        tf_AdmAlt_Preço.setDocument(new SoNumeros());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Label_AdmAlterar_Tipo = new javax.swing.JLabel();
        Label_AdmAlterar_Sabor2 = new javax.swing.JLabel();
        Label_AdmAlterar_Preço = new javax.swing.JLabel();
        tf_AdmAlt_Preço = new javax.swing.JTextField();
        tf_AdmAlt_Sabor2 = new javax.swing.JTextField();
        btn_AdmAlt_Finalizar = new javax.swing.JButton();
        btn_AdmAlt_Limpar = new javax.swing.JButton();
        btn_AdmAlt_Buscar = new javax.swing.JButton();
        Label_AdmAlterar_Sabor = new javax.swing.JLabel();
        tf_AdmAlt_Sabor1 = new javax.swing.JTextField();
        tf_AdmAlt_Tipo = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);
        setTitle("Alterar Pizzas");

        Label_AdmAlterar_Tipo.setText("Tipo:");

        Label_AdmAlterar_Sabor2.setText("Sabor:");

        Label_AdmAlterar_Preço.setText("Preço:");

        tf_AdmAlt_Preço.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btn_AdmAlt_Finalizar.setText("Finalizar");
        btn_AdmAlt_Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdmAlt_FinalizarActionPerformed(evt);
            }
        });

        btn_AdmAlt_Limpar.setText("Limpar");
        btn_AdmAlt_Limpar.setPreferredSize(new java.awt.Dimension(68, 30));
        btn_AdmAlt_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdmAlt_LimparActionPerformed(evt);
            }
        });

        btn_AdmAlt_Buscar.setText("Buscar");
        btn_AdmAlt_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdmAlt_BuscarActionPerformed(evt);
            }
        });

        Label_AdmAlterar_Sabor.setText("Sabor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_AdmAlt_Finalizar)
                            .addGap(18, 18, 18)
                            .addComponent(btn_AdmAlt_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Label_AdmAlterar_Preço)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_AdmAlt_Preço, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Label_AdmAlterar_Sabor2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Label_AdmAlterar_Tipo))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_AdmAlt_Sabor2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_AdmAlt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_AdmAlterar_Sabor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_AdmAlt_Buscar)
                                .addGap(121, 121, 121))
                            .addComponent(tf_AdmAlt_Sabor1))))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_AdmAlterar_Sabor)
                    .addComponent(tf_AdmAlt_Sabor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_AdmAlt_Buscar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_AdmAlterar_Tipo)
                    .addComponent(tf_AdmAlt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_AdmAlterar_Sabor2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_AdmAlt_Sabor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_AdmAlt_Preço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_AdmAlterar_Preço))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AdmAlt_Finalizar)
                    .addComponent(btn_AdmAlt_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AdmAlt_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdmAlt_BuscarActionPerformed
        Pizzaria p = new Pizzaria();
        
        Pizza b = p.buscar(tf_AdmAlt_Sabor1.getText());
        if(b!=null){
            tf_AdmAlt_Tipo.setText(b.getTipo());
            tf_AdmAlt_Sabor2.setText(b.getSabor());
            Integer i = b.getPreço();
            // convertendo o preço(Integer) em string para exibir no jTextField
            String preço = (new Integer(i)).toString();
            tf_AdmAlt_Preço.setText(preço);
        }else{
            JOptionPane.showMessageDialog(null, "Sabor não encontrado","Aviso ao usuário", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_AdmAlt_BuscarActionPerformed

    private void btn_AdmAlt_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdmAlt_LimparActionPerformed
        tf_AdmAlt_Sabor1.setText("");
        tf_AdmAlt_Tipo.setText("");
        tf_AdmAlt_Sabor2.setText("");
        tf_AdmAlt_Preço.setText("");
    }//GEN-LAST:event_btn_AdmAlt_LimparActionPerformed

    private void btn_AdmAlt_FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdmAlt_FinalizarActionPerformed
        Pizzaria p = new Pizzaria();
        ManipulacaoArquivos i = new ManipulacaoArquivos();
        Pizza b = p.buscar(tf_AdmAlt_Sabor1.getText());
        Integer preço = Integer.valueOf(tf_AdmAlt_Preço.getText());
        
        if(b!=null){
            //Integer preço = Integer.valueOf(tf_AdmAlt_Preço.getText());
            p.alterarPizzas(tf_AdmAlt_Tipo.getText(),tf_AdmAlt_Sabor2.getText(), preço);
            p.gravarPizzasObjeto();

            tf_AdmAlt_Sabor1.setText("");
            tf_AdmAlt_Tipo.setText("");
            tf_AdmAlt_Sabor2.setText("");
            tf_AdmAlt_Preço.setText("");
            JOptionPane.showMessageDialog(null, "Alterada com sucesso:D");
        }else
            JOptionPane.showMessageDialog(null, "Altere a pizza");
    }//GEN-LAST:event_btn_AdmAlt_FinalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_AdmAlterar_Preço;
    private javax.swing.JLabel Label_AdmAlterar_Sabor;
    private javax.swing.JLabel Label_AdmAlterar_Sabor2;
    private javax.swing.JLabel Label_AdmAlterar_Tipo;
    private javax.swing.JButton btn_AdmAlt_Buscar;
    private javax.swing.JButton btn_AdmAlt_Finalizar;
    private javax.swing.JButton btn_AdmAlt_Limpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_AdmAlt_Preço;
    private javax.swing.JTextField tf_AdmAlt_Sabor1;
    private javax.swing.JTextField tf_AdmAlt_Sabor2;
    private javax.swing.JTextField tf_AdmAlt_Tipo;
    // End of variables declaration//GEN-END:variables
}