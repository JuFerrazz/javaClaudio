package filadeimpressao;

public class Fila {
	
private static Fila instancia;

	private Fila() {
	
	}
	
	public static Fila getinstancia() {
		
	if (instancia == null)	{
		instancia = new Fila ();
	}
	return instancia;
	}
	
	public void ImprimeDocumento() {
		
	}
	
    public void RemoveDocumento() {
		
	}
	
    public void RemoveTodosDocumentos() {
		
	}
	
	
}

