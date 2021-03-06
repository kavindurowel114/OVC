/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package INTF;

import SYS.ovcconn;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author KaviRox
 */
public class Show extends javax.swing.JFrame {

    /**
     * Creates new form Show
     */
    public Show() {
        initComponents();
        setLocationRelativeTo(null);
        search();
        cast.setEditable(false);
        story.setEditable(false);
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMG/om.GIF")));
    }

    
    public void search(){
    
        String id = Movie_Search.jLabel4.getText();
        
        
        try {
             Statement s = ovcconn.DB().createStatement();
             ResultSet rs = s.executeQuery("SELECT * FROM movie_lib WHERE movie_id = '"+id+"'");
             
                while(rs.next()){
                
                    
                    quality.setText(rs.getString(2));
                    name.setText(rs.getString(3));
                    direct.setText(rs.getString(5));
                    genere.setText(rs.getString(4));
                    studio.setText(rs.getString(6));
                    country.setText(rs.getString(10));
                    relese.setText(rs.getString(7));
                    madey.setText(rs.getString(8));
                    run.setText(rs.getString(9));
                    cast.setText(rs.getString(12));
                    maina.setText(rs.getString(11));
                    story.setText(rs.getString(13));
                    price.setText("Rs."+rs.getString(16)+".00");
                    copy.setText(rs.getString(14));
                    
                    File ff = new File(rs.getString("poster"));
                    Image img = ImageIO.read(ff);
                    img = img.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
                    image.setIcon(new ImageIcon(img));
                
                }
             
                
                     
        } catch (Exception e) {
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        genere = new javax.swing.JLabel();
        country = new javax.swing.JLabel();
        direct = new javax.swing.JLabel();
        studio = new javax.swing.JLabel();
        relese = new javax.swing.JLabel();
        madey = new javax.swing.JLabel();
        run = new javax.swing.JLabel();
        quality = new javax.swing.JLabel();
        maina = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        story = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        cast = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        copy = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Zurich Ex BT", 1, 15)); // NOI18N
        jLabel1.setText("Movie Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        name.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 200, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Quality ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Genere");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Director");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Studio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Relese Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Year Of Made");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Running Time");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Country");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 20));

        price.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        price.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 110, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Cast");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Story Line");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, 20));

        genere.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        genere.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(genere, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 130, 20));

        country.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        country.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 130, 20));

        direct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        direct.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(direct, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 130, 20));

        studio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studio.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(studio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 130, 20));

        relese.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        relese.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(relese, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 130, 20));

        madey.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        madey.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(madey, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 130, 20));

        run.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        run.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(run, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 130, 20));

        quality.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quality.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(quality, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 130, 20));

        maina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maina.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(maina, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 130, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Movie Poster"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 140, 210));

        story.setColumns(20);
        story.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        story.setForeground(new java.awt.Color(0, 0, 204));
        story.setLineWrap(true);
        story.setRows(5);
        jScrollPane1.setViewportView(story);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 170, 120));

        cast.setColumns(20);
        cast.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cast.setForeground(new java.awt.Color(0, 0, 204));
        cast.setLineWrap(true);
        cast.setRows(5);
        jScrollPane2.setViewportView(cast);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 170, 120));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Main Actor");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Price");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Copies");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, 20));

        copy.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        copy.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 110, 20));

        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Designed & Developed by © K.V.R Creatives");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
           
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea cast;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel country;
    private javax.swing.JLabel direct;
    private javax.swing.JLabel genere;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel madey;
    private javax.swing.JLabel maina;
    private javax.swing.JLabel name;
    private javax.swing.JLabel price;
    private javax.swing.JLabel quality;
    private javax.swing.JLabel relese;
    private javax.swing.JLabel run;
    private javax.swing.JTextArea story;
    private javax.swing.JLabel studio;
    // End of variables declaration//GEN-END:variables
}
