package spring.di;

public class Fooo {
	Bar bar;
	
	public void doFooo() {
		System.out.println("Fooo.doFooo()실행");	
		bar = getBar();
		bar.doBar();
	}
	//look up 메소드 선언
	public Bar getBar() {
		return null; //컨테이너에 저장된 Bar타입 객체를 리턴. 따라서 내용은 별 상관 없음.
	}
}
