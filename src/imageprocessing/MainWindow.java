/* 
 * Licence Eliott van der Straten-Waillet
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author alexa
 */
public class MainWindow extends javax.swing.JFrame {

    
    private BufferedImage ImgSrc;
    private BufferedImage ImgTmp;
    private BufferedImage ImgOri;
    private Image Img;
    
    private String filepath;
    
    public void setImgSrc(BufferedImage img){ImgSrc = img;}
    public BufferedImage getImgSrc(){return ImgSrc;}
    
    public void setImgTmp(BufferedImage img){ImgTmp = img;}
    public BufferedImage getImgTmp(){return ImgTmp;}
    
    public void setImgOri(BufferedImage img){ImgOri = img;}
    public BufferedImage getImgOri(){return ImgOri;}
    
    public void setImg(Image img){Img = img;}
    public Image getImg(){return Img;}
    
    public void setFilePath(String str){filepath = str;}
    public String getFilePath(){return filepath;}
    
    public MainWindow() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_SelectFile = new javax.swing.JButton();
        JBGreyscale = new javax.swing.JButton();
        jsp_imgsrc = new javax.swing.JScrollPane();
        jl_imageSource = new javax.swing.JLabel();
        jsc_imgdest = new javax.swing.JScrollPane();
        jl_imageDest = new javax.swing.JLabel();
        jb_zoom = new javax.swing.JButton();
        jl_fois = new javax.swing.JLabel();
        jtf_zoom_coeff = new javax.swing.JTextField();
        jb_DestToSrc = new javax.swing.JButton();
        jb_neg = new javax.swing.JButton();
        slider_threshold1 = new javax.swing.JSlider();
        JB_Mean = new javax.swing.JButton();
        JB_Median = new javax.swing.JButton();
        JB_Sobel = new javax.swing.JButton();
        JB_Prewitt = new javax.swing.JButton();
        JB_Laplacian = new javax.swing.JButton();
        JCB_Roberts = new javax.swing.JComboBox<>();
        JB_Roberts = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JB_Kirsch = new javax.swing.JButton();
        JCB_Kirsch = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        JB_Erosion = new javax.swing.JButton();
        jl_threshold = new javax.swing.JLabel();
        JTF_Morpho = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        JB_Dilatation1 = new javax.swing.JButton();
        JB_Ouverture = new javax.swing.JButton();
        JB_Fermeture = new javax.swing.JButton();
        JB_reset = new javax.swing.JButton();
        JB_Gauss = new javax.swing.JButton();
        jl_Threshold = new javax.swing.JLabel();
        JB_Color = new javax.swing.JButton();
        JB_Multi_Treshold = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JB_SelectFile.setText("Charger Fichier");
        JB_SelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_SelectFileActionPerformed(evt);
            }
        });

        JBGreyscale.setText("GreyScale");
        JBGreyscale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGreyscaleActionPerformed(evt);
            }
        });

        jl_imageSource.setMaximumSize(new java.awt.Dimension(500, 500));
        jsp_imgsrc.setViewportView(jl_imageSource);

        jl_imageDest.setMaximumSize(new java.awt.Dimension(500, 500));
        jsc_imgdest.setViewportView(jl_imageDest);

        jb_zoom.setText("Zoom");
        jb_zoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_zoomActionPerformed(evt);
            }
        });

        jl_fois.setText("x");

        jtf_zoom_coeff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_zoom_coeffActionPerformed(evt);
            }
        });

        jb_DestToSrc.setText("<<");
        jb_DestToSrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_DestToSrcActionPerformed(evt);
            }
        });

        jb_neg.setText("Negative");
        jb_neg.setToolTipText("");
        jb_neg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_negActionPerformed(evt);
            }
        });

        slider_threshold1.setMajorTickSpacing(10);
        slider_threshold1.setMaximum(255);
        slider_threshold1.setMinorTickSpacing(1);
        slider_threshold1.setToolTipText("");
        slider_threshold1.setValue(128);
        slider_threshold1.setName(""); // NOI18N
        slider_threshold1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_threshold1StateChanged(evt);
            }
        });

        JB_Mean.setText("Mean");
        JB_Mean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_MeanActionPerformed(evt);
            }
        });

        JB_Median.setText("Median");
        JB_Median.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_MedianActionPerformed(evt);
            }
        });

        JB_Sobel.setText("Sobel");
        JB_Sobel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_SobelActionPerformed(evt);
            }
        });

        JB_Prewitt.setText("Prewitt");
        JB_Prewitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_PrewittActionPerformed(evt);
            }
        });

        JB_Laplacian.setText("Laplacian");
        JB_Laplacian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_LaplacianActionPerformed(evt);
            }
        });

        JCB_Roberts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "NE", "SO", "SE" }));

        JB_Roberts.setText("Roberts");
        JB_Roberts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_RobertsActionPerformed(evt);
            }
        });

        jLabel1.setText("Centre ->");

        JB_Kirsch.setText("Kirsch");
        JB_Kirsch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_KirschActionPerformed(evt);
            }
        });

        JCB_Kirsch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auto", "NO", "N", "NE", "E", "SE", "S", "SO", "O" }));

        jLabel2.setText("Direction ->");

        JB_Erosion.setText("Erosion");
        JB_Erosion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ErosionActionPerformed(evt);
            }
        });

        jl_threshold.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N

        jButton1.setText("↓");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JB_Dilatation1.setText("Dilatation");
        JB_Dilatation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Dilatation1ActionPerformed(evt);
            }
        });

        JB_Ouverture.setText("Ouverture");
        JB_Ouverture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_OuvertureActionPerformed(evt);
            }
        });

        JB_Fermeture.setText("Fermeture");
        JB_Fermeture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_FermetureActionPerformed(evt);
            }
        });

        JB_reset.setText("Reset");
        JB_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_resetActionPerformed(evt);
            }
        });

        JB_Gauss.setText("Gauss");

        jl_Threshold.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_Threshold.setText("Threshold :");

        JB_Color.setText("Color");
        JB_Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ColorActionPerformed(evt);
            }
        });

        JB_Multi_Treshold.setText("Multi-Treshold");
        JB_Multi_Treshold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Multi_TresholdActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jsp_imgsrc, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                        .addComponent(jb_DestToSrc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jsc_imgdest, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JB_SelectFile)
                            .addComponent(JB_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JB_Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_neg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JB_Median, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JB_Mean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBGreyscale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_zoom)
                                .addGap(12, 12, 12)
                                .addComponent(jl_fois)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_zoom_coeff, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(slider_threshold1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(JB_Prewitt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JB_Sobel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JB_Laplacian, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(JB_Kirsch, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(JB_Gauss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(JB_Roberts, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))))
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JCB_Kirsch, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JCB_Roberts, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(JB_Multi_Treshold))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JB_Fermeture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JB_Dilatation1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JB_Erosion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JB_Ouverture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jl_threshold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(JTF_Morpho))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_Threshold)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jl_Threshold)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_threshold, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb_zoom)
                                        .addComponent(jl_fois)
                                        .addComponent(jtf_zoom_coeff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JBGreyscale))
                                    .addComponent(JB_SelectFile))
                                .addGap(7, 7, 7))
                            .addComponent(slider_threshold1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JB_Erosion)
                                    .addComponent(jButton1))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JB_Dilatation1)
                                    .addComponent(JTF_Morpho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JB_Ouverture))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JB_Sobel)
                                        .addComponent(JB_Kirsch)
                                        .addComponent(jLabel2)
                                        .addComponent(JCB_Kirsch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb_neg))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(JB_reset)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JB_Prewitt)
                                    .addComponent(JB_Roberts)
                                    .addComponent(jLabel1)
                                    .addComponent(JCB_Roberts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JB_Mean))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JB_Median)
                                    .addComponent(JB_Laplacian)
                                    .addComponent(JB_Gauss))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JB_Fermeture)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_Multi_Treshold)
                            .addComponent(JB_Color))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jsp_imgsrc)
                        .addComponent(jsc_imgdest, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jb_DestToSrc)
                        .addGap(158, 158, 158)))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_SelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_SelectFileActionPerformed

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "gif", "jpeg", "bmp");
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter); // On n'accepte que les types choisis ci-dessus
        fileChooser.setAcceptAllFileFilterUsed(false); // On empêche à l'utilsateur de choisir d'autres types,é vite de devoir check par après

        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home"))); // Il faut bien démarrer quelque part + PORTABLE

        int result = fileChooser.showOpenDialog(this); // Affiche

        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            
            setFilePath(selectedFile.getAbsolutePath());
            
            setImage(jl_imageSource, selectedFile.getAbsolutePath());
        }
    
    }//GEN-LAST:event_JB_SelectFileActionPerformed

    private void JBGreyscaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGreyscaleActionPerformed
        Greyscale(jl_imageDest, null);
    }//GEN-LAST:event_JBGreyscaleActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jb_zoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_zoomActionPerformed
        
        BufferedImage l = copyImage(getImgSrc());
        String s = jtf_zoom_coeff.getText();
        if(!(s.equals(""))) // Si le champs n'est pas vide
        {
            float coeff = Float.parseFloat(s);       
        
            Image dimg = l.getScaledInstance((int)(l.getWidth()*coeff), (int)(l.getHeight()*coeff), Image.SCALE_SMOOTH);
            
            ImageIcon imageIcon = new ImageIcon(dimg);
            
            jl_imageDest.setIcon(imageIcon);
        }
    }//GEN-LAST:event_jb_zoomActionPerformed

    private void jtf_zoom_coeffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_zoom_coeffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_zoom_coeffActionPerformed

    private void jb_DestToSrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_DestToSrcActionPerformed
                
        setImgSrc(copyImage(getImgTmp()));
        
        ImageIcon imageIcon = new ImageIcon(getImgSrc());
        
        jl_imageSource.setIcon(imageIcon);
        
    }//GEN-LAST:event_jb_DestToSrcActionPerformed

    private void jb_negActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_negActionPerformed
        Negative();
    }//GEN-LAST:event_jb_negActionPerformed

    private void slider_threshold1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_threshold1StateChanged
        int val = slider_threshold1.getValue();
        
        jl_threshold.setText(String.valueOf(val));
        
        Threshold(val);
    }//GEN-LAST:event_slider_threshold1StateChanged

    private void JB_MeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_MeanActionPerformed
        MeanFilter();
    }//GEN-LAST:event_JB_MeanActionPerformed

    private void JB_MedianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_MedianActionPerformed
        MedianFilter();
    }//GEN-LAST:event_JB_MedianActionPerformed

    private void JB_SobelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_SobelActionPerformed
        SobelFilter();
    }//GEN-LAST:event_JB_SobelActionPerformed

    private void JB_PrewittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_PrewittActionPerformed
        PrewittFilter();
    }//GEN-LAST:event_JB_PrewittActionPerformed

    private void JB_LaplacianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_LaplacianActionPerformed
        LaplacianFilter();
    }//GEN-LAST:event_JB_LaplacianActionPerformed

    private void JB_RobertsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_RobertsActionPerformed
        String centre = JCB_Roberts.getModel().getSelectedItem().toString();
        RobertCrossFilter(centre);
    }//GEN-LAST:event_JB_RobertsActionPerformed

    private void JB_KirschActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_KirschActionPerformed
        String centre = JCB_Kirsch.getModel().getSelectedItem().toString();
        KirschFilter(centre);
    }//GEN-LAST:event_JB_KirschActionPerformed

    private void JB_ErosionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ErosionActionPerformed
        if(JTF_Morpho.getText().equals(""))
        {
            Erosion(128, null);
        }
        else
        {
            int val = Integer.parseInt(JTF_Morpho.getText());
            Erosion(val, null);
        }
    }//GEN-LAST:event_JB_ErosionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s = jl_threshold.getText();
        if(!s.equals(""))
        {
            JTF_Morpho.setText(s);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JB_Dilatation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Dilatation1ActionPerformed
        if(JTF_Morpho.getText().equals(""))
        {
            Dilatation(128, null);
        }
        else
        {
            int val = Integer.parseInt(JTF_Morpho.getText());
            Dilatation(val, null);
        }
    }//GEN-LAST:event_JB_Dilatation1ActionPerformed

    private void JB_OuvertureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_OuvertureActionPerformed
        BufferedImage img = null;
        if(JTF_Morpho.getText().equals(""))
        {
            img = copyImage(Erosion(128, null));
            setImgSrc(copyImage(getImgTmp()));
            Dilatation(128, copyImage(img));
            setImgSrc(copyImage(getImgOri()));
        }
        else
        {
            int val = Integer.parseInt(JTF_Morpho.getText());
            img = copyImage(Erosion(val, null));
            setImgSrc(copyImage(getImgTmp()));
            Dilatation(val, copyImage(img));
            setImgSrc(copyImage(getImgOri()));
        }
    }//GEN-LAST:event_JB_OuvertureActionPerformed

    private void JB_FermetureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_FermetureActionPerformed
        BufferedImage img = copyImage(getImgSrc());
        if(JTF_Morpho.getText().equals(""))
        {
            img = copyImage(Dilatation(128, null));
            setImgSrc(copyImage(getImgTmp()));
            Erosion(128, img); 
            setImgSrc(copyImage(getImgOri()));
        }
        else
        {
            int val = Integer.parseInt(JTF_Morpho.getText());
            img = copyImage(Dilatation(val, null));
            setImgSrc(copyImage(getImgTmp()));
            Erosion(val, img);
            setImgSrc(copyImage(getImgOri()));
        }
    }//GEN-LAST:event_JB_FermetureActionPerformed

    private void JB_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_resetActionPerformed
        setImgSrc(copyImage(getImgOri()));
        
        ImageIcon imageIcon = new ImageIcon(getImgSrc());
        
        jl_imageSource.setIcon(imageIcon);
    }//GEN-LAST:event_JB_resetActionPerformed

    private void JB_Multi_TresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Multi_TresholdActionPerformed
        
    }//GEN-LAST:event_JB_Multi_TresholdActionPerformed

    private void JB_ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ColorActionPerformed
        ColorChooserWindow ccw = new ColorChooserWindow(this);
        ccw.setVisible(true);
    }//GEN-LAST:event_JB_ColorActionPerformed

    public void setImage(JLabel jl, String str)
    {   
        // Dessine une image du chemin str dans le label jl
        
        BufferedImage img = null;

        try 
        {
            img = ImageIO.read(new File(str));
            setImgSrc(img);
            setImgOri(img);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        Image dimg = img.getScaledInstance((int)(img.getWidth()), (int)(img.getHeight()), Image.SCALE_SMOOTH);
        setImg(dimg);
        
        ImageIcon imageIcon = new ImageIcon(img);
        
        jl.setIcon(imageIcon);
    }
    
    public void Expansion()
    {
        
    }

    public double Gauss(int x, int y, double sigma)
    {
        double coeff = 1/(2*Math.PI*sigma*sigma);
        double exposant = -((x*x + y*y) / (2*sigma*sigma));
        double res = coeff*Math.pow(Math.E, exposant);
        
        return res;
    }
    
    public void GaussianFilter()
    {
        double sigma = 0.2;
        int taille = (int) (2* Math.ceil((3*sigma)) + 1);
        
        System.out.println("taille = " + taille);
        
        double[][] masque = new double[taille][taille];
        
        
        for(int i = 0; i < taille; i++)
        {
            for(int j = 0; j < taille; j++)
            {
                masque[i][j] = 0; 
            }
        }
        
        
        
        for(int i = (0-taille+1); i < (taille-1); i++)
        {
            
        }
    }
    
    public void KirschFilter(String centre)
    {
        BufferedImage img = copyImage(getImgSrc());
        BufferedImage tmp = copyImage(getImgSrc());
        
        int[] P = new int[9]; // Pixel
        int[] Avg = new int[9];
        
        int r, g, b;
        
        int pixel;
        int max = 0;
        
        int width = img.getWidth(); 
        int height = img.getHeight(); 
  
        for (int i = 0; i < width; i++) 
        { 
            for (int j = 0; j < height; j++) 
            { 
               try
               {
                     P[0]=img.getRGB(i-1,j-1);
                     P[1]=img.getRGB(i-1,j);
                     P[2]=img.getRGB(i-1,j+1);
                     P[3]=img.getRGB(i,j+1);
                     P[4]=img.getRGB(i+1,j+1);
                     P[5]=img.getRGB(i+1,j);
                     P[6]=img.getRGB(i+1,j-1);
                     P[7]=img.getRGB(i,j-1);
                     P[8]=img.getRGB(i,j);
               }
               catch(IndexOutOfBoundsException e)
               {
                     P[0]=0;
                     P[1]=0;
                     P[2]=0;
                     P[3]=0;
                     P[4]=0;
                     P[5]=0;
                     P[6]=0;
                     P[7]=0;
                     P[8]=img.getRGB(i,j);   
               }

               for(int k=0; k<9; k++)
               {                   
                   r = (P[k]>>16)&0xff;
                   b = (P[k]>>8)&0xff; 
                   g = P[k]&0xff;
                   
                   Avg[k] = (r+b+g)/3;
               }

               int[] res = new int[8];
               // Reste à calculer res pour les HUIT matrices et prendre le résultat le plus grand
               
                res[0] = 3*Avg[0] + 3*Avg[1] + 3*Avg[2] + 3*Avg[3] + 3*Avg[5] - 5*Avg[6] - 5*Avg[7] - 5*Avg[8];
                res[0] = Math.abs(res[0]);

                res[1] = 3*Avg[0] + 3*Avg[1] + 3*Avg[2] - 5*Avg[3] + 3*Avg[5] - 5*Avg[6] - 5*Avg[7] + 3*Avg[8];
                res[1] = Math.abs(res[1]);
                
                res[2] = -5*Avg[0] + 3*Avg[1] + 3*Avg[2] - 5*Avg[3] + 3*Avg[5] - 5*Avg[6] + 3*Avg[7] + 3*Avg[8];
                res[2] = Math.abs(res[2]);
                
                res[3] = -5*Avg[0] - 5*Avg[1] + 3*Avg[2] - 5*Avg[3] + 3*Avg[5] + 3*Avg[6] + 3*Avg[7] + 3*Avg[8];
                res[3] = Math.abs(res[3]);
                
                res[4] = -5*Avg[0] - 5*Avg[1] - 5*Avg[2] + 3*Avg[3] + 3*Avg[5] + 3*Avg[6] + 3*Avg[7] + 3*Avg[8];
                res[4] = Math.abs(res[4]);
                
                res[5] = 3*Avg[0] - 5*Avg[1] - 5*Avg[2] + 3*Avg[3] - 5*Avg[5] + 3*Avg[6] + 3*Avg[7] + 3*Avg[8];
                res[5] = Math.abs(res[5]);
                
                res[6] = 3*Avg[0] + 3*Avg[1] - 5*Avg[2] + 3*Avg[3] - 5*Avg[5] + 3*Avg[6] + 3*Avg[7] - 5*Avg[8];
                res[6] = Math.abs(res[6]);
                
                res[7] = 3*Avg[0] + 3*Avg[1] + 3*Avg[2] + 3*Avg[3] - 5*Avg[5] + 3*Avg[6] - 5*Avg[7] - 5*Avg[8];
                res[7] = Math.abs(res[7]);
                
                switch(centre)
                {
                    case "NO" : max = res[0];
                                break;
                    case "N" :  max = res[1];
                                break;
                    case "NE" :  max = res[2];
                                break;
                    case "E" :  max = res[4];
                                break;
                    case "SE" :  max = res[7];
                                break;
                    case "S" :  max = res[6];
                                break;
                    case "SO" :  max = res[5];
                                break;
                    case "O" :  max = res[3];
                                break;
                    case "Auto" :   max = res[0];
                                    for(int k = 1; k<8; k++)
                                    {
                                        if(res[k] > max)
                                        {
                                            max = res[k];
                                        }
                                    }
                                    break;                
                }
                      
                pixel = (max<<24) | (max<<16) | (max<<8) | max;

                tmp.setRGB(i, j, pixel); 
            }   
        }
        setImgTmp(copyImage(tmp));
        ImageIcon imageIcon = new ImageIcon(tmp);

        jl_imageDest.setIcon(imageIcon);
    }
    
    public void RobertCrossFilter(String centre)
    {
        BufferedImage img = copyImage(getImgSrc());
        BufferedImage tmp = copyImage(getImgSrc());
        
        
        int r, g, b;
        
        int[] P = new int[4]; // Pixel
        int[] Avg = new int[4];
        
        int width = img.getWidth(); 
        int height = img.getHeight(); 
  
        for (int i = 0; i < width; i++) 
        { 
            for (int j = 0; j < height; j++) 
            { 
               try
               {
                    switch(centre)
                    {
                        case "NO" : P[0]=img.getRGB(i, j);
                                    P[1]=img.getRGB(i+1, j);
                                    P[2]=img.getRGB(i, j+1);
                                    P[3]=img.getRGB(i+1, j+1);
                                    break;
                        case "NE" : P[0]=img.getRGB(i-1, j);
                                    P[1]=img.getRGB(i, j);
                                    P[2]=img.getRGB(i-1, j+1);
                                    P[3]=img.getRGB(i, j+1);
                                    break;
                        case "SO" : P[0]=img.getRGB(i, j-1);
                                    P[1]=img.getRGB(i+1, j-1);
                                    P[2]=img.getRGB(i, j);
                                    P[3]=img.getRGB(i+1, j);
                                    break;
                        case "SE" : P[0]=img.getRGB(i-1, j-1);
                                    P[1]=img.getRGB(i, j-1);
                                    P[2]=img.getRGB(i-1, j);
                                    P[3]=img.getRGB(i, j);
                                    break;
                    }
               }
               catch(IndexOutOfBoundsException e)
               {
                     P[0]=0;
                     P[1]=0;
                     P[2]=0;
                     P[3]=0; 
               }

               for(int k=0; k<4; k++)
               {                   
                   r = (P[k]>>16)&0xff;
                   b = (P[k]>>8)&0xff; 
                   g = P[k]&0xff;
                   
                   Avg[k] = (r+b+g)/3;
               }

               
               int res = Avg[0] - Avg[3];
               res = Math.abs(res);
                
               res = (res<<24) | (res<<16) | (res<<8) | res; 
                
               int res2 = Avg[1] - Avg[2];
               res2 = Math.abs(res2);
                
               res = (res<<24) | (res<<16) | (res<<8) | res;
               res2 = (res2<<24) | (res2<<16) | (res2<<8) | res2;
               //res = res | res2;
                
               tmp.setRGB(i, j, res); 
            }   
        }
        setImgTmp(copyImage(tmp));
        ImageIcon imageIcon = new ImageIcon(tmp);

        jl_imageDest.setIcon(imageIcon);
    }
    
    public void SobelFilter()
    {
        BufferedImage img = copyImage(getImgSrc());
        BufferedImage tmp = copyImage(getImgSrc());
        
        int[] P = new int[9]; // Pixel
        int[] Avg = new int[9];
        
        int r, g, b;
        
        
        int width = img.getWidth(); 
        int height = img.getHeight(); 
  
        for (int i = 0; i < width; i++) 
        { 
            for (int j = 0; j < height; j++) 
            { 
               try
               {
                     P[0]=img.getRGB(i-1,j-1);
                     P[1]=img.getRGB(i-1,j);
                     P[2]=img.getRGB(i-1,j+1);
                     P[3]=img.getRGB(i,j+1);
                     P[4]=img.getRGB(i+1,j+1);
                     P[5]=img.getRGB(i+1,j);
                     P[6]=img.getRGB(i+1,j-1);
                     P[7]=img.getRGB(i,j-1);
                     P[8]=img.getRGB(i,j);
               }
               catch(IndexOutOfBoundsException e)
               {
                     P[0]=0;
                     P[1]=0;
                     P[2]=0;
                     P[3]=0;
                     P[4]=0;
                     P[5]=0;
                     P[6]=0;
                     P[7]=0;
                     P[8]=img.getRGB(i,j);   
               }

               for(int k=0; k<9; k++)
               {                   
                   r = (P[k]>>16)&0xff;
                   b = (P[k]>>8)&0xff; 
                   g = P[k]&0xff;
                   
                   Avg[k] = (r+b+g)/3;
               }

               
               int res = -Avg[0] + Avg[2] -2*Avg[3] + 2*Avg[5] - Avg[6] + Avg[8];
                res /= 4;
                res = Math.abs(res);
                
                res = (res<<24) | (res<<16) | (res<<8) | res; 
                
                int res2 = -Avg[0]  -2*Avg[1] - Avg[2] + Avg[6] + 2*Avg[7] + Avg[8];
                res2 /= 4;
                res2 = Math.abs(res2);
                
                res = (res<<24) | (res<<16) | (res<<8) | res;
                res2 = (res2<<24) | (res2<<16) | (res2<<8) | res2;
                res = res | res2;
                
                tmp.setRGB(i, j, res); 
            }   
        }
        setImgTmp(copyImage(tmp));
        ImageIcon imageIcon = new ImageIcon(tmp);

        jl_imageDest.setIcon(imageIcon);
    }
 
    public void PrewittFilter()
    {
        BufferedImage img = copyImage(getImgSrc());
        BufferedImage tmp = copyImage(getImgSrc());
        
        int[] P = new int[9]; // Pixel
        int[] Avg = new int[9];
        
        int r, g, b;
        
        
        int width = img.getWidth(); 
        int height = img.getHeight(); 
  
        for (int i = 0; i < width; i++) 
        { 
            for (int j = 0; j < height; j++) 
            { 
               try
               {
                     P[0]=img.getRGB(i-1,j-1);
                     P[1]=img.getRGB(i-1,j);
                     P[2]=img.getRGB(i-1,j+1);
                     P[3]=img.getRGB(i,j+1);
                     P[4]=img.getRGB(i+1,j+1);
                     P[5]=img.getRGB(i+1,j);
                     P[6]=img.getRGB(i+1,j-1);
                     P[7]=img.getRGB(i,j-1);
                     P[8]=img.getRGB(i,j);
               }
               catch(IndexOutOfBoundsException e)
               {
                     P[0]=0;
                     P[1]=0;
                     P[2]=0;
                     P[3]=0;
                     P[4]=0;
                     P[5]=0;
                     P[6]=0;
                     P[7]=0;
                     P[8]=img.getRGB(i,j);   
               }

               for(int k=0; k<9; k++)
               {                   
                   r = (P[k]>>16)&0xff;
                   b = (P[k]>>8)&0xff; 
                   g = P[k]&0xff;
                   
                   Avg[k] = (r+b+g)/3;
               }

               
               int res = -Avg[0] + Avg[2] -Avg[3] + Avg[5] - Avg[6] + Avg[8];
                res /= 3;
                res = Math.abs(res);
                
                res = (res<<24) | (res<<16) | (res<<8) | res; 
                
                int res2 = -Avg[0] + Avg[6] -Avg[1] + Avg[7] - Avg[2] + Avg[8];
                res2 /= 3;
                res2 = Math.abs(res2);
                
                res = (res<<24) | (res<<16) | (res<<8) | res;
                res2 = (res2<<24) | (res2<<16) | (res2<<8) | res2;
                res = res | res2;
                
                tmp.setRGB(i, j, res); 
            }   
        }
        setImgTmp(copyImage(tmp));
        ImageIcon imageIcon = new ImageIcon(tmp);

        jl_imageDest.setIcon(imageIcon);
    }
    
    public void LaplacianFilter()
    {
        BufferedImage img = copyImage(getImgSrc());
        BufferedImage tmp = copyImage(getImgSrc());
        
        int[] P = new int[9]; // Pixel
        int[] Avg = new int[9];
        
        int r, g, b;
        
        
        int width = img.getWidth(); 
        int height = img.getHeight(); 
  
        for (int i = 0; i < width; i++) 
        { 
            for (int j = 0; j < height; j++) 
            { 
               try
               {
                     P[0]=img.getRGB(i-1,j-1);
                     P[1]=img.getRGB(i-1,j);
                     P[2]=img.getRGB(i-1,j+1);
                     P[3]=img.getRGB(i,j+1);
                     P[4]=img.getRGB(i+1,j+1);
                     P[5]=img.getRGB(i+1,j);
                     P[6]=img.getRGB(i+1,j-1);
                     P[7]=img.getRGB(i,j-1);
                     P[8]=img.getRGB(i,j);
               }
               catch(IndexOutOfBoundsException e)
               {
                     P[0]=0;
                     P[1]=0;
                     P[2]=0;
                     P[3]=0;
                     P[4]=0;
                     P[5]=0;
                     P[6]=0;
                     P[7]=0;
                     P[8]=img.getRGB(i,j);   
               }

               for(int k=0; k<9; k++)
               {                   
                   r = (P[k]>>16)&0xff;
                   b = (P[k]>>8)&0xff; 
                   g = P[k]&0xff;
                   
                   Avg[k] = (r+b+g)/3;
               }

               
               int res = Avg[1] + Avg[3] -4*Avg[4] + Avg[5] + Avg[7];
               res = Math.abs(res);
                
                res = (res<<24) | (res<<16) | (res<<8) | res; 
                
                tmp.setRGB(i, j, res); 
            }   
        }
        setImgTmp(copyImage(tmp));
        ImageIcon imageIcon = new ImageIcon(tmp);

        jl_imageDest.setIcon(imageIcon);
    }
    
    public void MedianFilter()
    {
        BufferedImage img = copyImage(getImgSrc());
        BufferedImage tmp = copyImage(getImgSrc());
        
        int[] P=new int[9];
        int[] R=new int[9];
        int[] B=new int[9];
        int[] G=new int[9];
        
        int sumR = 0, sumB = 0, sumG = 0, avgR, avgB, avgG;
        int pixel;
        
        int width = img.getWidth(); 
        int height = img.getHeight(); 
  
        for (int i = 0; i < width; i++) 
        { 
            for (int j = 0; j < height; j++) 
            { 
               sumB = 0;
               sumR = 0;
               sumG = 0;
                
               try
               {
                     P[0]=img.getRGB(i-1,j-1);
                     P[1]=img.getRGB(i-1,j);
                     P[2]=img.getRGB(i-1,j+1);
                     P[3]=img.getRGB(i,j+1);
                     P[4]=img.getRGB(i+1,j+1);
                     P[5]=img.getRGB(i+1,j);
                     P[6]=img.getRGB(i+1,j-1);
                     P[7]=img.getRGB(i,j-1);
                     P[8]=img.getRGB(i,j);
               }
               catch(IndexOutOfBoundsException e)
               {
                     P[0]=0;
                     P[1]=0;
                     P[2]=0;
                     P[3]=0;
                     P[4]=0;
                     P[5]=0;
                     P[6]=0;
                     P[7]=0;
                     P[8]=img.getRGB(i,j);   
               }

               for(int k=0;k<9;k++)
               {                   
                   R[k] = (P[k]>>16)&0xff;
                   B[k] = (P[k]>>8)&0xff; 
                   G[k] = P[k]&0xff; 
               }
               
               Arrays.sort(R);
               Arrays.sort(B);
               Arrays.sort(G);
               
               pixel = (255<<24) | (R[4]<<16) | (B[4]<<8) | G[4]; 
               
               tmp.setRGB(i, j, pixel); 
            }   
        }
        setImgTmp(copyImage(tmp));
        ImageIcon imageIcon = new ImageIcon(tmp);

        jl_imageDest.setIcon(imageIcon);
    }
    
    public void MeanFilter()
    {
        BufferedImage img = copyImage(getImgSrc());
        BufferedImage tmp = copyImage(getImgSrc());
        
        int[] P=new int[9];
        int[] R=new int[9];
        int[] B=new int[9];
        int[] G=new int[9];
        
        int sumR = 0, sumB = 0, sumG = 0, avgR, avgB, avgG;
        int pixel;
        
        int width = img.getWidth(); 
        int height = img.getHeight(); 
  
        for (int i = 0; i < width; i++) 
        { 
            for (int j = 0; j < height; j++) 
            { 
               sumB = 0;
               sumR = 0;
               sumG = 0;
                
               try
               {
                     P[0]=img.getRGB(i-1,j-1);
                     P[1]=img.getRGB(i-1,j);
                     P[2]=img.getRGB(i-1,j+1);
                     P[3]=img.getRGB(i,j+1);
                     P[4]=img.getRGB(i+1,j+1);
                     P[5]=img.getRGB(i+1,j);
                     P[6]=img.getRGB(i+1,j-1);
                     P[7]=img.getRGB(i,j-1);
                     P[8]=img.getRGB(i,j);
               }
               catch(IndexOutOfBoundsException e)
               {
                     P[0]=0;
                     P[1]=0;
                     P[2]=0;
                     P[3]=0;
                     P[4]=0;
                     P[5]=0;
                     P[6]=0;
                     P[7]=0;
                     P[8]=img.getRGB(i,j);   
               }

               for(int k=0;k<9;k++)
               {                   
                   R[k] = (P[k]>>16)&0xff;
                   B[k] = (P[k]>>8)&0xff; 
                   G[k] = P[k]&0xff; 
               }
               
               for(int k=0;k<9;k++)
               {                   
                   sumR += R[k];
                   sumB += B[k];
                   sumG += G[k];
               }
               
               avgR = sumR/R.length;
               avgB = sumB/B.length;
               avgG = sumG/G.length;
               
               pixel = (255<<24) | (avgR<<16) | (avgB<<8) | avgG; 
               
               tmp.setRGB(i, j, pixel); 
            }   
        }
        setImgTmp(copyImage(tmp));
        ImageIcon imageIcon = new ImageIcon(tmp);

        jl_imageDest.setIcon(imageIcon);
        
    }
    
    public BufferedImage Erosion(int val, BufferedImage imgin)
    {
        BufferedImage img = copyImage(getImgSrc());
        BufferedImage tmp = copyImage(getImgSrc());
        
        if(imgin != null)
        {
            img = copyImage(imgin);
        }
        
        img = Threshold(val);
        
        int[] P = new int[9]; // Pixel
        int[] Avg = new int[9];
        
        int r, g, b;
        int max = 0; // de base on part de 0
        int pixel;
        
        int width = img.getWidth(); 
        int height = img.getHeight(); 
  
        for (int i = 0; i < width; i++) 
        { 
            for (int j = 0; j < height; j++) 
            { 
               max = 0;
               try
               {
                     P[0]=img.getRGB(i-1,j-1);
                     P[1]=img.getRGB(i-1,j);
                     P[2]=img.getRGB(i-1,j+1);
                     P[3]=img.getRGB(i,j+1);
                     P[4]=img.getRGB(i+1,j+1);
                     P[5]=img.getRGB(i+1,j);
                     P[6]=img.getRGB(i+1,j-1);
                     P[7]=img.getRGB(i,j-1);
                     P[8]=img.getRGB(i,j);
               }
               catch(IndexOutOfBoundsException e)
               {
                     P[0]=0;
                     P[1]=0;
                     P[2]=0;
                     P[3]=0;
                     P[4]=0;
                     P[5]=0;
                     P[6]=0;
                     P[7]=0;
                     P[8]=img.getRGB(i,j);   
               }

               for(int k=0; k<9; k++)
               {                   
                   Avg[k] = (P[k]>>16)&0xff; // Les 3 pixels ont la même valeur car on travaille en seuillé
               }

               
               for(int k = 0; k < 9; k++)
               {
                   if(Avg[k] == 255 && k != 4)
                   {
                       max = 255;
                       break;
                   }
               }
               
               if(max == 255)
               {
                   pixel = (255<<24) | (255<<16) | (255<<8) | 255; 
               }
               else
               {
                   pixel = (255<<24) | (0<<16) | (0<<8) | 0; 
               }
                
                tmp.setRGB(i, j, pixel);
            }   
        }
        
        setImgTmp(copyImage(tmp));
        ImageIcon imageIcon = new ImageIcon(tmp);

        jl_imageDest.setIcon(imageIcon);
        
        return tmp;
    }
    
    public BufferedImage Dilatation(int val, BufferedImage imgin)
    {
        BufferedImage img = copyImage(getImgSrc());
        BufferedImage tmp = copyImage(getImgSrc());
        
        if(imgin != null)
        {
            img = copyImage(imgin);
        }
        
        img = Threshold(val);
        
        int[] P = new int[9]; // Pixel
        int[] Avg = new int[9];
        
        int r, g, b;
        int min = 255; // de base on part de 255
        int pixel;
        
        int width = img.getWidth(); 
        int height = img.getHeight(); 
  
        for (int i = 0; i < width; i++) 
        { 
            for (int j = 0; j < height; j++) 
            { 
               min = 255;
               try
               {
                     P[0]=img.getRGB(i-1,j-1);
                     P[1]=img.getRGB(i-1,j);
                     P[2]=img.getRGB(i-1,j+1);
                     P[3]=img.getRGB(i,j+1);
                     P[4]=img.getRGB(i+1,j+1);
                     P[5]=img.getRGB(i+1,j);
                     P[6]=img.getRGB(i+1,j-1);
                     P[7]=img.getRGB(i,j-1);
                     P[8]=img.getRGB(i,j);
               }
               catch(IndexOutOfBoundsException e)
               {
                     P[0]=0;
                     P[1]=0;
                     P[2]=0;
                     P[3]=0;
                     P[4]=0;
                     P[5]=0;
                     P[6]=0;
                     P[7]=0;
                     P[8]=img.getRGB(i,j);   
               }

               for(int k=0; k<9; k++)
               {                   
                   Avg[k] = (P[k]>>16)&0xff; // Les 3 pixels ont la même valeur car on travaille en seuillé
               }

               
               for(int k = 0; k < 9; k++)
               {
                   if(Avg[k] == 0 && k != 4)
                   {
                       min = 0;
                       break;
                   }
               }
               
               if(min == 255)
               {
                   pixel = (255<<24) | (255<<16) | (255<<8) | 255; 
               }
               else
               {
                   pixel = (255<<24) | (0<<16) | (0<<8) | 0; 
               }
                
                tmp.setRGB(i, j, pixel);
            }   
        }
        setImgTmp(copyImage(tmp));
        ImageIcon imageIcon = new ImageIcon(tmp);

        jl_imageDest.setIcon(imageIcon);
        
        return tmp;
    }
    
    public BufferedImage Threshold(int val)
    {        
        
        BufferedImage tmp = copyImage(getImgSrc());
        
        int width = tmp.getWidth(); 
        int height = tmp.getHeight();
        
        //Image dimg = tmp.getScaledInstance((int)(tmp.getWidth()), (int)(tmp.getHeight()), Image.SCALE_SMOOTH);
        
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                int p = tmp.getRGB(x,y); 
  
                int a = (p>>24)&0xff; 
                int r = (p>>16)&0xff;
                int g = (p>>8)&0xff; 
                int b = p&0xff; 
                
                int avg = (r+g+b)/3; 
                
                if(avg <= val)
                {
                    avg = 0;
                }
                else
                {
                    avg = 255;
                }
                a = 255; // opaque, pour etre sur

                p = (a<<24) | (avg<<16) | (avg<<8) | avg; 

                tmp.setRGB(x, y, p); 
            } 
        }
        setImgTmp(copyImage(tmp));
        ImageIcon imageIcon = new ImageIcon(tmp);

        jl_imageDest.setIcon(imageIcon);
        
        return tmp;
    }
    
    public void applyColor(BufferedImage img)
    {        
        setImgTmp(copyImage(img));
        ImageIcon imageIcon = new ImageIcon(img);
        jl_imageDest.setIcon(imageIcon);      
    }
    
    public void CancelColor()
    {
        
    }
    
    public static BufferedImage copyImage(BufferedImage source){
        BufferedImage b = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
        Graphics g = b.getGraphics();
        g.drawImage(source, 0, 0, null);
        g.dispose();
        return b;
    }
    
    public void Negative()
    {
        BufferedImage img = copyImage(getImgSrc());
        BufferedImage tmp = img;
        
        int width = img.getWidth(); 
        int height = img.getHeight(); 
  
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                int p = img.getRGB(x,y); 
  
                int a = 255 - (p>>24)&0xff; 
                int r = 255 - (p>>16)&0xff; 
                int g = 255 - (p>>8)&0xff; 
                int b = 255 - p&0xff; 

                p = (a<<24) | (r<<16) | (g<<8) | b; 

                tmp.setRGB(x, y, p); 
            } 
        }
        
        setImgTmp(copyImage(tmp));
        
        ImageIcon imageIcon = new ImageIcon(tmp);

        jl_imageDest.setIcon(imageIcon);
    }
    
    public void Greyscale(JLabel jl, BufferedImage img) 
    {   
        BufferedImage tmp = img;
        if(img == null)
        {
            img = copyImage(getImgSrc());
            tmp = img;
        }

        int width = img.getWidth(); 
        int height = img.getHeight(); 
  
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                int p = img.getRGB(x,y); 
  
                int a = (p>>24)&0xff; 
                int r = (p>>16)&0xff; 
                int g = (p>>8)&0xff; 
                int b = p&0xff; 
  
                // moyenne
                int avg = (r+g+b)/3; 
  
                // On remet les valeurs dans le byte p
                p = (a<<24) | (avg<<16) | (avg<<8) | avg; 

                tmp.setRGB(x, y, p); 
            } 
        }
        
        setImgTmp(copyImage(tmp));
        
        ImageIcon imageIcon = new ImageIcon(tmp);

        jl.setIcon(imageIcon);
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGreyscale;
    private javax.swing.JButton JB_Color;
    private javax.swing.JButton JB_Dilatation1;
    private javax.swing.JButton JB_Erosion;
    private javax.swing.JButton JB_Fermeture;
    private javax.swing.JButton JB_Gauss;
    private javax.swing.JButton JB_Kirsch;
    private javax.swing.JButton JB_Laplacian;
    private javax.swing.JButton JB_Mean;
    private javax.swing.JButton JB_Median;
    private javax.swing.JButton JB_Multi_Treshold;
    private javax.swing.JButton JB_Ouverture;
    private javax.swing.JButton JB_Prewitt;
    private javax.swing.JButton JB_Roberts;
    private javax.swing.JButton JB_SelectFile;
    private javax.swing.JButton JB_Sobel;
    private javax.swing.JButton JB_reset;
    private javax.swing.JComboBox<String> JCB_Kirsch;
    private javax.swing.JComboBox<String> JCB_Roberts;
    private javax.swing.JTextField JTF_Morpho;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton jb_DestToSrc;
    private javax.swing.JButton jb_neg;
    private javax.swing.JButton jb_zoom;
    private javax.swing.JLabel jl_Threshold;
    private javax.swing.JLabel jl_fois;
    private javax.swing.JLabel jl_imageDest;
    private javax.swing.JLabel jl_imageSource;
    private javax.swing.JLabel jl_threshold;
    private javax.swing.JScrollPane jsc_imgdest;
    private javax.swing.JScrollPane jsp_imgsrc;
    private javax.swing.JTextField jtf_zoom_coeff;
    private javax.swing.JSlider slider_threshold1;
    // End of variables declaration//GEN-END:variables
}
