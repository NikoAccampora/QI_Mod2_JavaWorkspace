package aula_07_trabalho2_Fisica;

public class Fisica {
	public float ForcaPeso(float massa,float gravidade) {
		return massa * gravidade;
	}
	public float ForcaCentripeta(float massa, float velocidade, float raio) {
		return massa * ((float) Math.pow(velocidade,2)/raio);
	   }
	
	public float Impulso(float forca, float tempo1, float tempo2) {
		return forca * (tempo2 - tempo1);
	   }
	
	public float ForcaElastica(float constElastic, float deformacao) {
		return constElastic * deformacao;
	   }
	
	public float VelocidadeMedia(float tempo1, float tempo2, float pos1, float pos2) {
		return (float) (((pos2 - pos1) / (tempo2 - tempo1)) * 3.6);
	   }
	
	public float MovimentoUniforme(float velocidade, float tempo, float posicao) {
		return posicao + (velocidade * tempo);
	   }
	
	public float MovimentoUniformeVariado(float aceleracao, float tempo, float velocidade) {
		return velocidade + (aceleracao * tempo);
	   }
}
