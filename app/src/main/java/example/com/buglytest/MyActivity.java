package example.com.buglytest;
public class MyActivity {
    public native String  stringFromJNI();
    static {
        System.loadLibrary("hello-jni");
    }


    public String getString(){
        return stringFromJNI();
    }

}
