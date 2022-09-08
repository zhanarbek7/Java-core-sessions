package zInnerClasses.cpu;

public class Main {
    public static void main(String[] args) {

        CPU cpu = new CPU();


        CPU.RAM ram = cpu.new RAM();

        System.out.println("Ram Clock speed = " + ram.getClockSpeed());

    }



}
