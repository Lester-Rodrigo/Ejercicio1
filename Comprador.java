public class Comprador {
   private String nombre;
   private String email;
   private int presupuesto;
   private int can_boletos;
   
   public Comprador(String nombre, String email, int presupuesto, int can_boletos){
    this.nombre = nombre;
    this.email = email;
    this.presupuesto = presupuesto;
    this.can_boletos = can_boletos;
   }

   public String getNombre(){
    return nombre;
   }

   public String getEmail(){
    return email;
   }

   public int getPresupuesto(){
    return presupuesto;
   }

   public int getCan_boletos(){
    return can_boletos;
   }

   public void setNombre (String nombre){
        this.nombre = nombre;
   }

   public void setEmail (String email){
        this.email = email;
   }

   public void setPresupuesto (int presupuesto){
      this.presupuesto = presupuesto;
    }

    public void setCan_boletos (int can_boletos){
      this.can_boletos = can_boletos;
    }
}
