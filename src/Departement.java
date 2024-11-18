public class Departement  implements Comparable<Departement>{
    private  int id ;
    private  String nom ;
    private int nbr_employees ;
    public Departement() {
    }
    public Departement(int id,String nom, int nbr_employees) {
        this.id = id;
            this.nom = nom;
            this.nbr_employees = nbr_employees;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbr_employees() {
        return nbr_employees;
    }

    public void setNbr_employees(int nbr_employees) {
        this.nbr_employees = nbr_employees;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj == null) return false;
        if(obj instanceof Departement d){
            return ((Departement) obj).id == d.id && ((Departement) obj).nom.equals(d.nom);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbr_employees=" + nbr_employees +
                '}';
    }

    @Override
    public int compareTo(Departement o) {
        return Integer.compare(this.id, o.id); // Tri par id
    }
}
