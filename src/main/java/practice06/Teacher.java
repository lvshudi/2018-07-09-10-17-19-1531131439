package practice06;

public class Teacher extends Person {

	private int klass = -1;
	
	public int getKlass() {
		return klass;
	}

	public void setKlass(int klass) {
		this.klass = klass;
	}

	public Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, int klass) {
		super(name, age);
		this.klass = klass;
	}
	
	public String introduce() {
		if(this.klass!=-1) {
			String result = super.basicIntroduce();
			return result+" I am a Teacher. I teach Class "+this.klass+".";
		} else {
			String result = super.basicIntroduce();
			return result+" I am a Teacher. I teach No Class.";
		}
	}
	
}
