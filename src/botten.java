public class botten extends base{
    @Override
    public String test() {
        return "子类方法";
    }

    public void children() {
        System.out.println(super.test());
    }
}
