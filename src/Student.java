//********************************************************************
//  Student.java       Author: Lewis/Loftus/Cocking
//
//  Represents a college student.
//********************************************************************
public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private int test1Score = 0;
   private int test2Score = 0;
   private int test3Score = 0;
   //-----------------------------------------------------------------
   //  Sets up this Student object with the specified initial values.
   //-----------------------------------------------------------------
   public Student (String first, String last, Address home,
                   Address school)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
   }
   public Student (String first, String last, Address home,
                   Address school, int test1, int test2, int test3)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      test1Score = test1;
      test2Score = test2;
      test3Score = test3;
   }
   public int average() {
       return (test1Score + test2Score + test3Score) / 3;
   }
   //-----------------------------------------------------------------
   //  Returns this Student object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;
      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress + "\n";
      result += "Test 1 score:\n" + test1Score + "\n";
      result += "Test 2 score:\n" + test2Score + "\n";
      result += "Test 3 score:\n" + test3Score + "\n";
      result += "Average Test Score\n" + average();
      return result;
   }
   public void setTestScore(int testId, int score) {
       switch(testId) {
           case 1:
               test1Score = score;
               break;
          case 2:
               test2Score = score;
               break;
          case 3:
               test3Score = score;
               break;
       }
   }
   public int getTestScore(int testId) {
       switch(testId) {
           case 1:
               return test1Score;
          case 2:
               return test2Score;
          case 3:
               return test3Score;
          default:
              return test1Score;
       }
   }
}
