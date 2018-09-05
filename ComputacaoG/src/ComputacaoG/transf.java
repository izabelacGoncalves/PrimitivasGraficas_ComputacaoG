/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComputacaoG;

import javax.swing.JOptionPane;

/**
import javax.swing.JOptionPane;

/**
 *
 * @author izabela
 */
public class transf extends javax.swing.JFrame {
    private static transf instance;
    public static int vetX[] = new int[70];
    public static int vetY[] = new int[70];
    public static int contador = 0;//controla os valores armazenados nos vetores acima.
    public static int prx = 0;
    public static int pry = 0;
    Janela j ;
    boolean estado=false; // variável utilizada para controlar se a janela de resultado
    //esta aberta ou não.
    public transf() {
        initComponents();
    }
    public static synchronized transf getInstance(){
        if(instance ==null){
           instance = new transf();   
        }
        return instance;
    }
    public void instancia(){
         estado = true;
         this.setAlwaysOnTop(true);
        
        j = new Janela(vetX,vetY,0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTx = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTy = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTprimXi = new javax.swing.JTextField();
        jTprimYi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnGR = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTprimXf = new javax.swing.JTextField();
        jTprimYf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxc = new javax.swing.JTextField();
        jTyc = new javax.swing.JTextField();
        jTraio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnGRBres = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("x:");

        jTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxActionPerformed(evt);
            }
        });

        jLabel2.setText("y:");

        jTy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTyActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnL.setText("Limpar");
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });

        btnF.setText("Finalizar");
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnF)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jTx, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jTy, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnL)
                    .addComponent(btnOK)
                    .addComponent(btnF))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jLabel5.setText("Transformadas:");

        jLabel6.setText("Primitivas Básicas:");

        jLabel7.setText("X i:");

        jLabel8.setText("Yi:");

        jTprimXi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTprimXiActionPerformed(evt);
            }
        });

        jTprimYi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTprimYiActionPerformed(evt);
            }
        });

        jLabel9.setText("Retas: ");

        btnGR.setText("Gerar DDA");
        btnGR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGRActionPerformed(evt);
            }
        });

        jLabel10.setText("X f:");

        jLabel11.setText("Yf:");

        jTprimYf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTprimYfActionPerformed(evt);
            }
        });

        jButton1.setText("GerarCirc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Circunferência: ");

        jLabel4.setText("Yc : ");

        jLabel12.setText("Xc : ");

        jTxc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxcActionPerformed(evt);
            }
        });

        jLabel13.setText("Raio:");

        btnGRBres.setText("Gerar Bres");
        btnGRBres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGRBresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel4))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTprimYi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTprimXi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTyc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTprimYf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTprimXf, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGR, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGRBres, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel13)
                                .addGap(5, 5, 5)
                                .addComponent(jTraio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTprimXi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jTprimXf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGR)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTprimYi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jTprimYf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnGRBres)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTxc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTraio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTyc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxActionPerformed
    private void jTyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTyActionPerformed
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
       try {
            // o metodo abaixo armazena os pontos digitados
            //para futuras operaçoes
            vetX[contador]= Integer.parseInt (jTx.getText());
            vetY[contador]= Integer.parseInt (jTy.getText());
            // limpando visor
           // System.out.println("saiu do ok"+vetX[contador]);
            jTx.setText("");
            jTy.setText("");  
            contador = contador + 1 ;
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Coordenadas inválidas no ok");             
        }
    }//GEN-LAST:event_btnOKActionPerformed
    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        // Limpa visor
        jTx.setText("");
        jTy.setText("");
    }//GEN-LAST:event_btnLActionPerformed
    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
    //  este metodo é usado para levar os pontos digitados ás operações
        //que podem ser feitas com os mesmos.
        if(estado){
              j.conf();
              vetX = new int[100];
              vetY = new int[100];
              estado = false;
        }
        this.dispose();
        new secondFrame(estado).setVisible(true);   
    }//GEN-LAST:event_btnFActionPerformed
    private void jTprimYiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTprimYiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTprimYiActionPerformed
    public double modula(double x){
        if(x < 0 ){
            return x * -1;
        }else {
            return x;
        }
   }
    public int arred(double a ){
          String m =""+a;
        String h ="";
        int resp=0;   
        for(int g = 0; g < m.length(); g++){
            if(m.charAt(g) =='.'){
                int b = Integer.parseInt(""+m.charAt(g+1));
                if(b >5 || b ==5){
                    resp = Integer.parseInt(h);
                    if( h.charAt(0) == '-' ){
                        resp = resp -1;
                    }
                    else{
                        resp = resp +1;
                    }
                }else {
                    resp = Integer.parseInt(h); 
                }
            }
          h = h +m.charAt(g);        
        }
     return resp;
    }
    
     public void dda(){
        //algoritmo para rasterização, utilizando apenas pontos iniciais e finais
        //calculando todos os outros vizinhos por meio de calculos abaixo : 
         try{
            double coordX[] = new double[70];
            double coordY[] = new double[70];
            double deltaX = Double.parseDouble(jTprimXf.getText()) - Double.parseDouble(jTprimXi.getText());
            double deltaY = Double.parseDouble(jTprimYf.getText()) - Double.parseDouble(jTprimYi.getText());
            double passos =0;
            int a= arred(modula(deltaX));
            int b= arred(modula(deltaY));
            coordX[0] = Integer.parseInt(jTprimXi.getText());
            coordY[0] = Integer.parseInt(jTprimYi.getText());
            if(a > b){
                passos = a;
            }else {
                passos = b;
            }
            double xincr= deltaX/ passos;
            double yincr = deltaY/ passos;
            for(int k=1; k <= passos;k++){
                coordX[k] = coordX[k-1] + (xincr);
                coordY[k] = coordY[k-1] + (yincr);
            } 
            
            for(int mo = 0; mo <= passos ; mo ++){
                vetX[mo] = arred(coordX[mo]);
                vetY[mo] = arred(coordY[mo]);
               
            }
            
          instancia();
       
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Coordenadas inválidas");  
        }
    }
    private void btnGRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRActionPerformed
        if(!estado){
            dda();
       } else {
            j.conf();
            estado = false;
            vetX = new int[70];
            vetY = new int[70];
            contador =0;
           dda();
       }
    }//GEN-LAST:event_btnGRActionPerformed
    private void jTprimXiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTprimXiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTprimXiActionPerformed

    private void jTprimYfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTprimYfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTprimYfActionPerformed

    private void jTxcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxcActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!estado){
            contador =0;
            brasCirc();
        }
        else {
            j.conf();
            estado = false;
            vetX = new int[70];
            vetY = new int[70];
            contador =0;
            brasCirc();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGRBresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRBresActionPerformed
        if(!estado){
            contador =0;
            gerarRetaB();
        }
        else {
            j.conf();
            estado = false;
            vetX = new int[70];
            vetY = new int[70];
            contador =0;
            gerarRetaB();
        }
    }//GEN-LAST:event_btnGRBresActionPerformed
    public void setP(int x,int y){
       vetX[contador] = x;
       vetY[contador] = y;
       contador ++;
    }
    public void gerarRetaB(){
        try{
             int x1 = Integer.parseInt(jTprimXi.getText());
             int y1 = Integer.parseInt(jTprimYi.getText());
             int x2 = Integer.parseInt(jTprimXf.getText());
             int y2 = Integer.parseInt(jTprimYf.getText());
             int dx, dy, x, y, i, const1, const2, p;
             dx = x2-x1;
             dy = y2-y1;
             int incrx=0;
             int incry=0;
             if (dx >= 0)
                 incrx = 1;
             else{ incrx= -1; dx= -dx;}
             if (dy >= 0)
                  incry = 1;
             else{ incry= -1; dy= -dy;}
                x = x1; y = y1;
                setP(x,y);
                if (dy < dx){ 
                   p = 2 * dy - dx;
                   const1 = 2*dy;
                   const2 = 2*(dy-dx);
                     for (i=0; i < dx; i++) {
                        x += incrx;
                        if (p < 0)
	                  p += const1;
                        else { y += incry;               
                           p+= const2;}
                            setP (x,y);
                    }         
                } 
            else { 
                 p =2*dx - dy; const1 = 2*dx; const2 = 2*(dx-dy);
                   for (i=0; i < dy; i++) {
                      y += incry;
                       if (p < 0)
	                p += const1;
                           else { x += incrx;               
                       p+= const2;}
                        setP(x,y);
                        }         
            }
     
      
         instancia();    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Coordenadas inválidas"); 
        }
   
      
    }
    public void plotar (int x, int y, int xcc, int ycc){
        int transladarX = 0;
        int transladarY = 0;
        if (xcc != 0 || ycc != 0){
            transladarX = xcc;
            transladarY = ycc;
        }
        
        vetX[contador] = xcc + x ;
        vetY[contador] = ycc + y ;
        
        contador = contador + 1;
        
        vetX[contador] = xcc - x ;
        vetY[contador] = ycc - y ;
        
        contador = contador + 1;
        
        vetX[contador] = xcc + x ;
        vetY[contador] = ycc - y ;
        
        contador = contador + 1;
        
        vetX[contador] = xcc - x ;
        vetY[contador] = ycc + y ;       
        
        contador = contador + 1;
        
        vetX[contador] = xcc + y ;
        vetY[contador] = ycc + x;
        
        contador = contador + 1;
        
        vetX[contador] = xcc + y ;
        vetY[contador] = ycc - x;
        
        contador = contador + 1;
        
        vetX[contador] = xcc - y ;
        vetY[contador] = ycc + x;
        
        contador = contador + 1;
        
        vetX[contador] = xcc - y ;
        vetY[contador] = ycc - x ;
        
       contador++;
    }

    public void brasCirc(){
        try{
         int xc = Integer.parseInt (jTxc.getText());
         int yc = Integer.parseInt (jTyc.getText());
         int r =  Integer.parseInt (jTraio.getText());
         int p = (3 - 2 * r);
         int x = 0;
         int y = r;
         int a = 0;
         plotar(x,y,xc,yc);
         while(x < y){
             if(p < 0){
                p += (4 * x + 6);   
             }else{
                 p += (4*(x -y) + 10);
                 y--;
             }
             x++;
             plotar(x,y,xc,yc);    
         }
     
         instancia();
         
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, "Coordenadas inválidas");  
        }
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
            java.util.logging.Logger.getLogger(transf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnGR;
    private javax.swing.JButton btnGRBres;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
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
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTprimXf;
    private javax.swing.JTextField jTprimXi;
    private javax.swing.JTextField jTprimYf;
    private javax.swing.JTextField jTprimYi;
    private javax.swing.JTextField jTraio;
    private javax.swing.JTextField jTx;
    private javax.swing.JTextField jTxc;
    private javax.swing.JTextField jTy;
    private javax.swing.JTextField jTyc;
    // End of variables declaration//GEN-END:variables
}
