import java.util.Scanner;

public class CalculoDeBaskara {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = leitor.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = leitor.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = leitor.nextDouble();

        double delta = (b * b) - (4 * a * c);
        
        if (delta < 0) {
            System.out.print("A equação não possui raízes reais.");

        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.print("A equação possui uma única raíz: x = " + x);

        } else {
            double raizDelta = Math.sqrt(delta);
            double x1 = (-b + raizDelta) / (2 * a);
            double x2 = (-b - raizDelta) / (2 * a);
            System.out.println("A equação possui duas raízes:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2); 
        }
    }
}