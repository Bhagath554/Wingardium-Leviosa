import java.util.ArrayList;
class Main {
    public static void main(String[]args){
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
        System.out.println("==========Printing Cleared Array========");
     animals.clear();
     System.out.println("==========Printing cleared array==========");
     System.out.println("Empty Array:"+animals);
     if(animals.isEmpty()){
        System.out.println("Array is Empty");

     }
     else{
        System.out.println("Array is not Empty");
     }
     animals.add("Lion");
     animals.add("Tiger");
     animals.add("Cheetah");
     System.out.println("The size of the array:"+animals.size());
     System.out.println("Adding more element"+animals.add("Dog"));
     System.out.println(animals);
     animals.remove(2);
     System.out.println(animals);
    }
}