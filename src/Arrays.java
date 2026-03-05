public class Arrays {
    public int[]numbs;
    public Astronaut[]  astro;
    public static void main(String[] args) {
        System.out.println("welcome to awesome arrays");
        new Arrays();


    }
    public Arrays(){




        numbs=new int[100];
        Astronaut A1 =new Astronaut();
        astro=new Astronaut[7];
        astro[4]=new Astronaut();

        for(int y=0;y<numbs.length; y++){
            numbs[y]=(int)(Math.random()*1834)+1;


        }
        astro[4].eyes=12;
        astro[4].name="gerald";
        System.out.println(astro[4].name);

        displayArray();
        summary();
        averageNum();
        MaxNum();
        MinNum();

        A1.primtInfo();



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
