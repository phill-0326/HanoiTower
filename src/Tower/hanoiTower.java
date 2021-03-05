package Tower;

/**
 * 汉若塔
 * author：phil
 */
public class hanoiTower {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(4,'A','B','C');
    }
    static class Tower{
        //方法
        //num 表示移动的个数，a,b,c分别表示A塔，B塔，C塔
        public void move(int num,char a,char b,char c){
            //如果只有一个盘
            if (num == 1){
                System.out.println(a +"->"+c);
            }else{
                //如果有多个盘，可以看成两个，最下面的和最上面的所有盘（num-1）
                move(num-1,a,c,b);//先移动上面所有的盘到b，借助c
                System.out.println(a+"->"+c);//把最下面的这个盘移动到c
                move(num -1,b,a,c);//再把b塔中的所有盘，移动到c，借助a
            }
        }
    }
}
