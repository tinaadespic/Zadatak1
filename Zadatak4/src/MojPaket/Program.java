package MojPaket;

public class Program {

	public static void main(String[] args) {
		Pravougaonik pravougaonik=new Pravougaonik(3,5);
		Krug krug=new Krug(5);
		// TODO Auto-generated method stub
		System.out.print(pravougaonik.toString());
		System.out.println(krug.toString());
		System.out.println("Obim pravougaonika je:" + pravougaonik.getO());
		System.out.println("Povrsina pravo je " + pravougaonik.getP());
		System.out.println("Povrsina kruga je "+krug.getP());
		System.out.println("Obim kruga je "+krug.getO());

	}

}
