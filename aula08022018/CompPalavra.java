import java.util.Scanner;

public class CompPalavra {
	Scanner sc = new Scanner(System.in);
	String ent1, ent2, resp;

	String comp() {
		if (ent1.equals(ent2)) {
			resp = "igual";
		} else {
			resp = "diferente";
		}

		return resp;
	}

	void entrada() {
		System.out.println("Digite a primeira palavra");
		ent1 = sc.next();

		System.out.println("Digite a segunda palavra");
		ent2 = sc.next();

	}

	public void saida() {
		System.out.println(comp());
	}

}
