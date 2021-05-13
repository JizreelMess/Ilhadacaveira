/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menugg;

import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static menugg.Questoes.questao;

public class Rodando extends javax.swing.JFrame {

    private final String[][] listaDePerguntas = new String[12][6];
    private final String[] respostasDeEntrada = {"a", "b", "c", "d"};
    private final String [] historiaDojogo = new String[4];
    private int contadorPergunta = -1;
    private int pontosDeVida;
    public static int  pontos= 5;
    private boolean isInicio = true;
    private int r;
    private int i;


    public Rodando() {
        initComponents();
        ressetaDados(); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagem/caverna roxa.png"));
        Image image =  icon.getImage();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1042, 632));

        jButton7.setText("PROXIMA");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel10.setText("jLabel10");

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel12.setText("PONTOS:");

        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel13)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel13)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(204, 204, 204)
                                .addComponent(jLabel3)))
                        .addGap(141, 141, 141)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 62, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButton7)))
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(40, 40, 40)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jLabel6)
                            .addGap(164, 164, 164)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(129, 129, 129))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(150, 150, 150))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(141, 141, 141))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))))
        );

        jMenu5.setText("Opções");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Tutorial");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItem3);

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Sair");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItem2);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(845, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        this.dispose();// fechar jogo 
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String resposta = jTextField1.getText().toLowerCase();
        if (contadorPergunta == -1 && isInicio == true) {
            executarPerguntas();
           
        } else {
            validaEntrada(resposta);
        }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
         Finalbom Rodando = new Finalbom(); Rodando.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void validaEntrada(String resposta) {
        for (String alternativa : respostasDeEntrada) {
            if (alternativa.equals(resposta)) {
                verificarResposta(resposta);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, " Digite uma resposta válida ");
        jTextField1.setText("");
    }

    private void verificarResposta(String resposta) {

        if (validaResposta(resposta)) {
            JOptionPane.showMessageDialog(null, "CERTO, + 5 Pontos");
            jTextField1.setText("");
            contadorPergunta++;
            pontos+=5;
          //mostraHistoria();
            verificaVidaDoJogador();
            executarPerguntas();
            jLabel11.setText(Integer.toString(pontos));

        } else {
            JOptionPane.showMessageDialog(null, "hahaha voce caiu na armadilha agora ira sofrer!!!, - 3 Pontos");
            jTextField1.setText("");
             contadorPergunta++;
             pontos-=3;
            //pontosDeVida--;
           // mostraHistoria();
            verificaVidaDoJogador();
            executarPerguntas();
            jLabel11.setText(Integer.toString(pontos));
        }
    }

    private void executarPerguntas() {
            Random random = new Random();
             r = random.nextInt(12);
             //mostraHistoria();
        if (r <= listaDePerguntas.length) {
            if (contadorPergunta == -1) {
                isInicio = false;
                contadorPergunta++;
                setVisible();
            }

            String questao = questao(listaDePerguntas)[r][0];
            String alternativa1 = questao(listaDePerguntas)[r][1];
            String alternativa2 = questao(listaDePerguntas)[r][2];
            String alternativa3 = questao(listaDePerguntas)[r][3];
            String alternativa4 = questao(listaDePerguntas)[r][4];

            jLabel6.setText(questao);
            jLabel7.setText(alternativa1);
            jLabel8.setText(alternativa2);
            jLabel9.setText(alternativa3);
            jLabel10.setText(alternativa4);

        } else {
            JOptionPane.showMessageDialog(null, " FIM DE JOGO ");
            ressetaDados();
            mostraFimDaHistoria();

        }
    }

    private boolean validaResposta(String resposta) {
        return resposta.equals(listaDePerguntas[r][5]);

    }

    private void verificaVidaDoJogador() {
        if (pontos <= 0) {
            Gameover menuinicial = new Gameover();
            menuinicial.setVisible(true);
            ressetaDados();
            jTextField1.setText("");

        }if(pontos>=20){
        JOptionPane.showMessageDialog(null, " Final feliz, você ganhou");
        Finalbom menuinicial = new Finalbom();
        menuinicial.setVisible(true);
        ressetaDados();
        jTextField1.setText("");
        }

    }

    private void mostraFimDaHistoria() {
        ressetaDados();
        JOptionPane.showMessageDialog(null, " HISTORIA DO FIM DO JOGO ");

    }
    
       public static int pontuacaoFinal(){
         int q= pontos;
        return q;
       
    }
    
    
    
    private void mostraHistoria(){
       /*if(i <= historiaDojogo.length ){
       jLabel13.setVisible(true);
        String texto = historia(historiaDojogo)[i];
        jLabel13.setText(texto);
        jLabel13.setForeground(Color.black);    
        i++;
        }*/
      
    }

    private void ressetaDados() {
        
        jLabel13.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jTextField1.setVisible(false);
        jButton7.setText("Iniciar");
        panel1.setVisible(false);
       isInicio = true;
      // pontosDeVida = 1;
       //contadorPergunta = -1;

    }

    private void setVisible() {
        
        setColorText();
        jLabel11.setText(Integer.toString(pontos));
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jTextField1.setVisible(true);
        panel1.setVisible(true);
        jButton7.setText("Proxima");
        jTextField1.setText("");
    }

    private void setColorText() {
        
        jLabel6.setForeground(Color.yellow);
        jLabel7.setForeground(Color.green);
        jLabel8.setForeground(Color.green);
        jLabel9.setForeground(Color.green);
        jLabel10.setForeground(Color.green);
        jLabel11.setForeground(Color.green);
        jLabel12.setForeground(Color.green);
        
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
            java.util.logging.Logger.getLogger(Rodando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rodando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rodando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rodando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
             
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rodando().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JTextField jTextField1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables

}
