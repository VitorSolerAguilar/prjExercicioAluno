
import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Aplic {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner s = new Scanner(System.in);
        
        double ntPrv1, ntPrv2, ntTrab1, ntTrab2;
        
        System.out.print("Digite a nota da prova da 1° prova: ");
        ntPrv1 = s.nextDouble();
        aluno.setNtPrv1(ntPrv1);
        
        System.out.print("Digite a nota da prova da 2° prova: ");
        ntPrv2 = s.nextDouble();
        aluno.setNtPrv2(ntPrv2);
        
        System.out.print("Digite a nota do 1° trabalho:       ");
        ntTrab1 = s.nextDouble();
        aluno.setNtTrab1(ntTrab1);
        
        System.out.print("Digite a nota do 2° trabalho:       ");
        ntTrab2 = s.nextDouble();
        aluno.setNtTrab2(ntTrab2);
        
        System.out.println("----------------------------------------");
        System.out.println("Nota media das provas:     " + aluno.calcMediaProva());
        System.out.println("Nota media dos trabalhos:  " + aluno.calcMediaTrab());
        System.out.println("Nota final:                " + aluno.calcMediaFinal());
    }    
}
