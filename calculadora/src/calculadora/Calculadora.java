package calculadora;

public class Calculadora {
	public float somar(float num1,float num2) {
		return num1+num2;
	}
	
	public float subtrair(float num1,float num2) {
		return num1-num2;
	}
	
	public float multiplicar(float num1,float num2) {
		return num1*num2;
	}
	
	public float dividir(float divdendo,float divisor) {
		return divdendo/divisor;
	}
	
	public float potencia(float base,float expoente) {
		return (float) Math.pow(base, expoente);
	}
	
	//Math.pow expects doubles. at line 21, the command (float) converts to float.
	
	public float raizQuadrada(float num) {
		return (float) Math.sqrt(num);
	}
	
	public int restoDaDivisao(int num, int divisor) {
		return num % divisor;
	}
}
