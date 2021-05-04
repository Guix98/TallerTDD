package org.example;

public class Ascensor {
    private  final int LIMITE = 3;
    private int[] edificio = {1,0,0};

    public int crearPersona() throws Exception {
        int p= (int) (Math.random()*2 + 1);
        System.out.println("Persona esperando en el piso: "+p);
        System.out.println(verificar(p));
        return p;
    }
    //La función a continiuación solo requiere que se proporcione el piso destino,
    // ya que el origen se crea aleatoriamente

    public String usarAscensor(int d) throws Exception {
        int p =crearPersona();
        comparar(p,d);
        System.out.println(verificar(p));


        if (d<1||d>3){
            throw new Exception("Fuera de Rango");
        }
        String s = "Dirigirse al piso "+d+" y abrir la puerta";
        cambiarEdificio(1);
        return s;

    }

    public String verificar(int p)throws Exception {
        if (p<1||p>3){
            throw new Exception("Fuera de Rango");
        }
        for (int i=0; i<edificio.length; i++){
            if (p == i+1 && edificio[i]==1){
               return "Abrir Puerta";
            }

        }
        cambiarEdificio(p);

        return "Dirijirse al piso "+p+" y abrir puerta";
    }


     public void cambiarEdificio(int p){
         switch (p){
             case 1:
                 edificio[0]=1;
                 edificio[1]=0;
                 edificio[2]=0;
                 break;
             case 2:
                 edificio[0]=0;
                 edificio[1]=1;
                 edificio[2]=0;
                 break;
             case 3:
                 edificio[0]=0;
                 edificio[1]=0;
                 edificio[2]=1;
                 break;
         }
     }
     public void comparar(int p, int d) throws Exception {
         if (p==d){
             throw new Exception("Origen igual a destino");
         }
     }

}