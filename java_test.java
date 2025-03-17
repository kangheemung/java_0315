//java test
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @test
    public void totalSum() {
         Calculator sut = new Calculator();
        // 想定する計算結果の用意
        int expected = 5;
        // 3 + 2の結果を`sum()`に計算させる
        int actual = sut.sum(3, 2);
        // 計算結果が5となるか検証する
        assertThat(actual).isEqualTo(expected);

    }
}