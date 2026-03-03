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



    }
    public void displayArray(){
        for (int x=0;x<numbs.length;x++) {
            System.out.println(numbs[x]);
        }

    }

    public void summary(){


        System.out.println(numbs.clone());



    }
}
