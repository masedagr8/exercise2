public class Main {
    public static void main(String[] args) {
        int[] temp = {45,29,10,22,41,28,33};
        int[] prob ={95,60,25,5,0,75,90};
        String[] day={"sunday","monday","tuesday","wedesday","thursday","friday","saturday"};
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < 33 && prob[i] > 40)
                System.out.println("it will likly snow on "+day[i]);



        }

    }
}