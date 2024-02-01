package Modifier;   

class person {
    public String name;
    private String username;
    private String password;

        public void setName(String name){
            this.name = name;
        }
    
        public String getName(){
            return this.name;
        }

        public person (){
            System.out.println("eksekusi method constructor...");
        }
}
