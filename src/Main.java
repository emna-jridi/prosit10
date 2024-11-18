public class Main {
    public static void main(String[] args) {

        Departement d1 = new Departement(1,"it", 20);
        Departement d2 = new Departement(2,"it", 20);
DepartementHashSet dep = new DepartementHashSet();
dep.ajouterDepartement(d1);
dep.ajouterDepartement(d2);
dep.displayDepartement();
        System.out.println("+++++");
        String p = "it";
        System.out.println(dep.rechercherDepartement(d1));
        System.out.println("+++++");
        System.out.println(dep.trierDepartementById());


    }
}