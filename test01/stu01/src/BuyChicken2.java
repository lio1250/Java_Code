public class BuyChicken2 {
    public static void main(String args[]){
        int x,y,z;
        for (x=0;x<=20;x++){
            for (y=0;y<=33;y++){
                for (z=0;z<=100;z++) {
                    if ((x + y + z == 100) && (5 * x + 3 * y + z / 3.0 == 100)) {
                        System.out.print("公鸡数：" + x + "\t");
                        System.out.print("母鸡数：" + y + "\t");
                        System.out.print("小鸡数：" + z + "\t");
                        System.out.println();
                    }
                }
            }
        }
    }
}
