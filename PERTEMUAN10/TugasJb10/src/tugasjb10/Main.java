package tugasjb10;
public class Main {
     public static void main(String[] args) {
        Singa sg = new Singa("Lion",4,"Rawr","Cokelat");
        sg.displayMakan();
        sg.displayBinatang();
        sg.displayData();
        
        Keledai kl = new Keledai("Miliya",4,"brr","Putih");
        kl.displayMakan();
        kl.displayBinatang();
        kl.displayData();
        
        Gorilla gr = new Gorilla("Beti",2,"hihi","Hitam");
        gr.displayMakan();
        gr.displayBinatang();
        gr.displayData();
    }
}
