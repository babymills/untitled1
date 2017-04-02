package Different;

/**
 * Created by PK on 05.03.2017.
 */
public class A1 {
    static  int age1;
    String name1;

    public A1(int age, String name) {
        this.age1 = age;
        this.name1 = name;
    }
    public boolean equals(Object other){
if(other == this   ) return true;
if(other == null   ) return false;
if(!(other instanceof A1   )) return false;
        A1 aa1 = (A1) other;
        return age1 == ((A1) other).age1 && name1 != null && name1.equals(((A1) other).name1);
    }
}
