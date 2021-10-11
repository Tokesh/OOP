
class Bank{
    private String bankName;
    private Client[] clients = new Client[100];
    private BankAccount[] accounts = new BankAccount[100];
    private int clientnum;
    private int accountsnum;
    Bank(String name){
        this.bankName = name;
        clientnum = 0;
        accountsnum = 0;
    }
    public void createAccount(BankAccount account){
        accounts[accountsnum++] = account;
    }
    public void createClient(Client clientt){
        clients[clientnum++] =clientt;
    }
    public String makeReport(){
        return ("Bank name " + bankName + "\n" + "Clients number: " + clientnum + "\n" + "Accounts number: " + accountsnum);
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    private int countClient(){
        return clientnum;
    }
    private int countAccounts(){
        return accountsnum;
    }
}

class BankAccount{
    private String number;
    private String status;
    private Client owner;
    BankAccount(String number , String status, Client owner){
        this.number =number;
        this.status = status;
        this.owner = owner;
    }
    public String getNumber() {
        return number;
    }
    public String getStatus() {
        return status;
    }
    public Client getOwner() {
        return owner;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}

class Client{
    private String name;
    private String phone;
    private String ID;
    Client(String name, String phone, String ID){
        this.name = name;
        this.phone = phone;
        this.ID=ID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getID(){
        return ID;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

}



public class week6 {
    public static void main(String args[]){
        Client zxc = new Client("Vok", "777", "202");
        BankAccount num1 = new BankAccount( "2024", "available", zxc);
        Bank nur = new Bank("NurBank");
        nur.createAccount(num1);
        nur.createClient(zxc);
        System.out.println(nur.makeReport());
    }
    
}
