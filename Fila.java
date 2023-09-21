public class Fila {
	
	public String Nomedocumento;
	public String Tipodocumento;
	public String Formatodocumento;
	public int QuantidadeDocumentos;
	
	  private static Fila instancia = null;

    private Fila() {

    }

    public static Fila getInstance(){

        if (instancia == null){

            instancia = new Fila();

        }
	

	private void ImprimeDocumento() {
		
	}
	
	private void RemoveDocumento() {
		
	}
	
	private void RemoveTodosDocumentos() {
		
	}


}