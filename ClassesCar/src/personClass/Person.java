package personClass;

public class Person {

	private String first;
	private char midIni;
	private String last;
	
	//Constructors
	public Person(String first, char midIni, String last) {
		this.first = first;
		this.midIni = midIni;
		this.last = last;
		//this(first,'\u0000',last);
	}
	public Person(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	//getter and setters
	public String getFirst() {return first;}
	public void setfirst(String first) {this.first = first;}
	
	public char getMidIni() {return midIni;}
	public void setMidIni(char midIni) {this.midIni = midIni;}
	
	public String getLast() {return last;}
	public void setlast(String last) {this.last = last;}
	
	//toString method
	/*public String toString() {
		return "Hello, my name is " + first + " " + midIni + " " + last + ".";
	}*/
	public String toString() { //revised toString to not print if no midIni
		if(midIni == '\u0000') {
			return "No Middle Initial: " + first + " " + last; //if no midIni print this
		}else {
			return "Has Middle Initial: " + first + " " + midIni + " " + last;
		}
	}
	
	//Objects equals method
	public boolean equals(Person person) { //
		return this.first.equals(person.first) &&
				this.first.equals(person.first) &&
				this.first.equals(person.first);
		
	}
	
	//copy method
	public Person copy() {
//		Person other = new Person(this.first,midIni,last);
//		return other;
		return new Person(this.first,midIni,last);
	}
	
	//copy constructor
	public Person(Person other) {
		this(other.first,other.midIni,other.last);
	}
	
	//driver for Person Class
	public static void main(String[] args) {
		Person person1 = new Person("Tyler", 'R', "Joseph");
		//System.out.println("The new person is " + person1.getFirst() + " " + 
		//					person1.getMidIni() + ". " + person1.getLast());
		
		Person person2 = new Person("Amy", "Pond");
		//System.out.println("The new person is " + person2.getFirst() + " " + 
		//					person2.getLast());
		
		Person person3 = new Person("Amy", "Pond"); //SAME PERSON
		
		System.out.println(person1); //automatically calls toString method
		System.out.println(person2);
		
		//comparing Strings (comparing Objects)
		System.out.println("These people are the same: " + person1.equals(person2));
		
		System.out.println(person2);
		System.out.println(person3);
		System.out.println("These people are the same: " + person2.equals(person3));
		
		
				
	}
}