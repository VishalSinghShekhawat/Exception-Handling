//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TRY - CATCH IMPLEMENTATION

//        System.out.println("A");
//        int arr[] = {1,2,3,4,5};
//
//        try {
//            int a = 5 / 0;
//            System.out.println("Not 1st error");
//            System.out.println(arr[5]);
//        } catch (ArithmeticException e) {
//            System.out.println("Your statement has the error: " + e.getMessage());
//            System.out.println("D");
//        } catch (Exception b) {
//            System.out.println("Your statement has the error: " + b.getMessage());
//            System.out.println("E");
//        }finally {
//            System.out.println("Finally will execute in any condition");
//        }
//        System.out.println("B");



        //CUSTOM EXCEPTION CREATION

//     int age =12;
//
//     try{
//         if(age<18)
//         throw new UnderAgeException("UnderAge");
//     } catch (Exception e){
//         System.out.println(e.getMessage());
//     }


        //TRY CATCH IMPLEMENTATION IN FUNCTION
        try{
            if(checkAge(12))   //if function throws exception then it will go to catch
                System.out.println("Eligible to vote");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
  }

    //TRY CATCH IMPLEMENTATION IN FUNCTION        // THROWS IMPLEMENTATION
    public static boolean checkAge(int age) throws UnderAgeException, ArithmeticException{
        if(age<18)
            throw new UnderAgeException("UnderAge");

        return true;
    }
}