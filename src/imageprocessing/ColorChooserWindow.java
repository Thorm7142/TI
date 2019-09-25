/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author alexa
 */
public class ColorChooserWindow extends javax.swing.JFrame implements ChangeListener{

    private MainWindow mw;
    private BufferedImage ImgTmp;
    
    public void setMainWindow(MainWindow m){mw = m;}
    public MainWindow getMainWindow(){return mw;}
    
        public void setImgTmp(BufferedImage img){ImgTmp = img;}
    public BufferedImage getImgTmp(){return ImgTmp;}
    
    public ColorChooserWindow() {
        initComponents();
    }
    
    public ColorChooserWindow(MainWindow mw) {
        initComponents();
        setMainWindow(mw);
        JColorChooser.getSelectionModel().addChangeListener(this);
        BufferedImage img = copyImage(mw.getImgSrc());
        ImageIcon imageIcon = new ImageIcon(img);
        jl_image_cc.setIcon(imageIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JColorChooser = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        JB_CC_OK = new javax.swing.JButton();
        JB_CC_Appliquer = new javax.swing.JButton();
        JB_CC_Annuler = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_image_cc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ColorChooser");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("COLOR CHOOSER");

        JB_CC_OK.setText("OK");
        JB_CC_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CC_OKActionPerformed(evt);
            }
        });

        JB_CC_Appliquer.setText("Appliquer");
        JB_CC_Appliquer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CC_AppliquerActionPerformed(evt);
            }
        });

        JB_CC_Annuler.setText("Annuler");
        JB_CC_Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CC_AnnulerActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jl_image_cc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(JB_CC_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JB_CC_Appliquer)
                        .addGap(18, 18, 18)
                        .addComponent(JB_CC_Annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(323, 323, 323))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(JColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_CC_OK)
                            .addComponent(JB_CC_Appliquer)
                            .addComponent(JB_CC_Annuler)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_CC_AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CC_AnnulerActionPerformed
        dispose();
    }//GEN-LAST:event_JB_CC_AnnulerActionPerformed

    private void JB_CC_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CC_OKActionPerformed
        mw.applyColor(copyImage(getImgTmp()));
        dispose();
    }//GEN-LAST:event_JB_CC_OKActionPerformed

    private void JB_CC_AppliquerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CC_AppliquerActionPerformed
        mw.applyColor(copyImage(getImgTmp()));
    }//GEN-LAST:event_JB_CC_AppliquerActionPerformed
    
    public void stateChanged(ChangeEvent e) 
    { 
        Color newColor = JColorChooser.getColor();
        setColor(newColor);
    } 
    
    public void setColor(Color cl)
    {        
        BufferedImage img = copyImage(mw.getImgSrc());
        int pixel;
        int r, g, b, a;
        int newR, newG, newB, newA;

        newR = cl.getRed();
        newG = cl.getGreen();
        newB = cl.getBlue();
        newA = cl.getAlpha();
        
        for(int i = 0; i < img.getWidth() ;i++)
        {
            for(int j = 0; j < img.getHeight() ; j++)
            {
                pixel = img.getRGB(i, j);
               
                a = (pixel>>24)&0xff;     
                r = (pixel>>16)&0xff; 
                g = (pixel>>8)&0xff; 
                b = pixel&0xff; 
                
                a += newA;
                if(a > 255)
                    a = 255;
                if(a < 0)
                    a = 0;
                
                r += newR;
                if(r > 255)
                    r = 255;
                if(r < 0)
                    r = 0;
                
                g += newG;
                if(g > 255)
                    g = 255;
                if(g < 0)
                    g = 0;
                
                b += newB;
                if(b > 255)
                    b = 255;
                if(b < 0)
                    b = 0;
                
                
                pixel = (a<<24) | (r<<16) | (g<<8) | b; 
                img.setRGB(i, j, pixel); 
            }
        }
        setImgTmp(copyImage(img));
        ImageIcon imageIcon = new ImageIcon(img);

        jl_image_cc.setIcon(imageIcon);  
    }
    
        public static BufferedImage copyImage(BufferedImage source){
        BufferedImage b = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
        Graphics g = b.getGraphics();
        g.drawImage(source, 0, 0, null);
        g.dispose();
        return b;
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
            java.util.logging.Logger.getLogger(ColorChooserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorChooserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorChooserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorChooserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorChooserWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_CC_Annuler;
    private javax.swing.JButton JB_CC_Appliquer;
    private javax.swing.JButton JB_CC_OK;
    private javax.swing.JColorChooser JColorChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_image_cc;
    // End of variables declaration//GEN-END:variables
}
