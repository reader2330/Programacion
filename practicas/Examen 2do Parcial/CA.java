public class CA {
	private int x;
	private int y;

	public CA(int x_parametro, int y_parametro) {

		this.x=x_parametro;
		this.y=y_parametro;
	}

	public int getX() {

		return this.x;
	}

	public void setX(int x_parametro) {

		this.x = x_parametro;
	}

	public int getY() {

		return this.y;
	}

	public void setY(int y_parametro) {

		this.y = y_parametro;
	}

	public int suma() {
		int suma;

		suma=this.x+this.y;

		return suma;

	}


}