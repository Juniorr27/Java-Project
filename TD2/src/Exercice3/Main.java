

package Exercice3;

public class Main {
   public static void main(String[] args) {
         
        Vecteur3D v1 = new Vecteur3D(1, 2, 3);
        Vecteur3D v2 = new Vecteur3D(4, 5, 6);

        // Calcul du produit scalaire
        double produitScalaire = Vecteur3D.produitScalaire(v1, v2);
        System.out.println("Produit scalaire : " + produitScalaire);
        // Calcul de la somme
        Vecteur3D somme = Vecteur3D.somme(v1, v2);
        System.out.println("Somme : " + somme);

        // Calcul du produit vectoriel
        Vecteur3D produitVectoriel = Vecteur3D.produitVectoriel(v1, v2);
        System.out.println("Produit vectoriel : " + produitVectoriel);
    }
   } 
  
