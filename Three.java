class Three{
static void add(int a,int b){
System.out.println(a+b);
}
public static void main(String[] ar){
Three t1=new Three();
t1.add(1,2);
// test
int testsum=30;
int sum=t1.add1(10,20);
if(sum== testsum){
Sytem.out.println("test of addition is success");
}
else{
Syatem.out.println("test of addition is fail");
}
}