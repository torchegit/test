package jp.co.internous.action;

public class Test {
	public static void main(String[] args){
Person taro =new Person();
taro.name="山田太郎";
taro.age=20;
taro.phoneNumber="070-1234-5678";
taro.address="bbb.google.co.jp";

Person jiro =new Person();
jiro.name="木村次郎";
jiro.age=18;

Person hanako =new Person();
hanako.name="鈴木花子";
hanako.age=16;

Robot aibo =new Robot();
aibo.name="aibo";

Robot asimo=new Robot();
asimo.name="asimo";

Robot pepper=new Robot();
pepper.name="pepper";



System.out.println(taro.name);
System.out.println(taro.age);
System.out.println(taro.phoneNumber);
System.out.println(taro.address);
taro.talk();
taro.walk();
taro.run();
System.out.println(jiro.name);
System.out.println(jiro.age);
System.out.println(hanako.name);
System.out.println(hanako.age);
aibo.talk();
aibo.walk();
aibo.run();
asimo.talk();
asimo.walk();
asimo.run();
pepper.talk();
pepper.walk();
pepper.run();
	}
}
