public class Main {
    public static void main(String[] args){
        FizzBuzz.doFuzzBuzz(5);

        System.out.println(args);

        FizzBuzz.main(args);
        // 1. 为什么直接调用 FizzBuzz.main(); 不行？
        // 在 Java 中，main 方法的完整签名是：
        // public static void main(String[] args)
        // 它不是无参方法：即使你不需要使用参数，main 方法也必须接收一个字符串数组 (String[]) 作为参数。
        // IntelliJ 的报错：它会提示你 Expected 1 argument but found 0（预期 1 个参数，但实际找到了 0 个）。

    }
}

