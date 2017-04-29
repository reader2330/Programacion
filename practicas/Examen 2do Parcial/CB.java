public class CB extends CA {
	private int z;

	public CB(int x_parametro,int y_parametro,int z_parametro) {

		super(x_parametro,y_parametro);
		this.z=z_parametro;

	}

	public int getZ() {

		return this.z;
	}

	public void setZ(int z_parametro) {

		this.z=z_parametro;
	}

	public int suma() {
		int suma;

		suma=super.suma()+this.z;

		return suma;

	}


}