package ComputacaoG;
/**
*
* @author izabela
*/
import javax.swing.JFrame;

public class Janela extends JFrame{
	public static final int LARGURA =800;
	public static final int ALTO = 800;
	private ImagemPainel pd;
	
	public Janela(int []vet1,int []vet2,int janela){
		this.confJanela();
		ImagemPainel pd = new ImagemPainel(vet1, vet2,janela);
		super.add(pd);
                
	}
	

        public int saida(){
           
            this.dispose();
            return 0;
        }
        public void conf(){     
	   this.dispose();
        }

	public void confJanela(){
               this.setAlwaysOnTop(false);
              
		super.setTitle("Resultados");
		super.setBounds(0, 0,Janela.ALTO,Janela.LARGURA);
		super.setVisible(true);
                int x = EXIT_ON_CLOSE;
              
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}