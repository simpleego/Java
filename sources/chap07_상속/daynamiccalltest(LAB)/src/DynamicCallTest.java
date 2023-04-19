class Animal  { 
  void sound() { 
    System.out.println("Animal Ŭ������ sound()"); 
  } 
} 
 
class Dog extends Animal { 
  void sound() { 
    System.out.println("�۸�"); 
  } 
} 
 
class Cat extends Animal { 
  void sound() { 
    System.out.println("�߿�"); 
  } 
} 
 
public class DynamicCallTest { 
  public static void main(String args[]) { 
    Animal animal = new Animal(); 
    Dog dog = new Dog(); 
    Cat cat = new Cat(); 

 
    Animal obj;  
 
    obj = animal;  
	obj.sound(); 
 
    obj = dog;  
	obj.sound(); 
 
    obj = cat;  
	obj.sound(); 
  } 
}