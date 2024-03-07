
public class ClassExam {
	
	// field 
	private int a;
	
	//constructor
	public ClassExam() {               // 디폴트 생성자
		System.out.println("디폴트생성자");
	}
	public ClassExam(int aa) {               // 디폴트 생성자(오버로딩)
		a=aa;
	}

	//method : setter(외부에서 주는 데이터를 입력하는 함수).getter(외부에서 필드값을 얻어가는 함수)
	
	public void setA(int num) {                           //문법처럼 사용 메소드명 set(Field명)
		a = num;
		
	}
	public int getA() {
		return a;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassExam ce = new ClassExam();   //생성자 호출 (int타입만 지정시 받을수 없어서 생성자함수 오버로딩으로 타입설정)
		
		ClassExam ce1 = new ClassExam(10);  //생성자 호출
		
		ClassExam ce2 = new ClassExam(500);  //생성자 호출
		
		ce.setA(200); //ce.a = 200; -> 내부에서 접근하는 것이라 가능
		System.out.println(ce1.a);
 		System.out.println(ce.a);                 // 내부에서 접근한 거라 필드값 불러오기가능
		System.out.println(ce2.getA());    //외부에서 값 불러오기할 때 get 사용

	}

}
