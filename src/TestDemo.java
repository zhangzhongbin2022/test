public class TestDemo {

    public static final String ZIFUCHUAN = "1233";
    private static String zzb;

    public static void getMag(final String mag) {


    }
    //详细断点
    public static void detailLine(){
        System.out.println("1223");
    }

    //方法断点
    public static void methodLine() {
        System.out.println("方法缎带你");
        final String mag = ZIFUCHUAN;
        zzb = "zzb";
        int age = 10;
        Person p =new Person(zzb, age);
        frult f = new apple();
        f.isWhatFrult();
        p.calNum();
        final String msg = mag + p.getName();
        System.out.println(msg);
        p.setAge(age);
        p.setAge(100);
        s();
    }

    private static void s() {
        String str = "123";
        System.out.println(str);
    }

    //异常断点
    public static void exceptionLine(){
        String st = getString("1", "南");
        System.out.println(st);
    }

    private static String getString(String s, String sex) {
        String str = null;
        String st = str.concat("123");
        return st;
    }

    //断点条件
    public static void conditionLine() {
        for(int i =0 ; i<=10_000;i++) {
            System.out.println(i);
        }
    }
    //避免资源浪费
    public static void zyLine() {
        System.out.println("123");


        System.out.println("345");
        System.out.println("789");
        System.out.println("0000");
    }
    public static void main(String[] args) {
//       Object o = new Object();
//      List<String> ll = new ArrayList<>();
//        for (String s : ll) {
//
//        }
//        final String out ="hello world";
//        System.out.println(out);
//        System.out.println("out = " + out);
//        System.out.printf("", out);
//        Map<String, String> ss =new HashMap<>();
//        //detailLine();
//       // methodLine();
//      //  exceptionLine();
//        //conditionLine();
//        zyLine();
        int sum = 2+3;
        try {
            Thread.sleep(10000);
        } catch (Exception r) {

        }
        System.out.println("hello World");
    }
}
