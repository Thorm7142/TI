/* 
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
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
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
import javax.swing.JPanel;
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
    
    int x1, y1, x2, y2;
    int ROI = 0;
    
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
        JB_ROI = new javax.swing.JButton();
        jl_ROI = new javax.swing.JLabel();
        jtf_sigma = new javax.swing.JTextField();
        jl_sigma = new javax.swing.JLabel();
        JB_Src_to_dest = new javax.swing.JButton();
        JB_Egalisation = new javax.swing.JButton();
        JB_Expansion = new javax.swing.JButton();
        jtf_exp_x = new javax.swing.JTextField();
        jtf_exp_y = new javax.swing.JTextField();
        jl_x = new javax.swing.JLabel();
        jl_y = new javax.swing.JLabel();
        jl_histo_dst = new javax.swing.JLabel();
        jl_histo_src = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMI_Save = new javax.swing.JMenuItem();
        JMI_Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Traitement d'Image");

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
        jl_imageSource.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl_imageSourceMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jl_imageSourceMouseReleased(evt);
            }
        });
        jsp_imgsrc.setViewportView(jl_imageSource);

        jl_imageDest.setMaximumSize(new java.awt.Dimension(500, 500));
        jl_imageDest.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jl_imageDestMouseWheelMoved(evt);
            }
        });
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
        jl_threshold.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
        JB_Gauss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_GaussActionPerformed(evt);
            }
        });

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

        JB_ROI.setText("R.O.I.");
        JB_ROI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ROIActionPerformed(evt);
            }
        });

        jl_ROI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jl_sigma.setText("Sigma : ");

        JB_Src_to_dest.setText(">>");
        JB_Src_to_dest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Src_to_destActionPerformed(evt);
            }
        });

        JB_Egalisation.setText("Egalisation");
        JB_Egalisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_EgalisationActionPerformed(evt);
            }
        });

        JB_Expansion.setText("Expansion");
        JB_Expansion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ExpansionActionPerformed(evt);
            }
        });

        jl_x.setText("x : ");

        jl_y.setText("y : ");

        jMenu1.setText("File");
        jMenu1.setToolTipText("");

        JMI_Save.setText("Save");
        JMI_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_SaveActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_Save);

        JMI_Exit.setText("Exit");
        JMI_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_Exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JB_SelectFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JB_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JB_Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jb_neg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JB_Median, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JB_Mean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JBGreyscale))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JB_ROI, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JB_Multi_Treshold)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jb_zoom)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jl_fois)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtf_zoom_coeff, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JB_Prewitt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JB_Laplacian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JB_Sobel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JB_Gauss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JB_Roberts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JB_Kirsch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jl_ROI, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JCB_Kirsch, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JCB_Roberts, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jl_sigma)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtf_sigma, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(JB_Expansion, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jl_y, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jl_x))
                                                .addGap(72, 72, 72))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtf_exp_x, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtf_exp_y, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slider_threshold1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(JB_Dilatation1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(JB_Erosion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(JB_Ouverture, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(JB_Fermeture))
                                        .addGap(75, 75, 75)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jl_threshold, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JTF_Morpho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jl_Threshold)
                                .addGap(145, 145, 145))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jsp_imgsrc, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jl_histo_src, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JB_Egalisation)
                                .addGap(75, 75, 75)
                                .addComponent(jl_histo_dst, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jb_DestToSrc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JB_Src_to_dest, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addComponent(jsc_imgdest, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_SelectFile)
                            .addComponent(JB_reset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jb_zoom)
                                        .addComponent(jl_fois)
                                        .addComponent(jtf_zoom_coeff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JBGreyscale))
                                    .addComponent(JB_Kirsch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jb_neg)
                                    .addComponent(JB_ROI))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JB_Mean)
                                    .addComponent(JB_Multi_Treshold))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JB_Laplacian))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(JCB_Kirsch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JB_Roberts)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(JB_Gauss)
                                            .addComponent(jl_sigma)
                                            .addComponent(jtf_sigma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JB_Median))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(JCB_Roberts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(JB_Expansion))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtf_exp_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jl_x))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtf_exp_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jl_y)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(JB_Prewitt)
                                            .addComponent(JB_Color))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JB_Sobel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jl_ROI, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jl_Threshold)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(slider_threshold1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jl_threshold, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(JTF_Morpho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JB_Erosion)
                                .addGap(9, 9, 9)
                                .addComponent(JB_Dilatation1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JB_Ouverture)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JB_Fermeture)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jb_DestToSrc)
                        .addGap(18, 18, 18)
                        .addComponent(JB_Src_to_dest))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jsp_imgsrc, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addComponent(jsc_imgdest))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_histo_src, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_histo_dst, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JB_Egalisation)
                        .addGap(69, 69, 69))))
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
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_JBGreyscaleActionPerformed

    private void JMI_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JMI_ExitActionPerformed

    private void jb_zoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_zoomActionPerformed
        
        BufferedImage img = copyImage(getImgSrc());
        String s = jtf_zoom_coeff.getText();
        if(!(s.equals(""))) // Si le champs n'est pas vide
        {
            float coeff = Float.parseFloat(s);       
        
            Image dimg = img.getScaledInstance((int)(img.getWidth()*coeff), (int)(img.getHeight()*coeff), Image.SCALE_DEFAULT);
            
            BufferedImage tmp = copyImage(toBufferedImage(dimg));          
            
            setImgTmp(copyImage(tmp));
            
            ImageIcon imageIcon = new ImageIcon(tmp);
            
            jl_imageDest.setIcon(imageIcon);
        }
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_jb_zoomActionPerformed
    
    
    private void jtf_zoom_coeffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_zoom_coeffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_zoom_coeffActionPerformed

    private void jb_DestToSrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_DestToSrcActionPerformed
                
        setImgSrc(copyImage(getImgTmp()));
        
        ImageIcon imageIcon = new ImageIcon(getImgSrc());
        
        jl_imageSource.setIcon(imageIcon);
        
        updateHistogram(copyImage(getImgSrc()), jl_histo_dst);
        
    }//GEN-LAST:event_jb_DestToSrcActionPerformed

    private void jb_negActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_negActionPerformed
        Negative();
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_jb_negActionPerformed

    private void slider_threshold1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_threshold1StateChanged
        int val = slider_threshold1.getValue();
        
        jl_threshold.setText(String.valueOf(val));
        
        Threshold(val);
    }//GEN-LAST:event_slider_threshold1StateChanged

    private void JB_MeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_MeanActionPerformed
        MeanFilter();
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_JB_MeanActionPerformed

    private void JB_MedianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_MedianActionPerformed
        MedianFilter();
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_JB_MedianActionPerformed

    private void JB_SobelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_SobelActionPerformed
        SobelFilter();
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_JB_SobelActionPerformed

    private void JB_PrewittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_PrewittActionPerformed
        PrewittFilter();
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_JB_PrewittActionPerformed

    private void JB_LaplacianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_LaplacianActionPerformed
        LaplacianFilter();
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_JB_LaplacianActionPerformed

    private void JB_RobertsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_RobertsActionPerformed
        String centre = JCB_Roberts.getModel().getSelectedItem().toString();
        RobertCrossFilter(centre);
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_JB_RobertsActionPerformed

    private void JB_KirschActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_KirschActionPerformed
        String centre = JCB_Kirsch.getModel().getSelectedItem().toString();
        KirschFilter(centre);
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
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
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
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
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
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
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
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
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_JB_FermetureActionPerformed

    private void JB_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_resetActionPerformed
        setImgSrc(copyImage(getImgOri()));
        
        ImageIcon imageIcon = new ImageIcon(getImgSrc());
        
        jl_imageSource.setIcon(imageIcon);
        
        updateHistogram(copyImage(getImgOri()), jl_histo_dst);
    }//GEN-LAST:event_JB_resetActionPerformed

    private void JB_Multi_TresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Multi_TresholdActionPerformed
        multiThresholdWindow mtw = new multiThresholdWindow(this);
        mtw.setVisible(true);
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_JB_Multi_TresholdActionPerformed

    private void JB_ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ColorActionPerformed
        ColorChooserWindow ccw = new ColorChooserWindow(this);
        ccw.setVisible(true);
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_JB_ColorActionPerformed

    private void JB_ROIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ROIActionPerformed
        if(JB_ROI.getText().equals("R.O.I.")) {
            jl_ROI.setText("SELECTION DE ROI EN COURS");
            ROI = 1;  
        }
    }//GEN-LAST:event_JB_ROIActionPerformed

    private void jl_imageSourceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_imageSourceMouseReleased
        x2 = evt.getX();
        y2 = evt.getY(); 
        
        BufferedImage img = copyImage(getImgSrc());
        
        // on calcule le rectangle selectionné et on affiche l'image correspondante en destination 
        if(ROI == 1) {
            Rectangle rect = new Rectangle(x1, y1, x2-x1, y2-y1); 
            JB_ROI.setText("R.O.I."); 
            jl_ROI.setText("");
            img = img.getSubimage((int)(rect.x), (int)(rect.y), (int)(rect.width), (int)(rect.height)); 
            
            setImgTmp(copyImage(img));
            Icon ico = new ImageIcon(img);
            jl_imageDest.setIcon(ico); 
            updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
            ROI = 0;
        }
    }//GEN-LAST:event_jl_imageSourceMouseReleased

    private void jl_imageSourceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_imageSourceMousePressed
        x1 = evt.getX();
        y1 = evt.getY(); 
    }//GEN-LAST:event_jl_imageSourceMousePressed

    private void JB_GaussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_GaussActionPerformed
        double sigma = Double.parseDouble(jtf_sigma.getText());
        GaussianFilter(sigma);
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_JB_GaussActionPerformed

    private void JMI_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_SaveActionPerformed
         
        JFileChooser fileChooser = new JFileChooser();
        
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("jpg", "jpg"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("png", "png"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("bmp", "bmp"));
        
        fileChooser.setAcceptAllFileFilterUsed(false); // On empêche à l'utilsateur de choisir d'autres types,é vite de devoir check par après
        fileChooser.setDialogTitle("Specify a file to save");
        File fileToSave = null;

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) 
        {
            fileToSave = getSelectedFileWithExtension(fileChooser);
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
        }
        

        BufferedImage bi = copyImage(getImgTmp());  // retrieve image
        //File outputfile = new File("saved.png");
        try {
            ImageIO.write(bi, "png", fileToSave);
        } catch (IOException ex) {
            System.out.println("Erreur d'écriture");
        }

    }//GEN-LAST:event_JMI_SaveActionPerformed

    private void jl_imageDestMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jl_imageDestMouseWheelMoved
        BufferedImage img =null;
        if(getImgTmp() == null)
        {
            setImgTmp(copyImage(getImgSrc()));
        }
        img = copyImage(getImgTmp());
        double coeff = 1.0;
        
        if (evt.getWheelRotation() < 0) {
            coeff *= 1.1;
        } else {
            coeff *= 0.9;
        }

        Image dimg = img.getScaledInstance((int)(img.getWidth()*coeff), (int)(img.getHeight()*coeff), Image.SCALE_DEFAULT);

        BufferedImage tmp = copyImage(toBufferedImage(dimg));          

        setImgTmp(copyImage(tmp));

        ImageIcon imageIcon = new ImageIcon(tmp);

        jl_imageDest.setIcon(imageIcon);
    }//GEN-LAST:event_jl_imageDestMouseWheelMoved

    private void JB_Src_to_destActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Src_to_destActionPerformed
        setImgTmp(copyImage(getImgSrc()));
        
        ImageIcon imageIcon = new ImageIcon(getImgTmp());
        
        jl_imageDest.setIcon(imageIcon);
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_JB_Src_to_destActionPerformed

    private void JB_EgalisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_EgalisationActionPerformed
        Egalisation();
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_JB_EgalisationActionPerformed

    private void JB_ExpansionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ExpansionActionPerformed
        float x, y;
        
        x = Float.parseFloat(jtf_exp_x.getText());
        y = Float.parseFloat(jtf_exp_y.getText());
        
        Expansion(x, y);
        updateHistogram(copyImage(getImgTmp()), jl_histo_dst);
    }//GEN-LAST:event_JB_ExpansionActionPerformed
      
    public static File getSelectedFileWithExtension(JFileChooser c) {
    File file = c.getSelectedFile();
    if (c.getFileFilter() instanceof FileNameExtensionFilter) {
        String[] exts = ((FileNameExtensionFilter)c.getFileFilter()).getExtensions();
        String nameLower = file.getName().toLowerCase();
        for (String ext : exts) { 
            if (nameLower.endsWith('.' + ext.toLowerCase())) {
                return file;
            }
        }

        file = new File(file.toString() + '.' + exts[0]);
    }
    return file;
}
    
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
        updateHistogram(copyImage(getImgSrc()), jl_histo_src);
    }
    
    private void updateHistogram(BufferedImage img, JLabel histog)
    {
        int[] values = new int[256];
        int highValue = 0;
        
        values = getPixelValues(img);
        
        for(int i = 0; i < 256; i++)
        {
            if(values[i] > values[highValue])
            {
                highValue = i;
            }
        }
        
        BufferedImage histo = new BufferedImage(histog.getWidth(), histog.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = histo.createGraphics();
        
        g2d.setColor(Color.RED);
        g2d.fillRect(0, 0, histo.getWidth(), histo.getHeight());
        for(int i = 0; i < values.length; i++)
        {
            g2d.setColor(new Color(i, i, i));
            g2d.drawLine(i, histo.getHeight(), i, histo.getHeight() - (int) ((double)values[i]/values[highValue]*histo.getHeight()));
        }
        g2d.dispose();
        histog.setIcon(new ImageIcon(histo));
    }
    
    private static int get(int self, int n)
    {
        return (self >> (n * 8)) & 0xFF;
    }
 
    private static float lerp(float s, float e, float t)
    {
        return s + (e - s) * t;
    }
 
    private static float blerp(final Float c00, float c10, float c01, float c11, float tx, float ty)
    {
        return lerp(lerp(c00, c10, tx), lerp(c01, c11, tx), ty);
    }    
    
    public void Expansion(float scaleX, float scaleY)
    {
        BufferedImage img = copyImage(getImgSrc());
        int newWidth = (int) (img.getWidth() * scaleX);
        int newHeight = (int) (img.getHeight() * scaleY);
        BufferedImage newImage = new BufferedImage(newWidth, newHeight, img.getType());
        for (int x = 0; x < newWidth; ++x) {
            for (int y = 0; y < newHeight; ++y) {
                float gx = ((float) x) / newWidth * (img.getWidth() - 1);
                float gy = ((float) y) / newHeight * (img.getHeight() - 1);
                int gxi = (int) gx;
                int gyi = (int) gy;
                int rgb = 0;
                int c00 = img.getRGB(gxi, gyi);
                int c10 = img.getRGB(gxi + 1, gyi);
                int c01 = img.getRGB(gxi, gyi + 1);
                int c11 = img.getRGB(gxi + 1, gyi + 1);
                for (int i = 0; i <= 2; ++i) {
                    float b00 = get(c00, i);
                    float b10 = get(c10, i);
                    float b01 = get(c01, i);
                    float b11 = get(c11, i);
                    int ble = ((int) blerp(b00, b10, b01, b11, gx - gxi, gy - gyi)) << (8 * i);
                    rgb = rgb | ble;
                }
                newImage.setRGB(x, y, rgb);
            }
        }
        
        setImgTmp(copyImage(newImage));
        ImageIcon imageIcon = new ImageIcon(newImage);

        jl_imageDest.setIcon(imageIcon);
    }

    public void Egalisation()
    {
        BufferedImage img = copyImage(getImgSrc());
        BufferedImage tmp = copyImage(getImgSrc());
        
        int[] pixels = new int[256];
        int pixtemp;
        int r,g,b;
        
        pixels = courbeTonale();
        
        int width = img.getWidth();
        int height = img.getHeight();
        
        for (int i = 0; i < width; i++) 
        { 
            for (int j = 0; j < height; j++) 
            { 
                pixtemp = img.getRGB(i, j);
                
                r = (pixtemp>>16)&0xff;
                b = (pixtemp>>8)&0xff; 
                g = pixtemp&0xff;

                pixtemp = (r+b+g)/3;
                
                pixtemp = pixels[pixtemp]; // On remplace par la nouvelle valeur, via la courbe tonale
                
                pixtemp = (255<<24) | (pixtemp<<16) | (pixtemp<<8) | pixtemp;
                
                tmp.setRGB(i, j, pixtemp); 
            }   
        }
        setImgTmp(copyImage(tmp));
        ImageIcon imageIcon = new ImageIcon(tmp);

        jl_imageDest.setIcon(imageIcon);
    }
    
    public int[] courbeTonale()
    {
        int[] pixels = new int[255];
        int[] replace = new int[256];
        pixels = getPixelValues(copyImage(getImgSrc()));
        
        int indice0 = 0;
        int indicediff;
        int difference = 0;
        int increment = 0;
        
        for(int i = 0; i < 255; i++)
        {
            if(pixels[i] != 0)
            {
                difference++;
            }
        } // On a le nombre de d'éléments différents de 0
        
        increment = 255/difference;
        
        int j = 0;
        for(int i = 0; i < 256; i++) // Pour chaque élément, on met à l'indice qui le représente la nouvelle valeur
        {
            if(pixels[i] != 0)
            {
                replace[i] = j*increment;                
                j++;
            }
        }
        
        while(j <256)
        {
            replace[j] = 255;
            j++;
        } // Au dessus c'est 255
        
        return replace; 
    }
    
    /*
        On récupère la quantité de chaque pixel
    */
    public int[] getPixelValues(BufferedImage img)
    {
        
        int[] pixels = new int[256];
        int pixtemp;
        int r, g, b;
        
        for(int i = 0;i < 256; i++)
        {
            pixels[i] = 0;
        }
        
        int width = img.getWidth(); 
        int height = img.getHeight(); 
  
        for (int i = 0; i < width; i++) 
        { 
            for (int j = 0; j < height; j++) 
            { 
                pixtemp = img.getRGB(i, j);
                
                r = (pixtemp>>16)&0xff;
                b = (pixtemp>>8)&0xff; 
                g = pixtemp&0xff;

                pixtemp = (r+b+g)/3;

                pixels[pixtemp] ++;
            }   
        }
        
       return pixels;
        
    }
    
    public double Gauss(int x, int y, double sigma)
    {
        double coeff = 1/(2*Math.PI*sigma*sigma);
        double exposant = -((x*x + y*y) / (2*sigma*sigma));
        double res = coeff*Math.pow(Math.E, exposant);
        
        return res;
    }
    
    public void GaussianFilter(double sigma)
    {
        int taille = (int) (2* Math.ceil((3*sigma)) + 1);
        
        double[][] masque = new double[taille][taille];
        int x, y, i = 0, j = 0;
        int pixel;
        
        x = -(int)(Math.floor(taille/2));
        y = -(int)(Math.floor(taille/2));
        
        
        // Calcul du masque
        for(i = 0; i < taille; i++)
        {
            x = -(int)(Math.floor(taille/2));
            for(j = 0; j < taille; j++)
            {
                masque[i][j] = Gauss(x, y, sigma);
                x++;
            }
            y++;
        }
        
        // Calcul de la matrice normalisée entière
        double tmpmin = masque[0][0];
        double sum = 0;
        for(i = 0; i < taille; i++)
        {
            for(j = 0; j < taille; j++)
            {
                masque[i][j] = masque[i][j]/tmpmin;
                sum += masque[i][j];
            }
        }
        
        int tot = (int)sum;
        
        BufferedImage img = copyImage(getImgSrc());
        BufferedImage tmp = copyImage(getImgSrc());
        
        int[][] P = new int[taille][taille]; // Pixel
        
        int[][] r = new int[taille][taille];
        int[][] g = new int[taille][taille];
        int[][] b = new int[taille][taille];
          
        int width = img.getWidth(); 
        int height = img.getHeight(); 
  
        int k, l;
        double resR = 0;
        double resB = 0;
        double resG = 0;
        
        x = -(int)(Math.floor(taille/2));
        y = -(int)(Math.floor(taille/2));
        
        // boucle de parcours de l'image
        for (i = 0; i < width; i++) 
        { 
            for (j = 0; j < height; j++) 
            { 
               try
               {
                   // Recuperation des taille*taille pixels autours du pixel actuel
                   for(k = 0; k < taille; k++)
                   {
                       for(l = 0; l < taille; l++)
                       {
                           P[k][l] = img.getRGB(i-x+k , j-y+l);
                       }
                   }
                     
               }
               catch(IndexOutOfBoundsException e) // Si en dehors de l'image, on pourrait faire mieux que 0
               {
                   for(k = 0; k < taille; k++)
                   {
                       for(l = 0; l < taille; l++)
                       {
                           P[k][l] = 0;
                       }
                   }
               }

               // Grayscale pour chaque pixel
               for(k = 0; k < taille; k++)
                {
                    for(l = 0; l < taille; l++)
                    {
                        r[k][l] = (P[k][l]>>16)&0xff;
                        b[k][l] = (P[k][l]>>8)&0xff; 
                        g[k][l] = P[k][l]&0xff;
                    }
                }
               
               // Application du masque
               resR = 0;
               resB = 0;
               resG = 0;
               for(k = 0; k < taille; k++)
                {
                    for(l = 0; l < taille; l++)
                    {
                        resR += (masque[k][l]* (double)(r[k][l]));
                        resB += (masque[k][l]* (double)(b[k][l]));
                        resG += (masque[k][l]* (double)(g[k][l]));
                    }
                }
               //System.out.println("res = " + res);

               resR /= (double)tot; // Ne pas oublier de diviser par le total pour récupérer des valeurs cohérentes
               resB /= (double)tot;
               resG /= (double)tot;
               
               resR = Math.abs(resR);
               resB = Math.abs(resB);
               resG = Math.abs(resG);
                
               pixel = ( (255<<24) | ((int)resR<<16) | ((int)resB<<8) | (int)resG); 
               
               tmp.setRGB(i, j, pixel); // On met le pixel dans la nouvelle image
        
            }
        }
        
        setImgTmp(copyImage(tmp));
        ImageIcon imageIcon = new ImageIcon(tmp);

        jl_imageDest.setIcon(imageIcon);
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
                    case "NE" : max = res[2];
                                break;
                    case "E" :  max = res[4];
                                break;
                    case "SE" : max = res[7];
                                break;
                    case "S" :  max = res[6];
                                break;
                    case "SO" : max = res[5];
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
    
    public static BufferedImage toBufferedImage(Image img)
    {
        if (img instanceof BufferedImage)
        {
            return (BufferedImage) img;
        }

        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        return bimage;
    }
    
    public void applyImage(BufferedImage img)
    {        
        setImgTmp(copyImage(img));
        ImageIcon imageIcon = new ImageIcon(img);
        jl_imageDest.setIcon(imageIcon);      
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
    private javax.swing.JButton JB_Egalisation;
    private javax.swing.JButton JB_Erosion;
    private javax.swing.JButton JB_Expansion;
    private javax.swing.JButton JB_Fermeture;
    private javax.swing.JButton JB_Gauss;
    private javax.swing.JButton JB_Kirsch;
    private javax.swing.JButton JB_Laplacian;
    private javax.swing.JButton JB_Mean;
    private javax.swing.JButton JB_Median;
    private javax.swing.JButton JB_Multi_Treshold;
    private javax.swing.JButton JB_Ouverture;
    private javax.swing.JButton JB_Prewitt;
    private javax.swing.JButton JB_ROI;
    private javax.swing.JButton JB_Roberts;
    private javax.swing.JButton JB_SelectFile;
    private javax.swing.JButton JB_Sobel;
    private javax.swing.JButton JB_Src_to_dest;
    private javax.swing.JButton JB_reset;
    private javax.swing.JComboBox<String> JCB_Kirsch;
    private javax.swing.JComboBox<String> JCB_Roberts;
    private javax.swing.JMenuItem JMI_Exit;
    private javax.swing.JMenuItem JMI_Save;
    private javax.swing.JTextField JTF_Morpho;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jb_DestToSrc;
    private javax.swing.JButton jb_neg;
    private javax.swing.JButton jb_zoom;
    private javax.swing.JLabel jl_ROI;
    private javax.swing.JLabel jl_Threshold;
    private javax.swing.JLabel jl_fois;
    private javax.swing.JLabel jl_histo_dst;
    private javax.swing.JLabel jl_histo_src;
    private javax.swing.JLabel jl_imageDest;
    private javax.swing.JLabel jl_imageSource;
    private javax.swing.JLabel jl_sigma;
    private javax.swing.JLabel jl_threshold;
    private javax.swing.JLabel jl_x;
    private javax.swing.JLabel jl_y;
    private javax.swing.JScrollPane jsc_imgdest;
    private javax.swing.JScrollPane jsp_imgsrc;
    private javax.swing.JTextField jtf_exp_x;
    private javax.swing.JTextField jtf_exp_y;
    private javax.swing.JTextField jtf_sigma;
    private javax.swing.JTextField jtf_zoom_coeff;
    private javax.swing.JSlider slider_threshold1;
    // End of variables declaration//GEN-END:variables
}
