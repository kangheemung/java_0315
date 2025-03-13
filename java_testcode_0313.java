@Test
void multiplyで3と4の乗算結果を取得する() {

}

まずはルールを知ることから始めよう
 ブックマーク
目次

JUnitのルール
メソッド名の編集
テストコードの実装
テスト失敗時の修正方法
JUnitのルール
Lesson01の学習で、JUnitについて以下のように説明をしました。

JUnitとは
Javaプログラムのユニットテストを自動化するためのフレームワーク(テスティングフレームワーク)

SpringBootなどのフレームワーク同様、実装するにあたって最低限守るべきルールがあります。

以下の5つの項目は、テストクラス作成に関するルールです。

1つのクラスに対して1つのテストクラスを作成する

テストクラスの名前の末尾は～Testで終わる

テストクラスはsrc/test/javaというフォルダの中にsrc/main/javaと同じパッケージ構成で配置する

org.assertj.core.api.Assertions.*とorg.junit.jupiter.api.Testをインポートする

テストクラス内のメソッド（テストメソッド）に検証用のコードを記述する

次に以下の4つの項目は、テストメソッド作成に関するルールです。

org.junit.jupiter.api.Testアノテーションを付与する

publicメソッドである

返り値の型はvoid

引数は設定しない

上記以外の細かいルールや「このように書くのが一般的」という点については、学習の中で必要に応じて解説をしていきます。まずは必要最低限のルールをしっかりと覚えるようにしましょう。

メソッド名の編集
test()のメソッド名を、multiplyで3と4の乗算結果を取得するとしましょう。

Java
/* 省略 */
@Test
void multiplyで3と4の乗算結果を取得する() {
    /* 省略 */
}
メソッド名には半角英数字を入力するよう学びましたが、テスト用のソースコードは外部に公開されず、開発者だけが利用するものです。

テストコードを実装する中で似たようなテストメソッドが増える可能性もあり、例えばgetTheMultiplierのような名前は後々わかりづらくなります。

テストメソッド名は、どのようなテストが行われているかを明確に判断できるような日本語で具体的に名づけるのをおすすめします。

あくまでメソッドですので、全半角問わず先頭に数字を入れられないなどのルールは通常のメソッド同様です。

テストコードの実装
それでは順を追って、実際にテストコードの実装をしてみましょう。

テストケースは多様に用意することが可能ですが、今回は練習として次のような手順のテストを作成します。

Calculatorクラスのインスタンスを生成する

想定する計算結果を用意する

３ x ４をmultiply()に計算させる

想定する結果とmultiply()の結果が等しいか検証する

ソースコードは以下の通りです。

Java
/* 省略 */
@Test
public void multiplyで3と4の乗算結果を取得する() {
    // 1. Calculatorクラスのインスタンスを生成する
    Calculator sut = new Calculator();

    // 2. 想定する計算結果を用意する
    int expected = 12;

    // 3. 3 x 4の結果を multiply()に計算させる
    int actual = sut.multiply(3, 4);

    // 4. 想定する結果と multiply()の結果が等しいか検証する
    assertThat(actual).isEqualTo(expected);
}

/* 省略 */
@Test
void multiplyで5と6の乗算結果を取得する() {
    Calculator sut = new Calculator();
    int expected = 12;
    // 5 x 6の結果を`multiply()`に計算させる
    int actual = sut.multiply(5, 6);
    assertThat(actual).isEqualTo(expected);
}
// 返り値の型を修正
public double divide(int x, int y) {
    // キャスト処理を追加
    return (double)x / (double)y;
}