package abstractclass;

public class Main {

	public static void main(String[] args) {
		
		//현재는 Equipment 클래스가 abstract 클래스가 아님
		//abstract class가 아니어서 객체 생성이 가능
		//Equipment 클래스의 class 앞에 abstract를 추가하면 에러
		//Equipment Equipment = new Equipment();
		
		//Clothes 클래스의 인스턴스 생성
		Equipment e= new Clothes();
		e.equip();
		
		//Hat 클래스의 인스턴스 생성
		e = new Hat();
		e.equip();
		
		//Shoes 클래스의 인스턴스 생성
		e = new Shoes();
		e.equip();
		
	}

}
