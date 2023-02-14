package AdapterDesign;

public class AdapterMain {

    /*
     * 这是使用继承的示例程序
     * printBanner类继承了Banner类，实现了print的接口
     *
     * 使用委托的示例程序
     * print接口变为抽象类，方法也是抽象方法，子类会实现
     * 将Banner类里的showWithParen方法封装进PrintWeak，PrintStrong也是类似
     * printBanner聚合了Banner，继承了抽象类
     *
     * 这样在main方法中，就不用知道printWeak是怎么实现的了
     *
     * 看图P15，角色分析P18（目标，客户，适配器，被适配者）
     *
     * 实际情况：Banner
     * 变换装置(适配器)：PrintBanner
     * 目标需求：Print
     *
     * 现在我需要一个工具，我只需要创建一个适配器继承我在网上找到的类（Hutools里的）
     * 然后让给适配器，实现我需要的接口，接口包含我需要的功能
     * 然后将网上类的方法在，适配器里重写的接口中编写，我就可以用Util接口创建对象，
     * 就像Util u = new UtilAdapter();
     * 这是我的猜想。以后试一试
     *
     * 使用Adapter模式可以在完全不改变现有代码的前提下，使现有代码适配新的接口
     * 使新旧版本兼容
     *
     * */
    public static void main(String[] args) {
        Print p = new PrintBanner("hello");
        p.printWeak();
        p.printStrong();
    }
}
