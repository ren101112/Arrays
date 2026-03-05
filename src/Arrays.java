public class Arrays {
    public int[]numbs;
    public static void main(String[] args) {
        System.out.println("welcome to awesome arrays");
        new Arrays();


    }
    public Arrays(){

        numbs=new int[100];

        for(int y=0;y<numbs.length; y++){
            numbs[y]=(int)(Math.random()*1834)+1;


        }

        displayArray();
        summary();
        averageNum();
        MaxNum();
        MinNum();



    }
    public void displayArray(){
        for (int x=0;x<numbs.length;x++) {
            System.out.println(numbs[x]);
        }

    }

    public void summary(){


        System.out.println(numbs.clone());



    }

    public void averageNum(){
        System.out.println(java.util.Arrays.stream(numbs).average());


    }
    public void MaxNum(){
        System.out.println(java.util.Arrays.stream(numbs).max());


    }
    public void MinNum(){
        System.out.println(java.util.Arrays.stream(numbs).min());

    }
}
