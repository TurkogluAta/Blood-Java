/*
 * Blood.java
 * @author: Ata Turkoglu
 * Date: 07/03/2023
 */

public class Blood{
    //Declare data members
    private String blood;
    private String donate;
    private String receive;
    private int age;

    //Constructor 
    public Blood(){
        blood = "";
        age = 0;
    }

    //Setters
    public void setBlood(String blood){
        this.blood = blood;
    }
    public void setAge(int age){
        this.age = age;
    }

    //Compute method
    public void compute(){
        if(age>=18){
            switch(blood){
                case "AB":
                    donate = "You can donate to AB";
                    receive = "You can receive from AB, A, B, O";
                    break;
                case "A":
                    donate = "You can donate to A and AB";
                    receive = "You can receive from A and O";
                    break;
                case "B":
                    donate = "You can donate to B and AB";
                    receive = "You can receive from B and O";
                    break;
                case "O":
                    donate = "You can donate to AB, A, B, O";
                    receive = "You can receive from O";
                    break;
                default:
                    donate = "Invalid Input";
                    receive = "Invalid Input";
                    break;
            }
        }
        else{
            switch(blood){
                case "AB":
                    donate = "Your age is not 18. You can't donate";
                    receive = "You can receive from AB, A, B, O";
                    break;
                case "A":
                    donate = "Your age is not 18. You can't donate";
                    receive = "You can receive from A and O";
                    break;
                case "B":
                    donate = "Your age is not 18. You can't donate";
                    receive = "You can receive from B and O";
                    break;
                case "O":
                    donate = "Your age is not 18. You can't donate";
                    receive = "You can receive from O";
                    break;
                default:
                    donate = "Invalid Input";
                    receive = "Invalid Input";
                    break;
            }
        }
    }

    //Getters
    public String getDonate(){
        return donate;
    }
    public String getReceive(){
        return receive;
    }
}