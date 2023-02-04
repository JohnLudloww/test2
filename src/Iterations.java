public class Iterations {
    public static void main(String[] args)
    {
        //infinite loop
        //int count = 0;
       // while(count < 10)
       // {
        //    System.out.println("Count: " + count);
       // }

        int count = 0;
        do {
            System.out.println("Count: " + count++);
        } while (count < 5);
        do {
            System.out.println("Counter is at max: " + count);
        } while(count < 5);

    for(int i = 0; i < 5; i++)
    {
        System.out.println("count: " + i);
    }


    //enhanced for loop
        //3 + 3 = 6
        int[] arr = {1, 2, 3,};
        int sum = 0;
        for (int number : arr){
            sum += number;
            System.out.println("Number: " + number);
        }
        System.out.println("Sum: " + sum);

        //nested loop
        for (int i = 0; i < 5; i++)
        {
            System.out.println("**** i = ");
            for (int j = 0; j < 3; j++){
                System.out.println(j + "\t");
            }
            System.out.println();
        }

    // jump statements (need to practice)
        for (int i = 0; i < 5; i++)
        {
            if(i % 2 == 0)
            {
                break;
            }
            System.out.println("Counter: " + i);
        }
            //Labels
        loop1: for (int i = 0; i < 5; i++){
            System.out.println("Counter i: " + i);
            loop2: for (int j = 0; j < 5; j++)
            {
                System.out.println(j);
                if (j >= 0 && j < 3){
                    System.out.println("Continue loop");
                    continue loop2;
                } else {
                    System.out.println("Break loop1");
                    break loop1;
                }
            }
        }
    }
}
