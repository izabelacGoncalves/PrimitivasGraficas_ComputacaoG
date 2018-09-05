
package ComputacaoG;
/**
*
* @author izabela
*/

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

//a classe a seguir ajuda a plotar os pontos no plano cartesiano exibido.
public class Linha {
	private Ponto ponto1;
	public Linha(){}
	public Linha(Ponto ponto1){
          this.ponto1 = ponto1;	
        }
       public Linha(double x1, double y1){
         this.ponto1 = new Ponto(x1, y1,false);
       }
	public Linha(double x1, double y1,boolean t){
	  this.ponto1 = new Ponto(x1, y1,t);
	}
	public void desenho(Graphics2D g,Color cor){
		g.setColor(new Color(100,100,100));
		g.setFont(new Font( "Serif", Font.BOLD, 10 ));
		g.setColor(cor);
               // reforcando a coloração usando pixels proximos
               double x = ponto1.get_x();
               double y = ponto1.get_y();
      
		Line2D pt = new Line2D.Double(x,y,x,y);
               Line2D pt1 = new Line2D.Double(x+1,y+1,x+1,y+1);
               Line2D pt2 = new Line2D.Double(x-1,y-1,x-1,y-1);
               Line2D pt3 = new Line2D.Double(x+1,y-1,x+1,y-1);
               Line2D pt4 = new Line2D.Double(x-1,y+1,x-1,y+1);
		g.draw(pt);
               g.draw(pt1);
               g.draw(pt2);
               g.draw(pt3);
               g.draw(pt4);
	}

	

	
	
}