
package Exercice3;


public class Vecteur3D {
    private double x;
    private double y;
    private double z;
    /*
    public Vecteur3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }*/
    public Vecteur3D(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
}


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vecteur3D(" + "x=" + x + ", y=" + y + ", z=" + z + ')';
    }@Override
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Vecteur3D other = (Vecteur3D) obj;
    return Double.compare(other.x, x) == 0 && Double.compare(other.y, y) == 0 && Double.compare(other.z, z) == 0;
}   /*Lorsque vous appelez la méthode recopie(v2) sur une des boîtes
    (un objet Vecteur3D), vous ouvrez cette boîte spécifique et copiez 
    les jouets (valeurs des attributs) 
    de la boîte v2 dans les compartiments correspondants de votre boîte.
    Par exemple, si la boîte v2 a un jouet bleu dans le premier compartiment, 
    vous le mettez également dans le premier compartiment de votre boîte.

    En d'autres termes, la méthode recopie() prend les valeurs des attributs 
    de la boîte v2 et les met dans les attributs de votre propre boîte. 
    Cela signifie que votre boîte (votre objet Vecteur3D) aura désormais 
    les mêmes valeurs que la boîte v2.*/
    public void recopie(Vecteur3D v2) {
        this.x = v2.getX(); // Copie la valeur de x de v2 dans l'attribut x de l'objet actuel
        this.y = v2.getY(); // Copie la valeur de y de v2 dans l'attribut y de l'objet actuel
        this.z = v2.getZ(); // Copie la valeur de z de v2 dans l'attribut z de l'objet actuel
    }   
    /*La méthode clone() sera utilisée pour créer une nouvelle instance 
    de la classe, alors que recopie(Vecteur3D v2) copie les valeurs
    d'un objet dans un autre objet déjà existant.
    En résumé, bien que le processus de copie des valeurs d'attributs 
    puisse être similaire entre les deux méthodes,
    la façon dont elles sont utilisées et leur objectif final diffèrent.*/
    public Vecteur3D clone(){
        double x = this.x; // Utilisez this.x pour accéder à l'attribut de l'objet actuel
        double y = this.y; // Utilisez this.y pour accéder à l'attribut de l'objet actuel
        double z = this.z; // Utilisez this.z pour accéder à l'attribut de l'objet actuel
        return new Vecteur3D(x, y, z); // Créez et retournez une nouvelle instance avec les mêmes valeurs
    }
    public double produitScalaire(Vecteur3D v3){
        return  this.x * v3.x + this.y * v3.y + this.z * v3.z;
    }
    /*Vous ne pouvez pas simplement ajouter les composantes 
�
    x,y et z des deux vecteurs et retourner la somme. Au lieu de cela, vous devez 
    créer un nouveau vecteur dont les composantes x, y et z sont 
    la somme des composantes correspondantes des deux vecteurs.*/
    public Vecteur3D somme(Vecteur3D v4){
        double newX = this.x + v4.x ;
        double newY = this.y + v4.y;
        double newZ = this.z + v4.z;
        return new Vecteur3D(newX,newY,newZ) ;
    }
     public static double produitScalaire(Vecteur3D v1, Vecteur3D v3){
         return  v1.x * v3.x + v1.y * v3.y + v1.z * v3.z;
     }
     public static Vecteur3D somme( Vecteur3D v1, Vecteur3D v4){
        double newX = v1.x + v4.x ;
        double newY = v1.y + v4.y;
        double newZ = v1.z + v4.z;
        return new Vecteur3D(newX,newY,newZ);
     }
     public static Vecteur3D produitVectoriel(Vecteur3D v1, Vecteur3D v2) {
        double newX = v1.y * v2.z - v1.z * v2.y;
        double newY = v1.z * v2.x - v1.x * v2.z;
        double newZ = v1.x * v2.y - v1.y * v2.x;
        return new Vecteur3D(newX, newY, newZ);
    }
       
}
