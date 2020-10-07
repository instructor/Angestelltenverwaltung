
public class Angestellter {

	private String name;
	private int gehalt;
	private int telefonnummer;
	private String email;
	
	Angestellter (String name, int gehalt, int telefonnummer, String email){
		this.name = name;
		this.gehalt = gehalt;
		this.telefonnummer = telefonnummer;
		this.email = email;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGehalt() {
		return gehalt;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

	public int getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	};
	
	public void printAngestellter() {
		System.out.print(name);
		System.out.print(" ");
		System.out.print(gehalt);
		System.out.print(" ");
		System.out.print(telefonnummer);
		System.out.print(" ");
		System.out.println(email);
		
	}
}

