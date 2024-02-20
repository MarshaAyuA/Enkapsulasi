
package enkapsulasi_user;


public class User {
     
    private String username;
    private String password;
    private int id;
    private boolean status; //true : menikah,false ; bm 
    private String Int;
    private String Status;
    
    //id = 0
    //status = false

    public User(String username, String password, int id, boolean status){   //constructor
        this.username = username;
        this.password = password;
        this.id = id;
        this.status = status;
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setId(int id) {
        this.id = id;
    }
     public String getId() {
        return Int;
    }
      public void setStatus(String Status) {
        this.Status = Status;
    }
     public String getStatus() {
        return Status;
    }

    
    
    
     
    }
    
    

