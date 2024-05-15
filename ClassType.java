public class ClassType {
    public static void main(String[] args) {
        Equal ob1 = new Equal(100, 22);
        Equal ob2 = new Equal(100, 22);
        Equal ob3 = new Equal(66, 22);
        Equal ob4 = new Equal(88, 33);
        ob2.equalTo(ob1);
        System.out.println("ob1 и ob2 равны? " + ob2.equalTo(ob1));
        ob3.equalTo(ob4);
        System.out.println("ob3 и ob2 равны? " + ob3.equalTo(ob4));

    }
}

class Equal {
    int a, b;
    Equal(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean equalTo(Equal o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}