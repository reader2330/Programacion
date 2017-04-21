public class DirectorioUsuarios{
	public Usuario ListaUsuarios;
	public String nickname;
	public String contrasena;

	public DirectorioUsuarios(){
		DirectorioUsuarios listadeusuarios[] = new DirectorioUsuarios[2];

	}

	public DirectorioUsuarios(String nickname, String contrasena){

		this.nickname=nickname;
		this.contrasena=contrasena;
	}


	public boolean iniciarSesion(DirectorioUsuarios[] lista ,String nickname, String contrasena){
		int i=0;
		boolean a=false;
		try{
			for(i=0;i<lista.length;i++){
				if(nickname.equals(lista[i].nickname) && contrasena.equals(lista[i].contrasena)){
					a=true;
				}else
				a=false;
			}
		}catch(NullPointerException ex){
			if(nickname.equals("admi") && contrasena.equals("contrasena")){
				a=true;
			}
		}
		return a;
		
	}
}