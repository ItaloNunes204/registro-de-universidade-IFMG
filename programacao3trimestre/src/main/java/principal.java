import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cliente
 */
public class principal extends javax.swing.JFrame {
    ArrayList<Tecnico> listaTec=new ArrayList();
    ArrayList<Aluno> listaAluno=new ArrayList();
    ArrayList<Funcionario> listaFunci=new ArrayList();
    ArrayList<Professor> listaPro=new ArrayList();
    ArrayList<Curso> listaCurso = new ArrayList();
    ArrayList<Diciplinas> listaDic = new ArrayList();

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }

    public principal(ArrayList<Aluno> listaAlun, ArrayList<Tecnico> listaTecn, 
    ArrayList<Funcionario> listaFunc, ArrayList<Professor> listaProf,
    ArrayList<Curso> listaCursop,ArrayList<Diciplinas> listaDici) {
        initComponents();
        listaAluno=listaAlun;
        listaTec=listaTecn;
        listaFunci=listaFunc;
        listaPro=listaProf;
        listaCurso=listaCursop;
        listaDic=listaDici;
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
        alunoj = new javax.swing.JLabel();
        aluno = new javax.swing.JButton();
        funcionarioj = new javax.swing.JLabel();
        funcio = new javax.swing.JButton();
        cursoj = new javax.swing.JLabel();
        curso = new javax.swing.JButton();
        diciplinaj = new javax.swing.JLabel();
        dici = new javax.swing.JButton();
        mostraAJ = new javax.swing.JLabel();
        mostrafunj = new javax.swing.JLabel();
        mostraCursoj = new javax.swing.JLabel();
        mostraDiciplinaj = new javax.swing.JLabel();
        listaAlun = new javax.swing.JButton();
        listaFunc = new javax.swing.JButton();
        listaCurs = new javax.swing.JButton();
        entraDici = new javax.swing.JButton();
        mostraTecj = new javax.swing.JLabel();
        tecnico = new javax.swing.JButton();
        mostraProfej = new javax.swing.JLabel();
        professor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alunoj.setText("fazer cadastro de alunos ");

        aluno.setText("entra");
        aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoActionPerformed(evt);
            }
        });

        funcionarioj.setText("fazer cadastro de funcionarios");

        funcio.setText("entra");
        funcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcioActionPerformed(evt);
            }
        });

        cursoj.setText("fazer cadastro curso");

        curso.setText("entra");
        curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoActionPerformed(evt);
            }
        });

        diciplinaj.setText("fazer cadastro diciplina");

        dici.setText("entra");
        dici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diciActionPerformed(evt);
            }
        });

        mostraAJ.setText("mostra lista de alunos");

        mostrafunj.setText("mostra lista de funcionario");

        mostraCursoj.setText("mostra lista de cursos");

        mostraDiciplinaj.setText("mostra lista de diciplinas");

        listaAlun.setText("entra");
        listaAlun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAlunActionPerformed(evt);
            }
        });

        listaFunc.setText("entra");
        listaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaFuncActionPerformed(evt);
            }
        });

        listaCurs.setText("entra");
        listaCurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCursActionPerformed(evt);
            }
        });

        entraDici.setText("entra");
        entraDici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entraDiciActionPerformed(evt);
            }
        });

        mostraTecj.setText("mostra lista de tecnicos ");

        tecnico.setText("entra");
        tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tecnicoActionPerformed(evt);
            }
        });

        mostraProfej.setText("mostra lista de professores ");

        professor.setText("entra");
        professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mostraProfej, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostraTecj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostraDiciplinaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostraCursoj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrafunj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostraAJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(diciplinaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cursoj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(funcionarioj, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(alunoj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(funcio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(curso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaAlun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaCurs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(entraDici, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(tecnico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(professor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alunoj)
                    .addComponent(aluno))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funcionarioj)
                    .addComponent(funcio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cursoj)
                    .addComponent(curso))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diciplinaj)
                    .addComponent(dici))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostraAJ)
                    .addComponent(listaAlun))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrafunj)
                    .addComponent(listaFunc))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostraCursoj)
                    .addComponent(listaCurs))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostraDiciplinaj)
                    .addComponent(entraDici))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostraTecj)
                    .addComponent(tecnico))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostraProfej)
                    .addComponent(professor))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoActionPerformed
        // TODO add your handling code here:
        cadastroAluno alu=new cadastroAluno(listaAluno,listaTec,listaFunci,listaPro,listaCurso,listaDic);
        alu.setLocationRelativeTo(null);
        alu.setVisible(true); 
        dispose();
    }//GEN-LAST:event_alunoActionPerformed

    private void funcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcioActionPerformed
        // TODO add your handling code here:
        cadastro cada=new cadastro(listaAluno,listaTec,listaFunci,listaPro,listaCurso,listaDic);
        cada.setLocationRelativeTo(null);
        cada.setVisible(true); 
        dispose();
    }//GEN-LAST:event_funcioActionPerformed

    private void cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoActionPerformed
        // TODO add your handling code here:
        cadastroCurso cursos=new cadastroCurso(listaAluno,listaTec,listaFunci,listaPro,listaCurso,listaDic);
        cursos.setLocationRelativeTo(null);
        cursos.setVisible(true); 
        dispose();
    }//GEN-LAST:event_cursoActionPerformed

    private void listaAlunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAlunActionPerformed
        // TODO add your handling code here:
        if(listaAluno.size()>0){
        mostra no=new mostra(listaAluno,listaTec,listaFunci,listaPro,listaCurso,1,listaDic);
        no.setLocationRelativeTo(null);
        no.setVisible(true); 
        dispose();
        }else{
            JOptionPane.showMessageDialog(null, "não temos registros");
        }
    }//GEN-LAST:event_listaAlunActionPerformed

    private void listaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaFuncActionPerformed
        // TODO add your handling code here:
        if(listaFunci.size()>0){
        mostra no=new mostra(listaAluno,listaTec,listaFunci,listaPro,listaCurso,3,listaDic);
        no.setLocationRelativeTo(null);
        no.setVisible(true); 
        dispose();
        }else{
            JOptionPane.showMessageDialog(null, "não temos registros");
        }
    }//GEN-LAST:event_listaFuncActionPerformed

    private void listaCursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCursActionPerformed
        // TODO add your handling code here:
        if(listaCurso.size()>0){
        mostra no=new mostra(listaAluno,listaTec,listaFunci,listaPro,listaCurso,5,listaDic);
        no.setLocationRelativeTo(null);
        no.setVisible(true); 
        dispose();
        }else{
            JOptionPane.showMessageDialog(null, "não temos registros");
        }
    }//GEN-LAST:event_listaCursActionPerformed

    private void entraDiciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entraDiciActionPerformed
        // TODO add your handling code here:
        if(listaDic.size()>0){
        mostra no=new mostra(listaAluno,listaTec,listaFunci,listaPro,listaCurso,6,listaDic);
        no.setLocationRelativeTo(null);
        no.setVisible(true); 
        dispose();
        }else{
            JOptionPane.showMessageDialog(null, "não temos registros");
        }
    }//GEN-LAST:event_entraDiciActionPerformed

    private void tecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tecnicoActionPerformed
        // TODO add your handling code here:
        if(listaTec.size()>0){
        mostra no=new mostra(listaAluno,listaTec,listaFunci,listaPro,listaCurso,2,listaDic);
        no.setLocationRelativeTo(null);
        no.setVisible(true); 
        dispose();
        }else{
            JOptionPane.showMessageDialog(null, "não temos registros");
        }
    }//GEN-LAST:event_tecnicoActionPerformed

    private void professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorActionPerformed
        // TODO add your handling code here:
        if(listaPro.size()>0){
        mostra no=new mostra(listaAluno,listaTec,listaFunci,listaPro,listaCurso,4,listaDic);
        no.setLocationRelativeTo(null);
        no.setVisible(true); 
        dispose();
        }else{
            JOptionPane.showMessageDialog(null, "não temos registros");
        }
    }//GEN-LAST:event_professorActionPerformed

    private void diciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diciActionPerformed
        // TODO add your handling code here:
        cadastroDiciplina no=new cadastroDiciplina(listaAluno,listaTec,listaFunci,listaPro,listaCurso,listaDic);
        no.setLocationRelativeTo(null);
        no.setVisible(true); 
        dispose();
    }//GEN-LAST:event_diciActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aluno;
    private javax.swing.JLabel alunoj;
    private javax.swing.JButton curso;
    private javax.swing.JLabel cursoj;
    private javax.swing.JButton dici;
    private javax.swing.JLabel diciplinaj;
    private javax.swing.JButton entraDici;
    private javax.swing.JButton funcio;
    private javax.swing.JLabel funcionarioj;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listaAlun;
    private javax.swing.JButton listaCurs;
    private javax.swing.JButton listaFunc;
    private javax.swing.JLabel mostraAJ;
    private javax.swing.JLabel mostraCursoj;
    private javax.swing.JLabel mostraDiciplinaj;
    private javax.swing.JLabel mostraProfej;
    private javax.swing.JLabel mostraTecj;
    private javax.swing.JLabel mostrafunj;
    private javax.swing.JButton professor;
    private javax.swing.JButton tecnico;
    // End of variables declaration//GEN-END:variables
}
