/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComputacaoG;
/**
*
* @author izabela
*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

//calsse utilizada para desenhar os pontos finais ta tela(resultado)
public class ImagemPainel extends JPanel {
	int vet1[] = new int[70];
        int vet2[]= new int[70];
        transf t = new transf();
        int janela = 0;
	public ImagemPainel(int[] v1,int[] v2, int j){
	  vet1 = v1;
          vet2 = v2;
          janela = j;
        
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Plano plano = new Plano(Janela.LARGURA,Janela.ALTO);
		plano.desenho(g2);
                if(janela ==0){
                //caso a janela seja a transf entao apenas mostramos os resultado
                // seja da reta ou da circunferencia
                  for(int i=0 ;i < vet1.length;i++){
                        Linea pt = new Linea(vet1[i]*10,vet2[i]*10,true);
		        pt.desenho(g2,Color.red);  
                      
                   }
                }
                else {
                    //caso a janela seja a segunda, entao mostra-se os pontos anteriores
                    // e a transformação dos mesmos
                      for(int i=0 ;i < vet1.length;i++){
                          //novas coordenadas:
                          Linea pt = new Linea(vet1[i]*10,vet2[i]*10,true);
		          pt.desenho(g2,Color.red); 
                          //coordenadas anteriores :
                          pt = new Linea(t.vetX[i]*10, t.vetY[i]*10,true);
                          pt.desenho(g2,Color.BLUE);
                       }
                }
              
		
	}

	
	
}