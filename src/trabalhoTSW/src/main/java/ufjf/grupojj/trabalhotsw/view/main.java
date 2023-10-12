/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.grupojj.trabalhotsw.view;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author joaop
 */
public class main {
    
    //Verifica se o jogo acabou
    public static boolean verificaFim(int peixes_b)
    {
        if(peixes_b <= 0)
        {
            return false;
        }
        
        do {
            try {
                System.out.println();
                System.out.println("Deseja finalizar o jogo?");
                System.out.println("1 - sim");
                
                Scanner sc = new Scanner(System.in);
                int op = sc.nextInt();
                
                if(op == 1)
                {
                    return false;  
                }else 
                    return true;
                
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido!");
            }
        } while(true);
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean ativo = true;   //se jogo estiver acontecendo = treu caso acabe = false
        
        int dim_x = 0;          //quantidade de linhas do aquario
        int dim_y = 0;          //quantidade de colunas do aquario
        
        int peixes_a = 0;       //quantidade de peixes do tipo A
        int ra = 0;             //movimentos para criar filho
        int ma = 0;             //movimentos para morrer de fome
        
        int peixes_b = 0;       //quantidade de peixes do tipo A
        int rb = 0;             //quantidade de peixes comidos para criar filho
        int mb = 0;             //movimentos para morrer de fome 
        
        try {
            System.out.println("Tamanho do aquario: (NxM)");
            dim_x = sc.nextInt();
            dim_y = sc.nextInt();

            if(dim_x < 0 || dim_y < 0) {
                throw new NegativeValueException();
            }
            
            System.out.println("Quantidade de peixes de tipo A:");
            peixes_a = sc.nextInt();
            ra = sc.nextInt();          
            ma = sc.nextInt();

            if(peixes_a < 0 || ra < 0 || ma < 0) {
                throw new NegativeValueException();
            }
            
            System.out.println("Quantidade de peixes de tipo B:");
            peixes_b = sc.nextInt();
            rb = sc.nextInt();
            mb = sc.nextInt();

            if(peixes_b < 0 || rb < 0 || mb < 0) {
                throw new NegativeValueException();
            }

        } catch(NegativeValueException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        Aquario aquario = new Aquario(dim_x, dim_y, ra, rb, ma, mb);
        aquario.inicializar(peixes_a, peixes_b);
        
        int rodadas = 1;
        while(ativo)
        {
            System.out.println("------------------------Rodada " + rodadas + " -------------------------------");
            aquario.printAquario();

            aquario.atualizarAquario();
            aquario.printAquario();
            
            rodadas++;
            
            
            ativo = verificaFim(peixes_b);
        }
        
        
    }
}
