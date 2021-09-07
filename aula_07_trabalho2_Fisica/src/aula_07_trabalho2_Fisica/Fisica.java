package aula_07_trabalho2_Fisica;

public class Fisica {
	public float ForcaPeso(float massa,float gravidade) {
		return massa*gravidade;
	}
	public float ForcaCentripeta(float massa, float velocidade, float raio) {
		return massa * ((float) Math.pow(velocidade,2)/raio);
	   }
	
	public float Impulso(float forca, float tempoInit, float tempoFin) {
		return forca * (tempoInit - tempoFin);
	   }
}
