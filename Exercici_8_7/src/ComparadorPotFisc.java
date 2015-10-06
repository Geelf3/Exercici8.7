import java.util.Comparator;

public class ComparadorPotFisc implements Comparator<Cotxe> {
	
	@Override
	public int compare(Cotxe uno, Cotxe dos) {
		// Compare both potFisc
		if (uno.getPotenciaFiscal() > dos.getPotenciaFiscal())
			return 1;
		if (uno.getPotenciaFiscal() < dos.getPotenciaFiscal())
			return -1;
		return 0;
	}
}
