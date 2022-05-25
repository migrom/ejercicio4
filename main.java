public class main {
    public static void main(String[] datos){
        Cliente cliente = new Cliente();

        cliente.setEdad(51);
        cliente.setNombre("Miguel Angel");
        cliente.setTelefono("+34696558745");
        cliente.setCredito((float) 15000.52);

        System.out.println("edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());

        Trabajador Trabajador = new Trabajador();

        Trabajador.setEdad(51);
        Trabajador.setNombre("Miguel Angel");
        Trabajador.setTelefono("+34696558745");
        Trabajador.setSalario((float) 115000.52);

        System.out.println("edad: " + Trabajador.getEdad());
        System.out.println("Nombre: " + Trabajador.getNombre());
        System.out.println("Telefono: " + Trabajador.getTelefono());
        System.out.println("Salario: " + Trabajador.getSalario());
    }
}
    abstract class Persona {
        private int age;
        private String name;
        private String phone;

        public Persona(){
            System.out.println("Estoy en el constructor Persona");
        }

        public void setEdad(int edad){
            this.age = edad;
        }

        public void setNombre(String nombre){
            this.name = nombre;
        }

        public void setTelefono(String telefono){
            this.phone = telefono;
        }

        public int getEdad(){
            return this.age;
        }

        public String getNombre(){
            return this.name;
        }

        public String getTelefono(){
            return this.phone;
        }
    }
    class Cliente extends Persona{
        private float credit;

        public void Cliente() {

        }
        public float getCredito(){
            return this.credit;
        }
        public void setCredito(float credito){
            this.credit = credito;
        }
    }

    class Trabajador extends Persona{
        private float salario;

        public void Trabajador() {

        }
        public float getSalario(){
            return this.salario;
        }
        public void setSalario(float salario){
            this.salario = salario;
        }
    }


