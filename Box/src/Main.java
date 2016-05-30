import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main implements KeyListener{


	public static void main(String[] args) {
		
		OtworzPlik.Tworz();
		int i=0;
		while(i<5)
		{
			Zapis.Zapisuj();
			i++;
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pomidorek");
	}

	@Override
	public void keyPressed(KeyEvent e) {

		System.out.println(e.getKeyCode());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
