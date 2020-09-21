package C2F2;

import java.util.Scanner;
public class B_VectorUserPass {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        //Array literal
        String [] vectorUser = new String [] {"Daiana","Facundo","Osvaldo","Melina"};
        String [] vectorPass = new String []{"1234","4321","1122","3344"};
        String user;
        String password;

        System.out.println("***************************************");
        System.out.println("LOGUIN"                        );
        System.out.print("Usuario:");
        user = input.nextLine();
        System.out.print("Contraseña:");
        password  = input.nextLine();
        System.out.println("***************************************");

        for(int i=0;i<=3;i++){
            if(user.equals(vectorUser[i]) && password.equals(vectorPass[i])){
                System.out.println("Bienvenido/a!");
            }
        }
    }

}
