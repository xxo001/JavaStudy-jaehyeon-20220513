package j22_람다식;

//함수가 2개이상이면 제한을 주는, 어노테이션으로, 람다를 쓸땐 필수
@FunctionalInterface
public interface Math2 {
	public double calc(double value1, double value2);
}
