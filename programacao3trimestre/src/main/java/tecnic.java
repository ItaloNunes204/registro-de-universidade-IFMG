
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cliente
 */
public class tecnic extends javax.swing.JFrame {
    ArrayList<Tecnico> listaTec=new ArrayList();
    ArrayList<Aluno> listaAlu=new ArrayList();
    ArrayList<Funcionario> listaFun=new ArrayList();
    ArrayList<Professor> listaPro=new ArrayList();
    ArrayList<Curso> listaCurso = new ArrayList();
    ArrayList<Diciplinas> listaDic = new ArrayList();
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String ctps;
    private double salario;
    /**
     * Creates new form tecnic
     */
    public tecnic() {
        initComponents();
    }
    tecnic(String nomep, String cpfp, String enderecop, String telefonep, String ctpsp, 
    double salariop, ArrayList<Aluno> listaAlun, ArrayList<Tecnico> listaTecn,
    ArrayList<Funcionario> listaFunc, ArrayList<Professor> listaProf, ArrayList<Curso> listaCursos, 
    ArrayList<Diciplinas> listaDici) {
    initComponents();
     nome=nomep;
     endereco=enderecop;
     telefone=telefonep;
     cpf=cpfp;
     ctps=ctpsp;
     salario=salariop;
     listaAlu=listaAlun;
     listaTec=listaTecn;
     listaFun=listaFunc;
     listaPro=listaProf;
     listaCurso=listaCursos;
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

        areaj = new javax.swing.JLabel();
        area = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaj.setText("area de atuação");

        area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mudaj(evt);
            }
        });

        jButton1.setText("cadastra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(areaj, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(area)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jButton1)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaj)
                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Tecnico tec=new Tecnico(nome,endereco,telefone,cpf,ctps,salario,area.getText());
        listaTec.add(tec);
        JOptionPane.showMessageDialog(null,"cadastro feito com sucesso");
        principal prin=new principal(listaAlu,listaTec,listaFun,listaPro,listaCurso,listaDic);
        prin.setLocationRelativeTo(null);
        prin.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mudaj(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mudaj
        // TODO add your handling code here:
        areaj.setForeground(Color.red);
    }//GEN-LAST:event_mudaj

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
            java.util.logging.Logger.getLogger(tecnic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tecnic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tecnic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tecnic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tecnic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField area;
    private javax.swing.JLabel areaj;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}