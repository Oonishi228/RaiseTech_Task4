import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
//王を含むものだけ表示
        List<String> taiyoukeiList = List.of("水星", "金星", "地球", "火星", "木星", "土星", "天王星", "海王星");
        System.out.println(taiyoukeiList);
        taiyoukeiList.stream().filter(str -> str.contains("王")).forEach(System.out::println);

        System.out.println("-----------");

//太陽系三文字のコードポイントの値を求める
        String str = "太陽系";
        str.codePoints().forEach(System.out::println);

        System.out.println("-----------");

//降順に並び替えて奇数を抽出し、二倍にする
        Stream.of(1, 4, 6, 3, 2, 9, 7, 8, 5).sorted(Comparator.reverseOrder()).filter(num -> num % 2 == 1).map(num -> num * 2).forEach(System.out::println);

        System.out.println("-----------");

// 0~29の先頭10件を出力
        IntStream stream = IntStream.range(0, 30);
        int[] result = stream.toArray();
        Arrays.stream(result).limit(10).forEach(System.out::println);
    }

}
