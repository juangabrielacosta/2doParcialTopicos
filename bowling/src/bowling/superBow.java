/**
 * 
 */
package bowling;

/**
 * @author Juan
 *
 */
public class superBow {

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	int[] matriz;
	int tirar;

	public void tirar (int x) {
		matriz[tirar++]=x;
	}
	public int puntos() {
		int resultado=0;
		int frame=0;
		int i;
		for (i=0 ; i< 10;i++) {
		if (strike(frame)) {
			resultado+= 10 + strikeBonus(frame);
			frame++;
			
		}else if (extra(frame)) {
			resultado+= 10 + extraBonus(frame);
			frame+=2;
			
		}
		else {
			resultado+=agregoElemento(frame);
			frame+=2;
		}
			
		}
		return resultado;	
	}
	public boolean strike(int frame) {
		return matriz[frame]==10;
	}
	public boolean extra (int frame) {
		return agregoElemento(frame)==10;
	}
	public int strikeBonus (int frame) {
		return agregoElemento(frame+1);
	}
	public int extraBonus (int frame)
	{
		return agregoElemento(frame+1);
	}
	public int agregoElemento(int frame) {
		return matriz[frame]+ matriz[frame+1];
	}
	

}
