
package enkapsulasi_user;

public class Enkapsulasi_User {


    public static void main(String[] args) {
        User arnelita = new User ("APA", "OPO",4,true);
        
        arnelita.setUsername("arnelita");
        arnelita.setPassword("Matcha");
        arnelita.setId(4);
        String menikah = null;
        arnelita.setStatus(menikah);
        
        System.out.println("Username : "+arnelita.getUsername());
         System.out.println("Password : "+arnelita.getPassword());
         System.out.println("Int id : "+arnelita.getId());
         System.out.println("Status :"+arnelita.getStatus());
    }
    }
    

