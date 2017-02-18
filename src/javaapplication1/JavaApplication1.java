package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) throws CantidadDeArgumentosException {
        
        if (args.length > 2)
            throw new CantidadDeArgumentosException();
        
        try{
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        
        float div = i/j;
        }catch(NumberFormatException e){
            System.out.println("Los dos valores deben ser numéricos");
        }
            
        }
        
    }
    

