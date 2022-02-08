package greatestNumber;

public class Numbers1 {
    private int num1,num2,num3,num4;
    public Numbers1(int num1, int num2, int num3,int num4) {
    	this.num1 = num1;
    	this.num2 = num2;
    	this.num3 = num3;
    	this.num4 = num4;
    }
    public int GreatestFour(){//method definition
        if(num1>num2){
            if (num1>num3) {
                if (num1 > num4) {
                    return num1;
                }
                else {
                    return num4;
                }
            }else  if(num3>num4) {
                return num3;
            }
            else{
                return num4;
            }

        }else if (num2>num3){
            if (num2>num4){
                return num2;
            }
            else
                return num4;
        }else if (num3>num4){
            return num3;
        }else
            return num4;
    }
}
