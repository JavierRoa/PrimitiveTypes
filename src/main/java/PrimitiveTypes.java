public class PrimitiveTypes {
    public static void main(String[] args) {
        System.out.println("El rango de valores de un byte es entre: " + Byte.MIN_VALUE + " y " + Byte.MAX_VALUE);
        System.out.println("El rango de valores de un short es entre: " + Short.MIN_VALUE + " y " + Short.MAX_VALUE);
        System.out.println("El rango de valores de un int es entre: " + Integer.MIN_VALUE + " y " + Integer.MAX_VALUE);
        System.out.println("El rango de valores de un long es entre: " + Long.MIN_VALUE + " y " + Long.MAX_VALUE);

        byte valorByte = 127;
        short valorShort = -32768;
        int valorInt = 2147483647;

        System.out.println("valorByte = " + valorByte);
        System.out.println("valorShort = " + valorShort);
        System.out.println("valorInt = " + valorInt);

        long sumaTotal = 50000 + ((valorByte + valorShort + valorInt) * 10L);

        System.out.println("La suma total es: " + sumaTotal);

    }
}
