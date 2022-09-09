package ar.edu.unq.po2.tp3;

/*
 * 
1. Debe ser posible crearse indicando como referencia los valores x e y
2. También debe ser posible crear un punto directamente sin enviarles parámetros, en este caso el punto
debe crearse en las coordenadas (0,0).
3. Debe ser posible mover un punto a otra posición.
4. Sumarse con otro punto y como resultado obtener un nuevo punto con las valores de x e y sumados.
  
 
*/

public class Point {
	
	private int x;
	private int y;
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public Point() {
		this.setValues(0, 0);
	}
	
	public Point(int x, int y) {
		this.setValues(x, y);
	}
	
	public void setValues(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moverA(int x, int y) {
		this.setValues(x, y);
	}
	
	public Point sumarPunto(Point p) {
		int x = this.x + p.getX();
		int y = this.y + p.getY();
		
		return new Point(x,y);
		
	}
	
}
