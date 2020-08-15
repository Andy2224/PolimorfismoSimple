
package polimorfismo_simple;

/**
 *
 * @author Andrés Mogollón
 */
    class Motor{
        public void Combustible(){
            System.out.println("Combustión");
        }
    }
    class Gasolina extends Motor{
        public void Combustible(){
            System.out.println("Gasolina");
        }
    }
    class Diesel extends Motor{
        public void Combustible (){
            System.out.println("Diésel");
        }
    }
    class GNC extends Motor{
        public void Combustible (){
            System.out.println("Gas Natural Comprimido");
        }
    }
    class GLP extends Motor{
        public void Combustible(){
            System.out.println("Gas Licuado del Petróleo");

            }
        }

public class Polimorfismo_Simple {

    public static void main(String[] args) {
        Motor comb=new Gasolina();
        Motor comb1=new Diesel();
        Motor comb2=new GNC();
        Motor comb3=new GLP();

        System.out.println("\t\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("\t\t\t\t    SEDE LATACUNGA");
        System.out.println("Nombre:Andrés Mogollón S.");
        System.out.println("Materia:Programación");
        System.out.println("NRC: 7450");
        System.out.println("\t\t\t\tPolimorfismo\n");

        System.out.println("Tipo de motor: Motor de Gasolina");
        System.out.println("Su combustible es:");
        comb.Combustible();

        System.out.println("Tipo de motor: Motor Diésel");
        System.out.println("Su combustible es:");
        comb1.Combustible();

        System.out.println("Tipo de motor: Motor GNC");
        System.out.println("Su combustible es:");
        comb2.Combustible();

        System.out.println("Tipo de motor:Motor GLP");
        System.out.println("Su combustible es:");
        comb3.Combustible();

    }

}
