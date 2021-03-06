package com.ipartek.formacion.ejemplo1;

public class Punto {

	public static final int DEFAULT_X = 1;
	public static final int DEFAULT_Y = 1;
	public static final int MAX_X = 1000;
	
	private int x, y;

	public Punto(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public Punto() {
		this(DEFAULT_X, DEFAULT_Y); //x = 1; y = 1;
	}
	

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x > MAX_X) 
			throw new RuntimeException("Maximo de puntos = " + MAX_X);
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public Object clone() {
		return new Punto(x,y);
	}
	
}
