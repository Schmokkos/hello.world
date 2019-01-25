public class FirstJavaProgram {
    public static String classVar1="First class variable";
    public static String classVar2="Second class variable";
    public static void main(String args[]){
        FirstJavaProgram var1 = new FirstJavaProgram();
        FirstJavaProgram var2 = new FirstJavaProgram();
        FirstJavaProgram var3 = new FirstJavaProgram();

        System.out.println(var1.classVar1);
        System.out.println(var2.classVar1);
        System.out.println(var3.classVar1);
        System.out.println(var1.classVar2);
        System.out.println(var2.classVar2);
        System.out.println(var3.classVar2);

        var3.classVar2 = "3213";

        System.out.println("--------------------");

        System.out.println(var1.classVar1);
        System.out.println(var2.classVar1);
        System.out.println(var3.classVar1);
        System.out.println(var1.classVar2);
        System.out.println(var2.classVar2);
        System.out.println(var3.classVar2);
    }
}