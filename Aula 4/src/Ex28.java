import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o verbo no infinitivo: ");
        String letra = sc.nextLine();
        String sala = "";

        letra = letra.substring(0, 1);

        switch (letra) {
            case "a":
                sala = "D1";
                break;
            case "b":
                sala = "D1";
                break;    
            case "c":
                sala = "D1";
                break;
            case "d":
                sala = "D1";
                break; 
            case "e":
                sala = "D1";
                break;
            case "f":
                sala = "D1";
                break;    
            case "g":
                sala = "D1";
                break;
            case "h":
                sala = "D1";
                    break;
            case "j":
                sala = "D1";
                break;
            case "k":
                sala = "D1";
                break;    
            case "l":
                sala = "D2";
                break;
            case "m":
                sala = "D2";
                break; 
            case "n":
                sala = "D2";
                break;
            case "o":
                sala = "D3";
                break;    
            case "p":
                sala = "D3";
                break;
            case "q":
                sala = "D3";
                break;
            case "r":
                sala = "D3";
                break;    
            case "s":
                sala = "D3";
                break;
            case "t":
                sala = "D3";
                    break;
            case "u":
                sala = "D3";
                break;
            case "v":
                sala = "D3";
                break;    
            case "x":
                sala = "D3";
                break;
            case "w":
                sala = "D3";
                break; 
            case "y":
                sala = "D3";
                break;
            case "z":
                sala = "D3";
                break;    
        
            default:
                break;
        }

        System.out.println("A sala do aluno é: " + sala);
        sc.close();
    }
}