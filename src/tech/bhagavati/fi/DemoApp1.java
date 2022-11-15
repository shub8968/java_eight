package tech.bhagavati.fi;


public class DemoApp1 {

    @FunctionalInterface
    interface Converter <T,R>{
        T apply(R r);
    }

    public static void main(String[] args) {
        Converter<Boolean, String> con = x->    Boolean.parseBoolean(x);;
        System.out.println(con.apply("false"));
        System.out.println(con.apply("t"));
    }
}
