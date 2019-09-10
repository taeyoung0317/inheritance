package interfacesample;

public class ServiceImpl implements Service {

	@Override
	public void insert() {
		System.out.printf("데이터를 삽입하기\n");

	}

	@Override
	public void read() {
		System.out.printf("데이터를 읽어오기\n");

	}

	@Override
	public void update() {
		System.out.printf("데이터를 수정하기\n");
	}

	@Override
	public void remove() {
		System.out.printf("데이터를 삭제하기\n");
	}


}
