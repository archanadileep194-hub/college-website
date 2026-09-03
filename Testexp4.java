class Testexp4{
void div(int a,int b){
try{
System.out.println(a/b);
}
catch(ArithmeticException e1){
System.out.println("div(): divide by zerob-exception"+e1);
throw e1;
}
}
public static void main(String[] args)
{
int a=0;
int b=60; //if zero it will throw arithmatic exception
Testexp4 t1=new Testexp4();
try{
t1.div(a,b);
}
catch(ArithmeticException ee){
System.out.println("main(): divide by zero -exception"+ee);
}
}}
