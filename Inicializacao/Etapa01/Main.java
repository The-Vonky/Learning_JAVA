public class Main{
    public static void main(String[] args) {
        Pessoa obj1 = new Pessoa("Deywid", 19);
        //String obj2 = new Pessoa();

        System.out.println(obj1.nome);
        Pessoa obj2 = obj1;

        System.out.println(obj2.nome);
        obj1 = null;
        obj2 = null;
        System.out.println(obj2);
    }
}