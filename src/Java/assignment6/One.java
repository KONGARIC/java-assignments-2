package Java.assignment6;

class VampireNumber {
    Boolean isVampireNumber = false;

    //converting the array to two equal parts and finding the vampire number
    Boolean checkVampireNumber(int[] arr, int inputNumber) {
        int firstPart=0;
        int secondPart=0;
        int index;

        for (index=0;index<(arr.length)/2;index++)
            firstPart+=arr[index]*Math.pow(10,(arr.length)/2-index-1);

        for (index=(arr.length)/2;index<arr.length;index++)
            secondPart+=arr[index]*Math.pow(10,(arr.length-index-1));

        return (firstPart * secondPart) == inputNumber;
    }

    //finds all the permutations of the given input array and returns to the checkVampireNumber method.
    void possiblePermutaions(int[] arr,int index,int number) {

        if (index>=arr.length-1) {
            if (this.checkVampireNumber(arr,number))
                isVampireNumber=true;
        }

        for (int i=index;i<arr.length;i++) {
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            possiblePermutaions(arr,index+1,number);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}

public class One {

    public static void main(String[] args) {
        VampireNumber vampire = new VampireNumber();
        int number = 1260; //it is first Vampire Number.
        int counter = 0;
        while (counter < 100)
        {
            //int length=String.valueOf(number).length();
            if (((int) (Math.log10(number)+1))%2==0)
            {
                int[] numbersArray=splitNumbersIntoArray(number);
                vampire.possiblePermutaions(numbersArray,0,number);

                if (vampire.isVampireNumber)
                {
                    System.out.println(number);
                    counter++;
                    vampire.isVampireNumber=false;
                }
            }
            number++;
        }
    }

    public static int[] splitNumbersIntoArray(int inputNumber) {

        int length=(int)(Math.log10(inputNumber)+1);
        int[] numbersArray=new int[length];
        int remainder;
        int index=0;

        while (inputNumber!=0) {
            remainder=inputNumber%10;
            numbersArray[index]=remainder;
            inputNumber/=10;
            index++;
        }
        return numbersArray;
    }
}