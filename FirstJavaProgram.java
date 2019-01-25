public class FirstJavaProgram {
    private static String classVar1="First class variable";
    private static String classVar2="Second class variable";
    public String instanceVar="An instance variable";

    public void firstMethod(){
        String localVar="A local variable inside a method";

        System.out.println("Printing text inside a method, and then the var:");
        System.out.println(localVar);
    }

    public static void main(String args[]){
        FirstJavaProgram var1 = new FirstJavaProgram();
        FirstJavaProgram var2 = new FirstJavaProgram();
        FirstJavaProgram var3 = new FirstJavaProgram();

        System.out.println(classVar1+" Check");
        System.out.println(var1.classVar1);
        System.out.println(var2.classVar1);
        System.out.println(var3.classVar1);
        System.out.println(var1.classVar2);
        System.out.println(var2.classVar2);
        System.out.println(var3.classVar2);

        System.out.println(var1.instanceVar);
        System.out.println(var2.instanceVar);

        var1.instanceVar = "A changed instance variable";

        var3.classVar2 = "Second class var changed";

        System.out.println("--------------------");

        System.out.println(var1.classVar1);
        System.out.println(var2.classVar1);
        System.out.println(var3.classVar1);
        System.out.println(var1.classVar2);
        System.out.println(var2.classVar2);
        System.out.println(var3.classVar2);

        System.out.println(var1.instanceVar);
        System.out.println(var2.instanceVar);

        System.out.println("Here comes the method:");
        var1.firstMethod();
        System.out.println(var1.instanceVar);
    }
}