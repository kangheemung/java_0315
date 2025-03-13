class Sample7 {
    public static void main(String[] args) {
        int number11 = 8;
        int number12 = 2;
        int differenceNumber = number11 - number12;

        if (differenceNumber == 0) { // 先に0の確認を済ませる
            System.out.println("0です");
        } else if (differenceNumber % 2 == 0) {
            System.out.println("偶数です");
        } else { // 0と偶数の確認を済ませたあと残るのは奇数のみ
            System.out.println("奇数です");
        }
    }
}


// switch (num) {
//     // numが15, 20の場合実行
//     case 15:
//     case 20:
//         System.out.print("good");
//         break;
//     // numが5, 10の場合実行
//     case 5:
//     case 10:
//         System.out.print("ok");
//         break;
//     // それ以外で実行
//     default:
//         System.out.print("ng");
//         break;
// }

class Sample8 {
    public static void main(String[] args) {
        int number13 = 8;
        int number14 = 2;
        int differenceNumber = number13 - number14;

        switch (differenceNumber % 2) {
            case 0:
                System.out.println("偶数か0です");
                break;
            case 1:
                System.out.println("奇数です");
                break;
        }
    }
}

// switch文の利用

// 以下の指示を確認してswitch文を用いた実装をしなさい。

// int number13 = [適当な正な自然数];
// int number14 = [適当な正な自然数];

// int 型の変数 differenceNumber を number13 から number14 を引いた数字で初期化しなさい。differenceNumber の値に応じて次の出力を行いなさい。

// 条件

// 条件が合致した場合

// 偶数か0なら

// 偶数か0です と出力する

// 奇数なら

// 奇数です と出力する
class Sample8 {
    public static void main(String[] args) {
        int speed = 120;
        int limit = 60;
         System.out.println(speed > limit ? "スピード違反です。" : "法定速度内です。");

        }
    }
// 加算
// for (int i = 0; i < 100; i += 10) {
//     System.out.print(i + " ");
// }
// // 出力内容) 0 10 20 30 40 50 60 70 80 90

// // 減算
// for (int i = 10; i > 0; i -= 2) {
//     System.out.print(i + " ");
// }
// // 出力内容) 10 8 6 4 2

// // 乗算
// for (int i = 1; i < 100; i *= 2) {
//     System.out.print(i + " ");
// }
// // 出力内容) 1 2 4 8 16 32 64

// // 除算
// for (int i = 100; i > 0; i /= 10) {
//     System.out.print(i + " ");
// }
// // 出力内容) 100 10 1

class Sample8 {
    public static void main(String[] args) {
        String text = "abc";
        for (int i = 0; i < 5; i++) {
            System.out.println(text);
        }
    }
}
class Sample2 {
    public static void main(String[] args) {
        for (int i = 40; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
class Sample2 {
    public static void main(String[] args) {
        for (int i = 20; i <= 50; i++) {
            if (i % 2 == 0 && (i / 2) % 2 == 1)  {
                System.out.print(i + " ");
            }
        }
    }
}