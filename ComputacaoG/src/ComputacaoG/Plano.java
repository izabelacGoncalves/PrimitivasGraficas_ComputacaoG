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
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.BoxLayout;
//esta classe é utilizada para desenhar o plano cartesiano.
public class Plano {
	private double largura;
	private double alto;
	public Plano(double largura, double alto){
		this.largura = largura;
		this.alto = alto;
		
	}
	public void desenho(Graphics2D g){
		for(int i = 0; i < alto; i++){
			Line2D  linea = new Line2D.Double(i,0,i,largura);
			if(i % 10 == 0){
				g.setColor(new Color(204,204,204));
				g.draw(linea);
			}
		}
		
		for(int i = 0; i < largura; i++){
			Line2D  linea = new Line2D.Double(0,i,alto,i);
			if(i % 10== 0){
				g.setColor(new Color(204,204,204));
				g.draw(linea);
			}
		}
		g.setColor(Color.BLACK);
		Line2D linea_y = new Line2D.Double(alto/2,0,alto/2,largura);
		
		Line2D  linea_x = new Line2D.Double(0,largura/2,alto,largura/2);
		
		g.draw(linea_x);
		g.draw(linea_y);
		
	}
	
	
	
	
	
}